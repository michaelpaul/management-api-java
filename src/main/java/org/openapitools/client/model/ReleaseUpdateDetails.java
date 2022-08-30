/*
 * Management API
 * Configure and manage your Adyen company and merchant accounts, stores, and payment terminals. ## Authentication Each request to the Management API must be signed with an API key. [Generate your API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key) in the Customer Area and then set this key to the `X-API-Key` header value.  To access the live endpoints, you need to generate a new API key in your live Customer Area. ## Versioning  Management API handles versioning as part of the endpoint URL. For example, to send a request to version 1 of the `/companies/{companyId}/webhooks` endpoint, use:  ```text https://management-test.adyen.com/v1/companies/{companyId}/webhooks ```
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ReleaseUpdateDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class ReleaseUpdateDetails {
  /**
   * Type of terminal action: Update Release.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    RELEASEUPDATE("ReleaseUpdate");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.RELEASEUPDATE;

  public static final String SERIALIZED_NAME_UPDATE_AT_FIRST_MAINTENANCE_CALL = "updateAtFirstMaintenanceCall";
  @SerializedName(SERIALIZED_NAME_UPDATE_AT_FIRST_MAINTENANCE_CALL)
  private Boolean updateAtFirstMaintenanceCall;

  public ReleaseUpdateDetails() { 
  }

  public ReleaseUpdateDetails type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of terminal action: Update Release.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of terminal action: Update Release.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ReleaseUpdateDetails updateAtFirstMaintenanceCall(Boolean updateAtFirstMaintenanceCall) {
    
    this.updateAtFirstMaintenanceCall = updateAtFirstMaintenanceCall;
    return this;
  }

   /**
   * Boolean flag that tells if the terminal should update at the first next maintenance call. If false, terminal will update on its configured reboot time.
   * @return updateAtFirstMaintenanceCall
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean flag that tells if the terminal should update at the first next maintenance call. If false, terminal will update on its configured reboot time.")

  public Boolean getUpdateAtFirstMaintenanceCall() {
    return updateAtFirstMaintenanceCall;
  }


  public void setUpdateAtFirstMaintenanceCall(Boolean updateAtFirstMaintenanceCall) {
    this.updateAtFirstMaintenanceCall = updateAtFirstMaintenanceCall;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseUpdateDetails releaseUpdateDetails = (ReleaseUpdateDetails) o;
    return Objects.equals(this.type, releaseUpdateDetails.type) &&
        Objects.equals(this.updateAtFirstMaintenanceCall, releaseUpdateDetails.updateAtFirstMaintenanceCall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, updateAtFirstMaintenanceCall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseUpdateDetails {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateAtFirstMaintenanceCall: ").append(toIndentedString(updateAtFirstMaintenanceCall)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
