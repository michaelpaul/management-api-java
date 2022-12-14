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
import java.util.ArrayList;
import java.util.List;

/**
 * CreateCompanyApiCredentialRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class CreateCompanyApiCredentialRequest {
  public static final String SERIALIZED_NAME_ALLOWED_ORIGINS = "allowedOrigins";
  @SerializedName(SERIALIZED_NAME_ALLOWED_ORIGINS)
  private List<String> allowedOrigins = null;

  public static final String SERIALIZED_NAME_ASSOCIATED_MERCHANT_ACCOUNTS = "associatedMerchantAccounts";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_MERCHANT_ACCOUNTS)
  private List<String> associatedMerchantAccounts = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<String> roles = null;

  public CreateCompanyApiCredentialRequest() { 
  }

  public CreateCompanyApiCredentialRequest allowedOrigins(List<String> allowedOrigins) {
    
    this.allowedOrigins = allowedOrigins;
    return this;
  }

  public CreateCompanyApiCredentialRequest addAllowedOriginsItem(String allowedOriginsItem) {
    if (this.allowedOrigins == null) {
      this.allowedOrigins = new ArrayList<String>();
    }
    this.allowedOrigins.add(allowedOriginsItem);
    return this;
  }

   /**
   * List of [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) for the new API credential.
   * @return allowedOrigins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) for the new API credential.")

  public List<String> getAllowedOrigins() {
    return allowedOrigins;
  }


  public void setAllowedOrigins(List<String> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
  }


  public CreateCompanyApiCredentialRequest associatedMerchantAccounts(List<String> associatedMerchantAccounts) {
    
    this.associatedMerchantAccounts = associatedMerchantAccounts;
    return this;
  }

  public CreateCompanyApiCredentialRequest addAssociatedMerchantAccountsItem(String associatedMerchantAccountsItem) {
    if (this.associatedMerchantAccounts == null) {
      this.associatedMerchantAccounts = new ArrayList<String>();
    }
    this.associatedMerchantAccounts.add(associatedMerchantAccountsItem);
    return this;
  }

   /**
   * List of merchant accounts that the API credential has access to.
   * @return associatedMerchantAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of merchant accounts that the API credential has access to.")

  public List<String> getAssociatedMerchantAccounts() {
    return associatedMerchantAccounts;
  }


  public void setAssociatedMerchantAccounts(List<String> associatedMerchantAccounts) {
    this.associatedMerchantAccounts = associatedMerchantAccounts;
  }


  public CreateCompanyApiCredentialRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the API credential.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the API credential.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateCompanyApiCredentialRequest roles(List<String> roles) {
    
    this.roles = roles;
    return this;
  }

  public CreateCompanyApiCredentialRequest addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * List of [roles](https://docs.adyen.com/development-resources/api-credentials#roles-1) of the API credential.
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of [roles](https://docs.adyen.com/development-resources/api-credentials#roles-1) of the API credential.")

  public List<String> getRoles() {
    return roles;
  }


  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCompanyApiCredentialRequest createCompanyApiCredentialRequest = (CreateCompanyApiCredentialRequest) o;
    return Objects.equals(this.allowedOrigins, createCompanyApiCredentialRequest.allowedOrigins) &&
        Objects.equals(this.associatedMerchantAccounts, createCompanyApiCredentialRequest.associatedMerchantAccounts) &&
        Objects.equals(this.description, createCompanyApiCredentialRequest.description) &&
        Objects.equals(this.roles, createCompanyApiCredentialRequest.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedOrigins, associatedMerchantAccounts, description, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompanyApiCredentialRequest {\n");
    sb.append("    allowedOrigins: ").append(toIndentedString(allowedOrigins)).append("\n");
    sb.append("    associatedMerchantAccounts: ").append(toIndentedString(associatedMerchantAccounts)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

