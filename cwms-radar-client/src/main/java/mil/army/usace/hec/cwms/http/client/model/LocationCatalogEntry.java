/*
 * Copyright (c) 2021
 * United States Army Corps of Engineers - Hydrologic Engineering Center (USACE/HEC)
 * All Rights Reserved.  USACE PROPRIETARY/CONFIDENTIAL.
 * Source may not be released without written approval from HEC
 */

package mil.army.usace.hec.cwms.http.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;

/**
 * LocationCatalogEntry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-11-02T12:25:34.578-07:00[America/Los_Angeles]")
public class LocationCatalogEntry {
    @JsonProperty("office")
    private String office = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("nearestCity")
    private String nearestCity = null;

    @JsonProperty("publicName")
    private String publicName = null;

    @JsonProperty("longName")
    private String longName = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("kind")
    private String kind = null;

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("timeZone")
    private String timeZone = null;

    @JsonProperty("latitude")
    private Double latitude = null;

    @JsonProperty("longitude")
    private Double longitude = null;

    @JsonProperty("publishedLatitude")
    private Double publishedLatitude = null;

    @JsonProperty("publishedLongitude")
    private Double publishedLongitude = null;

    @JsonProperty("horizontalDatum")
    private String horizontalDatum = null;

    @JsonProperty("elevation")
    private Double elevation = null;

    @JsonProperty("unit")
    private String unit = null;

    @JsonProperty("verticalDatum")
    private String verticalDatum = null;

    @JsonProperty("nation")
    private String nation = null;

    @JsonProperty("state")
    private String state = null;

    @JsonProperty("county")
    private String county = null;

    @JsonProperty("boundingOffice")
    private String boundingOffice = null;

    @JsonProperty("mapLabel")
    private String mapLabel = null;

    @JsonProperty("active")
    private Boolean active = null;

    @JsonProperty("aliases")
    @Valid
    private List<LocationAlias> aliases = null;

    public LocationCatalogEntry office(String office) {
        this.office = office;
        return this;
    }

    /**
     * Get office
     *
     * @return office
     **/
    @ApiModelProperty(value = "")

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public LocationCatalogEntry name(String name) {
        this.name = name;
        return this;
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

    public void setName(String name) {
        this.name = name;
    }

    public LocationCatalogEntry nearestCity(String nearestCity) {
        this.nearestCity = nearestCity;
        return this;
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

    public void setNearestCity(String nearestCity) {
        this.nearestCity = nearestCity;
    }

    public LocationCatalogEntry publicName(String publicName) {
        this.publicName = publicName;
        return this;
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

    public void setPublicName(String publicName) {
        this.publicName = publicName;
    }

    public LocationCatalogEntry longName(String longName) {
        this.longName = longName;
        return this;
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

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public LocationCatalogEntry description(String description) {
        this.description = description;
        return this;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public LocationCatalogEntry kind(String kind) {
        this.kind = kind;
        return this;
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

    public void setKind(String kind) {
        this.kind = kind;
    }

    public LocationCatalogEntry type(String type) {
        this.type = type;
        return this;
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

    public void setType(String type) {
        this.type = type;
    }

    public LocationCatalogEntry timeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
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

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public LocationCatalogEntry latitude(Double latitude) {
        this.latitude = latitude;
        return this;
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

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public LocationCatalogEntry longitude(Double longitude) {
        this.longitude = longitude;
        return this;
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

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public LocationCatalogEntry publishedLatitude(Double publishedLatitude) {
        this.publishedLatitude = publishedLatitude;
        return this;
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

    public void setPublishedLatitude(Double publishedLatitude) {
        this.publishedLatitude = publishedLatitude;
    }

    public LocationCatalogEntry publishedLongitude(Double publishedLongitude) {
        this.publishedLongitude = publishedLongitude;
        return this;
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

    public void setPublishedLongitude(Double publishedLongitude) {
        this.publishedLongitude = publishedLongitude;
    }

    public LocationCatalogEntry horizontalDatum(String horizontalDatum) {
        this.horizontalDatum = horizontalDatum;
        return this;
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

    public void setHorizontalDatum(String horizontalDatum) {
        this.horizontalDatum = horizontalDatum;
    }

    public LocationCatalogEntry elevation(Double elevation) {
        this.elevation = elevation;
        return this;
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

    public void setElevation(Double elevation) {
        this.elevation = elevation;
    }

    public LocationCatalogEntry unit(String unit) {
        this.unit = unit;
        return this;
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

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public LocationCatalogEntry verticalDatum(String verticalDatum) {
        this.verticalDatum = verticalDatum;
        return this;
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

    public void setVerticalDatum(String verticalDatum) {
        this.verticalDatum = verticalDatum;
    }

    public LocationCatalogEntry nation(String nation) {
        this.nation = nation;
        return this;
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

    public void setNation(String nation) {
        this.nation = nation;
    }

    public LocationCatalogEntry state(String state) {
        this.state = state;
        return this;
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

    public void setState(String state) {
        this.state = state;
    }

    public LocationCatalogEntry county(String county) {
        this.county = county;
        return this;
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

    public void setCounty(String county) {
        this.county = county;
    }

    public LocationCatalogEntry boundingOffice(String boundingOffice) {
        this.boundingOffice = boundingOffice;
        return this;
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

    public void setBoundingOffice(String boundingOffice) {
        this.boundingOffice = boundingOffice;
    }

    public LocationCatalogEntry mapLabel(String mapLabel) {
        this.mapLabel = mapLabel;
        return this;
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

    public void setMapLabel(String mapLabel) {
        this.mapLabel = mapLabel;
    }

    public LocationCatalogEntry active(Boolean active) {
        this.active = active;
        return this;
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

    public void setActive(Boolean active) {
        this.active = active;
    }

    public LocationCatalogEntry aliases(List<LocationAlias> aliases) {
        this.aliases = aliases;
        return this;
    }

    public LocationCatalogEntry addAliasesItem(LocationAlias aliasesItem) {
        if (this.aliases == null) {
            this.aliases = new ArrayList<LocationAlias>();
        }
        this.aliases.add(aliasesItem);
        return this;
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

    public void setAliases(List<LocationAlias> aliases) {
        this.aliases = aliases;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LocationCatalogEntry locationCatalogEntry = (LocationCatalogEntry) o;
        return Objects.equals(this.office, locationCatalogEntry.office) &&
            Objects.equals(this.name, locationCatalogEntry.name) &&
            Objects.equals(this.nearestCity, locationCatalogEntry.nearestCity) &&
            Objects.equals(this.publicName, locationCatalogEntry.publicName) &&
            Objects.equals(this.longName, locationCatalogEntry.longName) &&
            Objects.equals(this.description, locationCatalogEntry.description) &&
            Objects.equals(this.kind, locationCatalogEntry.kind) &&
            Objects.equals(this.type, locationCatalogEntry.type) &&
            Objects.equals(this.timeZone, locationCatalogEntry.timeZone) &&
            Objects.equals(this.latitude, locationCatalogEntry.latitude) &&
            Objects.equals(this.longitude, locationCatalogEntry.longitude) &&
            Objects.equals(this.publishedLatitude, locationCatalogEntry.publishedLatitude) &&
            Objects.equals(this.publishedLongitude, locationCatalogEntry.publishedLongitude) &&
            Objects.equals(this.horizontalDatum, locationCatalogEntry.horizontalDatum) &&
            Objects.equals(this.elevation, locationCatalogEntry.elevation) &&
            Objects.equals(this.unit, locationCatalogEntry.unit) &&
            Objects.equals(this.verticalDatum, locationCatalogEntry.verticalDatum) &&
            Objects.equals(this.nation, locationCatalogEntry.nation) &&
            Objects.equals(this.state, locationCatalogEntry.state) &&
            Objects.equals(this.county, locationCatalogEntry.county) &&
            Objects.equals(this.boundingOffice, locationCatalogEntry.boundingOffice) &&
            Objects.equals(this.mapLabel, locationCatalogEntry.mapLabel) &&
            Objects.equals(this.active, locationCatalogEntry.active) &&
            Objects.equals(this.aliases, locationCatalogEntry.aliases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(office, name, nearestCity, publicName, longName, description, kind,
            type, timeZone, latitude, longitude, publishedLatitude, publishedLongitude,
            horizontalDatum, elevation, unit, verticalDatum, nation, state, county, boundingOffice,
            mapLabel, active, aliases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationCatalogEntry {\n");

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
        sb.append("    publishedLatitude: ").append(toIndentedString(publishedLatitude))
            .append("\n");
        sb.append("    publishedLongitude: ").append(toIndentedString(publishedLongitude))
            .append("\n");
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
