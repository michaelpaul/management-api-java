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
 * StoreSplitConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class StoreSplitConfiguration {
  public static final String SERIALIZED_NAME_BALANCE_ACCOUNT_ID = "balanceAccountId";
  @SerializedName(SERIALIZED_NAME_BALANCE_ACCOUNT_ID)
  private String balanceAccountId;

  public static final String SERIALIZED_NAME_SPLIT_CONFIGURATION_ID = "splitConfigurationId";
  @SerializedName(SERIALIZED_NAME_SPLIT_CONFIGURATION_ID)
  private String splitConfigurationId;

  public StoreSplitConfiguration() { 
  }

  public StoreSplitConfiguration balanceAccountId(String balanceAccountId) {
    
    this.balanceAccountId = balanceAccountId;
    return this;
  }

   /**
   * The [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__queryParam_id) linked to the account holder.
   * @return balanceAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__queryParam_id) linked to the account holder.")

  public String getBalanceAccountId() {
    return balanceAccountId;
  }


  public void setBalanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
  }


  public StoreSplitConfiguration splitConfigurationId(String splitConfigurationId) {
    
    this.splitConfigurationId = splitConfigurationId;
    return this;
  }

   /**
   * The UUID of the [split configuration](https://docs.adyen.com/platforms/split-configuration-for-stores) from the Customer Area.
   * @return splitConfigurationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID of the [split configuration](https://docs.adyen.com/platforms/split-configuration-for-stores) from the Customer Area.")

  public String getSplitConfigurationId() {
    return splitConfigurationId;
  }


  public void setSplitConfigurationId(String splitConfigurationId) {
    this.splitConfigurationId = splitConfigurationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreSplitConfiguration storeSplitConfiguration = (StoreSplitConfiguration) o;
    return Objects.equals(this.balanceAccountId, storeSplitConfiguration.balanceAccountId) &&
        Objects.equals(this.splitConfigurationId, storeSplitConfiguration.splitConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAccountId, splitConfigurationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreSplitConfiguration {\n");
    sb.append("    balanceAccountId: ").append(toIndentedString(balanceAccountId)).append("\n");
    sb.append("    splitConfigurationId: ").append(toIndentedString(splitConfigurationId)).append("\n");
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

