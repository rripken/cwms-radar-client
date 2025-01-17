package mil.army.usace.hec.cwms.http.client;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mil.army.usace.hec.cwms.http.client.auth.OAuth2Token;
import mil.army.usace.hec.cwms.http.client.auth.OAuth2TokenProvider;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

final class OAuth2TokenAuthenticator implements Authenticator {

    private static final Logger LOGGER = Logger.getLogger(OAuth2TokenAuthenticator.class.getName());
    static final String AUTHORIZATION_HEADER = "Authorization";
    private final OAuth2TokenProvider tokenProvider;

    OAuth2TokenAuthenticator(OAuth2TokenProvider tokenProvider) {
        this.tokenProvider = tokenProvider;
    }

    @Override
    public synchronized Request authenticate(Route route, Response response) throws IOException {
        OAuth2Token token = tokenProvider.getToken();
        if (token == null) {
            throw new IOException("Attempt to refresh token failed: No token retrieved from " + OAuth2TokenProvider.class.getName());
        }
        // Check if the request made was made as an authenticated request.
        if (response.request().header(AUTHORIZATION_HEADER) == null) {
            throw new IOException("Cannot refresh authentication token due to missing " + AUTHORIZATION_HEADER + " header");
        }
        //refresh the token
        LOGGER.log(Level.FINE, "Refreshing OAuth2 Token");
        OAuth2Token updatedToken = tokenProvider.refreshToken();
        String accessToken = updatedToken.getAccessToken();
        if (accessToken == null || accessToken.isEmpty()) {
            throw new IOException("No access token present in refreshed authentication token");
        }
        LOGGER.log(Level.FINE, "OAuth2 Token refreshed");
        // Retry the request with the new token.
        return response.request()
            .newBuilder()
            .removeHeader(AUTHORIZATION_HEADER)
            .addHeader(AUTHORIZATION_HEADER, "Bearer " + updatedToken.getAccessToken())
            .build();
    }
}
