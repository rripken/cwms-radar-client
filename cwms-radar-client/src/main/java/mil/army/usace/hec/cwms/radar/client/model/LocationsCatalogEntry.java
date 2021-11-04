/*
 * Copyright (c) 2021
 * United States Army Corps of Engineers - Hydrologic Engineering Center (USACE/HEC)
 * All Rights Reserved.  USACE PROPRIETARY/CONFIDENTIAL.
 * Source may not be released without written approval from HEC
 */

package mil.army.usace.hec.cwms.radar.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;

/**
 * CatalogEntry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-11-02T12:25:34.578-07:00[America/Los_Angeles]")
public class LocationsCatalogEntry {
    @JsonProperty("office")
    private final String office = null;

    @JsonProperty("name")
    private final String name = null;

    @JsonProperty("nearestCity")
    private final String nearestCity = null;

    @JsonProperty("publicName")
    private final String publicName = null;

    @JsonProperty("longName")
    private final String longName = null;

    @JsonProperty("description")
    private final String description = null;

    @JsonProperty("kind")
    private final String kind = null;

    @JsonProperty("type")
    private final String type = null;

    @JsonProperty("timeZone")
    private final String timeZone = null;

    @JsonProperty("latitude")
    private final Double latitude = null;

    @JsonProperty("longitude")
    private final Double longitude = null;

    @JsonProperty("publishedLatitude")
    private final Double publishedLatitude = null;

    @JsonProperty("publishedLongitude")
    private final Double publishedLongitude = null;

    @JsonProperty("horizontalDatum")
    private final String horizontalDatum = null;

    @JsonProperty("elevation")
    private final Double elevation = null;

    @JsonProperty("unit")
    private final String unit = null;

    @JsonProperty("verticalDatum")
    private final String verticalDatum = null;

    @JsonProperty("nation")
    private final String nation = null;

    @JsonProperty("state")
    private final String state = null;

    @JsonProperty("county")
    private final String county = null;

    @JsonProperty("boundingOffice")
    private final String boundingOffice = null;

    @JsonProperty("mapLabel")
    private final String mapLabel = null;

    @JsonProperty("active")
    private final Boolean active = null;

    @JsonProperty("aliases")
    @Valid
    private final List<LocationAlias> aliases = null;

    @JsonProperty("fullName")
    private final String fullName = null;

    /**
     * Get office
     *
     * @return office
     **/
    @ApiModelProperty(value = "")

    public String getOffice() {
        return office;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @ApiModelProperty(value = "")

    public String getName() {
        return name;
    }

    /**
     * Get nearestCity
     *
     * @return nearestCity
     **/
    @ApiModelProperty(value = "")

    public String getNearestCity() {
        return nearestCity;
    }

    /**
     * Get publicName
     *
     * @return publicName
     **/
    @ApiModelProperty(value = "")

    public String getPublicName() {
        return publicName;
    }

    /**
     * Get longName
     *
     * @return longName
     **/
    @ApiModelProperty(value = "")

    public String getLongName() {
        return longName;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @ApiModelProperty(value = "")

    public String getDescription() {
        return description;
    }

    /**
     * Get kind
     *
     * @return kind
     **/
    @ApiModelProperty(value = "")

    public String getKind() {
        return kind;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @ApiModelProperty(value = "")

    public String getType() {
        return type;
    }

    /**
     * Get timeZone
     *
     * @return timeZone
     **/
    @ApiModelProperty(value = "")

    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Get latitude
     *
     * @return latitude
     **/
    @ApiModelProperty(value = "")

    public Double getLatitude() {
        return latitude;
    }

    /**
     * Get longitude
     *
     * @return longitude
     **/
    @ApiModelProperty(value = "")

    public Double getLongitude() {
        return longitude;
    }

    /**
     * Get publishedLatitude
     *
     * @return publishedLatitude
     **/
    @ApiModelProperty(value = "")

    public Double getPublishedLatitude() {
        return publishedLatitude;
    }

    /**
     * Get publishedLongitude
     *
     * @return publishedLongitude
     **/
    @ApiModelProperty(value = "")

    public Double getPublishedLongitude() {
        return publishedLongitude;
    }

    /**
     * Get horizontalDatum
     *
     * @return horizontalDatum
     **/
    @ApiModelProperty(value = "")

    public String getHorizontalDatum() {
        return horizontalDatum;
    }

    /**
     * Get elevation
     *
     * @return elevation
     **/
    @ApiModelProperty(value = "")

    public Double getElevation() {
        return elevation;
    }

    /**
     * Get unit
     *
     * @return unit
     **/
    @ApiModelProperty(value = "")

    public String getUnit() {
        return unit;
    }

    /**
     * Get verticalDatum
     *
     * @return verticalDatum
     **/
    @ApiModelProperty(value = "")

    public String getVerticalDatum() {
        return verticalDatum;
    }

    /**
     * Get nation
     *
     * @return nation
     **/
    @ApiModelProperty(value = "")

    public String getNation() {
        return nation;
    }

    /**
     * Get state
     *
     * @return state
     **/
    @ApiModelProperty(value = "")

    public String getState() {
        return state;
    }

    /**
     * Get county
     *
     * @return county
     **/
    @ApiModelProperty(value = "")

    public String getCounty() {
        return county;
    }

    /**
     * Get boundingOffice
     *
     * @return boundingOffice
     **/
    @ApiModelProperty(value = "")

    public String getBoundingOffice() {
        return boundingOffice;
    }

    /**
     * Get mapLabel
     *
     * @return mapLabel
     **/
    @ApiModelProperty(value = "")

    public String getMapLabel() {
        return mapLabel;
    }

    /**
     * Get active
     *
     * @return active
     **/
    @ApiModelProperty(value = "")

    public Boolean isActive() {
        return active;
    }

    /**
     * Get aliases
     *
     * @return aliases
     **/
    @ApiModelProperty(value = "")
    @Valid
    public List<LocationAlias> getAliases() {
        return aliases;
    }

    /**
     * Get fullName
     *
     * @return fullName
     **/
    @ApiModelProperty(value = "")

    public String getFullName() {
        return fullName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LocationsCatalogEntry catalogEntry = (LocationsCatalogEntry) o;
        return Objects.equals(this.office, catalogEntry.office) &&
            Objects.equals(this.name, catalogEntry.name) &&
            Objects.equals(this.nearestCity, catalogEntry.nearestCity) &&
            Objects.equals(this.publicName, catalogEntry.publicName) &&
            Objects.equals(this.longName, catalogEntry.longName) &&
            Objects.equals(this.description, catalogEntry.description) &&
            Objects.equals(this.kind, catalogEntry.kind) &&
            Objects.equals(this.type, catalogEntry.type) &&
            Objects.equals(this.timeZone, catalogEntry.timeZone) &&
            Objects.equals(this.latitude, catalogEntry.latitude) &&
            Objects.equals(this.longitude, catalogEntry.longitude) &&
            Objects.equals(this.publishedLatitude, catalogEntry.publishedLatitude) &&
            Objects.equals(this.publishedLongitude, catalogEntry.publishedLongitude) &&
            Objects.equals(this.horizontalDatum, catalogEntry.horizontalDatum) &&
            Objects.equals(this.elevation, catalogEntry.elevation) &&
            Objects.equals(this.unit, catalogEntry.unit) &&
            Objects.equals(this.verticalDatum, catalogEntry.verticalDatum) &&
            Objects.equals(this.nation, catalogEntry.nation) &&
            Objects.equals(this.state, catalogEntry.state) &&
            Objects.equals(this.county, catalogEntry.county) &&
            Objects.equals(this.boundingOffice, catalogEntry.boundingOffice) &&
            Objects.equals(this.mapLabel, catalogEntry.mapLabel) &&
            Objects.equals(this.active, catalogEntry.active) &&
            Objects.equals(this.aliases, catalogEntry.aliases) &&
            Objects.equals(this.fullName, catalogEntry.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(office, name, nearestCity, publicName, longName, description, kind,
            type, timeZone, latitude, longitude, publishedLatitude, publishedLongitude,
            horizontalDatum, elevation, unit, verticalDatum, nation, state, county, boundingOffice,
            mapLabel, active, aliases, fullName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogEntry {\n");

        sb.append("    office: ").append(toIndentedString(office)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nearestCity: ").append(toIndentedString(nearestCity)).append("\n");
        sb.append("    publicName: ").append(toIndentedString(publicName)).append("\n");
        sb.append("    longName: ").append(toIndentedString(longName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    publishedLatitude: ").append(toIndentedString(publishedLatitude)).append("\n");
        sb.append("    publishedLongitude: ").append(toIndentedString(publishedLongitude)).append("\n");
        sb.append("    horizontalDatum: ").append(toIndentedString(horizontalDatum)).append("\n");
        sb.append("    elevation: ").append(toIndentedString(elevation)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    verticalDatum: ").append(toIndentedString(verticalDatum)).append("\n");
        sb.append("    nation: ").append(toIndentedString(nation)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    county: ").append(toIndentedString(county)).append("\n");
        sb.append("    boundingOffice: ").append(toIndentedString(boundingOffice)).append("\n");
        sb.append("    mapLabel: ").append(toIndentedString(mapLabel)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}