/*
 * MIT License
 *
 * Copyright (c) 2021 Hydrologic Engineering Center
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package mil.army.usace.hec.cwms.radar.client.controllers;

import java.util.Objects;
import mil.army.usace.hec.cwms.http.client.EndpointInput;
import mil.army.usace.hec.cwms.http.client.HttpRequestBuilder;


public class LocationEndPointInput extends EndpointInput {

    static final String OFFICE_QUERY_PARAMETER = "office";
    static final String NAME_QUERY_PARAMETER = "name";
    static final String UNIT_QUERY_PARAMETER = "unit";

    private final String locationName;
    private String officeId;
    private String unit;

    public LocationEndPointInput(String locationName) {
        this.locationName = Objects.requireNonNull(locationName, "Cannot access the location endpoint without a location name");
    }

    public LocationEndPointInput officeId(String officeId) {
        this.officeId = officeId;
        return this;
    }

    public LocationEndPointInput unit(String unit) {
        this.unit = unit;
        return this;
    }

    @Override
    protected HttpRequestBuilder addInputParameters(HttpRequestBuilder httpRequestBuilder) {
        return httpRequestBuilder.addQueryParameter(NAME_QUERY_PARAMETER, locationName)
            .addQueryParameter(OFFICE_QUERY_PARAMETER, officeId)
            .addQueryParameter(UNIT_QUERY_PARAMETER, unit)
            .addQueryHeader(ACCEPT_QUERY_HEADER, "application/json;version=2");
    }
}