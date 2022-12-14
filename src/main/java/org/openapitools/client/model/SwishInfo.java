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
 * SwishInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class SwishInfo {
  public static final String SERIALIZED_NAME_SWISH_NUMBER = "swishNumber";
  @SerializedName(SERIALIZED_NAME_SWISH_NUMBER)
  private String swishNumber;

  public SwishInfo() { 
  }

  public SwishInfo swishNumber(String swishNumber) {
    
    this.swishNumber = swishNumber;
    return this;
  }

   /**
   * Swish number. Format: 10 digits without spaces. For example, **1231111111**.
   * @return swishNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Swish number. Format: 10 digits without spaces. For example, **1231111111**.")

  public String getSwishNumber() {
    return swishNumber;
  }


  public void setSwishNumber(String swishNumber) {
    this.swishNumber = swishNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwishInfo swishInfo = (SwishInfo) o;
    return Objects.equals(this.swishNumber, swishInfo.swishNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(swishNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwishInfo {\n");
    sb.append("    swishNumber: ").append(toIndentedString(swishNumber)).append("\n");
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

