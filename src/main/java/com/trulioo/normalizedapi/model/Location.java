/*
 * OnlineID.NormalizedAPI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.trulioo.normalizedapi.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.LocationAdditionalFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T15:36:47.107-07:00")
public class Location {
  @SerializedName("BuildingNumber")
  private String buildingNumber = null;

  @SerializedName("BuildingName")
  private String buildingName = null;

  @SerializedName("UnitNumber")
  private String unitNumber = null;

  @SerializedName("StreetName")
  private String streetName = null;

  @SerializedName("StreetType")
  private String streetType = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("Suburb")
  private String suburb = null;

  @SerializedName("County")
  private String county = null;

  @SerializedName("StateProvinceCode")
  private String stateProvinceCode = null;

  @SerializedName("Country")
  private String country = null;

  @SerializedName("PostalCode")
  private String postalCode = null;

  @SerializedName("POBox")
  private String poBox = null;

  @SerializedName("AdditionalFields")
  private LocationAdditionalFields additionalFields = null;

  public Location buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

   /**
   * House / Civic / Building number of home address
   * @return buildingNumber
  **/
  @ApiModelProperty(value = "House / Civic / Building number of home address")
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public Location buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

   /**
   * Name of building of home address
   * @return buildingName
  **/
  @ApiModelProperty(value = "Name of building of home address")
  public String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  public Location unitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
    return this;
  }

   /**
   * Flat/Unit/Apartment number of home address
   * @return unitNumber
  **/
  @ApiModelProperty(value = "Flat/Unit/Apartment number of home address")
  public String getUnitNumber() {
    return unitNumber;
  }

  public void setUnitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
  }

  public Location streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

   /**
   * Street name of primary residence
   * @return streetName
  **/
  @ApiModelProperty(value = "Street name of primary residence")
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public Location streetType(String streetType) {
    this.streetType = streetType;
    return this;
  }

   /**
   * Street type of primary residence (Typically St, Rd etc)
   * @return streetType
  **/
  @ApiModelProperty(value = "Street type of primary residence (Typically St, Rd etc)")
  public String getStreetType() {
    return streetType;
  }

  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }

  public Location city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City of home address
   * @return city
  **/
  @ApiModelProperty(value = "City of home address")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Location suburb(String suburb) {
    this.suburb = suburb;
    return this;
  }

   /**
   * Suburb / Subdivision / Municipality of home address
   * @return suburb
  **/
  @ApiModelProperty(value = "Suburb / Subdivision / Municipality of home address")
  public String getSuburb() {
    return suburb;
  }

  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }

  public Location county(String county) {
    this.county = county;
    return this;
  }

   /**
   * County / District of home address
   * @return county
  **/
  @ApiModelProperty(value = "County / District of home address")
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public Location stateProvinceCode(String stateProvinceCode) {
    this.stateProvinceCode = stateProvinceCode;
    return this;
  }

   /**
   * State of primary residence. US sources expect 2 characters. Australian sources expect 2 or 3 characters.
   * @return stateProvinceCode
  **/
  @ApiModelProperty(value = "State of primary residence. US sources expect 2 characters. Australian sources expect 2 or 3 characters.")
  public String getStateProvinceCode() {
    return stateProvinceCode;
  }

  public void setStateProvinceCode(String stateProvinceCode) {
    this.stateProvinceCode = stateProvinceCode;
  }

  public Location country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of physical address (ISO 3166-1 alpha-2 code)
   * @return country
  **/
  @ApiModelProperty(value = "Country of physical address (ISO 3166-1 alpha-2 code)")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Location postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * ZIP Code or Postal Code of home address
   * @return postalCode
  **/
  @ApiModelProperty(value = "ZIP Code or Postal Code of home address")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Location poBox(String poBox) {
    this.poBox = poBox;
    return this;
  }

   /**
   * Post Office Box
   * @return poBox
  **/
  @ApiModelProperty(value = "Post Office Box")
  public String getPoBox() {
    return poBox;
  }

  public void setPoBox(String poBox) {
    this.poBox = poBox;
  }

  public Location additionalFields(LocationAdditionalFields additionalFields) {
    this.additionalFields = additionalFields;
    return this;
  }

   /**
   * Fields not normally used
   * @return additionalFields
  **/
  @ApiModelProperty(value = "Fields not normally used")
  public LocationAdditionalFields getAdditionalFields() {
    return additionalFields;
  }

  public void setAdditionalFields(LocationAdditionalFields additionalFields) {
    this.additionalFields = additionalFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.buildingNumber, location.buildingNumber) &&
        Objects.equals(this.buildingName, location.buildingName) &&
        Objects.equals(this.unitNumber, location.unitNumber) &&
        Objects.equals(this.streetName, location.streetName) &&
        Objects.equals(this.streetType, location.streetType) &&
        Objects.equals(this.city, location.city) &&
        Objects.equals(this.suburb, location.suburb) &&
        Objects.equals(this.county, location.county) &&
        Objects.equals(this.stateProvinceCode, location.stateProvinceCode) &&
        Objects.equals(this.country, location.country) &&
        Objects.equals(this.postalCode, location.postalCode) &&
        Objects.equals(this.poBox, location.poBox) &&
        Objects.equals(this.additionalFields, location.additionalFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildingNumber, buildingName, unitNumber, streetName, streetType, city, suburb, county, stateProvinceCode, country, postalCode, poBox, additionalFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    unitNumber: ").append(toIndentedString(unitNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    stateProvinceCode: ").append(toIndentedString(stateProvinceCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    poBox: ").append(toIndentedString(poBox)).append("\n");
    sb.append("    additionalFields: ").append(toIndentedString(additionalFields)).append("\n");
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

