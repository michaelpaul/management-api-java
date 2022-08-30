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
import org.openapitools.client.model.LinksElement;

/**
 * MerchantLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class MerchantLinks {
  public static final String SERIALIZED_NAME_API_CREDENTIALS = "apiCredentials";
  @SerializedName(SERIALIZED_NAME_API_CREDENTIALS)
  private LinksElement apiCredentials;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private LinksElement self;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private LinksElement users;

  public static final String SERIALIZED_NAME_WEBHOOKS = "webhooks";
  @SerializedName(SERIALIZED_NAME_WEBHOOKS)
  private LinksElement webhooks;

  public MerchantLinks() { 
  }

  public MerchantLinks apiCredentials(LinksElement apiCredentials) {
    
    this.apiCredentials = apiCredentials;
    return this;
  }

   /**
   * Get apiCredentials
   * @return apiCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinksElement getApiCredentials() {
    return apiCredentials;
  }


  public void setApiCredentials(LinksElement apiCredentials) {
    this.apiCredentials = apiCredentials;
  }


  public MerchantLinks self(LinksElement self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LinksElement getSelf() {
    return self;
  }


  public void setSelf(LinksElement self) {
    this.self = self;
  }


  public MerchantLinks users(LinksElement users) {
    
    this.users = users;
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinksElement getUsers() {
    return users;
  }


  public void setUsers(LinksElement users) {
    this.users = users;
  }


  public MerchantLinks webhooks(LinksElement webhooks) {
    
    this.webhooks = webhooks;
    return this;
  }

   /**
   * Get webhooks
   * @return webhooks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinksElement getWebhooks() {
    return webhooks;
  }


  public void setWebhooks(LinksElement webhooks) {
    this.webhooks = webhooks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantLinks merchantLinks = (MerchantLinks) o;
    return Objects.equals(this.apiCredentials, merchantLinks.apiCredentials) &&
        Objects.equals(this.self, merchantLinks.self) &&
        Objects.equals(this.users, merchantLinks.users) &&
        Objects.equals(this.webhooks, merchantLinks.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiCredentials, self, users, webhooks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantLinks {\n");
    sb.append("    apiCredentials: ").append(toIndentedString(apiCredentials)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
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

