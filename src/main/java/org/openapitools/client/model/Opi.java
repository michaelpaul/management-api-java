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
 * Opi
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class Opi {
  public static final String SERIALIZED_NAME_ENABLE_PAY_AT_TABLE = "enablePayAtTable";
  @SerializedName(SERIALIZED_NAME_ENABLE_PAY_AT_TABLE)
  private Boolean enablePayAtTable;

  public static final String SERIALIZED_NAME_PAY_AT_TABLE_STORE_NUMBER = "payAtTableStoreNumber";
  @SerializedName(SERIALIZED_NAME_PAY_AT_TABLE_STORE_NUMBER)
  private String payAtTableStoreNumber;

  public static final String SERIALIZED_NAME_PAY_AT_TABLE_U_R_L = "payAtTableURL";
  @SerializedName(SERIALIZED_NAME_PAY_AT_TABLE_U_R_L)
  private String payAtTableURL;

  public Opi() { 
  }

  public Opi enablePayAtTable(Boolean enablePayAtTable) {
    
    this.enablePayAtTable = enablePayAtTable;
    return this;
  }

   /**
   * Indicates if Pay at Table is enabled.
   * @return enablePayAtTable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if Pay at Table is enabled.")

  public Boolean getEnablePayAtTable() {
    return enablePayAtTable;
  }


  public void setEnablePayAtTable(Boolean enablePayAtTable) {
    this.enablePayAtTable = enablePayAtTable;
  }


  public Opi payAtTableStoreNumber(String payAtTableStoreNumber) {
    
    this.payAtTableStoreNumber = payAtTableStoreNumber;
    return this;
  }

   /**
   * The store number to use for Pay at Table.
   * @return payAtTableStoreNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The store number to use for Pay at Table.")

  public String getPayAtTableStoreNumber() {
    return payAtTableStoreNumber;
  }


  public void setPayAtTableStoreNumber(String payAtTableStoreNumber) {
    this.payAtTableStoreNumber = payAtTableStoreNumber;
  }


  public Opi payAtTableURL(String payAtTableURL) {
    
    this.payAtTableURL = payAtTableURL;
    return this;
  }

   /**
   * The URL and port number used for Pay at Table communication.
   * @return payAtTableURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL and port number used for Pay at Table communication.")

  public String getPayAtTableURL() {
    return payAtTableURL;
  }


  public void setPayAtTableURL(String payAtTableURL) {
    this.payAtTableURL = payAtTableURL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Opi opi = (Opi) o;
    return Objects.equals(this.enablePayAtTable, opi.enablePayAtTable) &&
        Objects.equals(this.payAtTableStoreNumber, opi.payAtTableStoreNumber) &&
        Objects.equals(this.payAtTableURL, opi.payAtTableURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enablePayAtTable, payAtTableStoreNumber, payAtTableURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Opi {\n");
    sb.append("    enablePayAtTable: ").append(toIndentedString(enablePayAtTable)).append("\n");
    sb.append("    payAtTableStoreNumber: ").append(toIndentedString(payAtTableStoreNumber)).append("\n");
    sb.append("    payAtTableURL: ").append(toIndentedString(payAtTableURL)).append("\n");
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

