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
import org.openapitools.client.model.Name;

/**
 * CreateCompanyUserRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class CreateCompanyUserRequest {
  public static final String SERIALIZED_NAME_ACCOUNT_GROUPS = "accountGroups";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GROUPS)
  private List<String> accountGroups = null;

  public static final String SERIALIZED_NAME_ASSOCIATED_MERCHANT_ACCOUNTS = "associatedMerchantAccounts";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_MERCHANT_ACCOUNTS)
  private List<String> associatedMerchantAccounts = null;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Name name;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<String> roles = null;

  public static final String SERIALIZED_NAME_TIME_ZONE_CODE = "timeZoneCode";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE_CODE)
  private String timeZoneCode;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public CreateCompanyUserRequest() { 
  }

  public CreateCompanyUserRequest accountGroups(List<String> accountGroups) {
    
    this.accountGroups = accountGroups;
    return this;
  }

  public CreateCompanyUserRequest addAccountGroupsItem(String accountGroupsItem) {
    if (this.accountGroups == null) {
      this.accountGroups = new ArrayList<String>();
    }
    this.accountGroups.add(accountGroupsItem);
    return this;
  }

   /**
   * The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user.
   * @return accountGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user.")

  public List<String> getAccountGroups() {
    return accountGroups;
  }


  public void setAccountGroups(List<String> accountGroups) {
    this.accountGroups = accountGroups;
  }


  public CreateCompanyUserRequest associatedMerchantAccounts(List<String> associatedMerchantAccounts) {
    
    this.associatedMerchantAccounts = associatedMerchantAccounts;
    return this;
  }

  public CreateCompanyUserRequest addAssociatedMerchantAccountsItem(String associatedMerchantAccountsItem) {
    if (this.associatedMerchantAccounts == null) {
      this.associatedMerchantAccounts = new ArrayList<String>();
    }
    this.associatedMerchantAccounts.add(associatedMerchantAccountsItem);
    return this;
  }

   /**
   * The list of [merchant accounts](https://docs.adyen.com/account/account-structure#merchant-accounts) associated with this user.
   * @return associatedMerchantAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of [merchant accounts](https://docs.adyen.com/account/account-structure#merchant-accounts) associated with this user.")

  public List<String> getAssociatedMerchantAccounts() {
    return associatedMerchantAccounts;
  }


  public void setAssociatedMerchantAccounts(List<String> associatedMerchantAccounts) {
    this.associatedMerchantAccounts = associatedMerchantAccounts;
  }


  public CreateCompanyUserRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email address of the user.
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The email address of the user.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CreateCompanyUserRequest name(Name name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Name getName() {
    return name;
  }


  public void setName(Name name) {
    this.name = name;
  }


  public CreateCompanyUserRequest roles(List<String> roles) {
    
    this.roles = roles;
    return this;
  }

  public CreateCompanyUserRequest addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * The list of [roles](https://docs.adyen.com/account/user-roles) for this user.
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of [roles](https://docs.adyen.com/account/user-roles) for this user.")

  public List<String> getRoles() {
    return roles;
  }


  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  public CreateCompanyUserRequest timeZoneCode(String timeZoneCode) {
    
    this.timeZoneCode = timeZoneCode;
    return this;
  }

   /**
   * The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**.
   * @return timeZoneCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**.")

  public String getTimeZoneCode() {
    return timeZoneCode;
  }


  public void setTimeZoneCode(String timeZoneCode) {
    this.timeZoneCode = timeZoneCode;
  }


  public CreateCompanyUserRequest username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * The username for this user. Allowed length: 255 alphanumeric characters.
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The username for this user. Allowed length: 255 alphanumeric characters.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCompanyUserRequest createCompanyUserRequest = (CreateCompanyUserRequest) o;
    return Objects.equals(this.accountGroups, createCompanyUserRequest.accountGroups) &&
        Objects.equals(this.associatedMerchantAccounts, createCompanyUserRequest.associatedMerchantAccounts) &&
        Objects.equals(this.email, createCompanyUserRequest.email) &&
        Objects.equals(this.name, createCompanyUserRequest.name) &&
        Objects.equals(this.roles, createCompanyUserRequest.roles) &&
        Objects.equals(this.timeZoneCode, createCompanyUserRequest.timeZoneCode) &&
        Objects.equals(this.username, createCompanyUserRequest.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGroups, associatedMerchantAccounts, email, name, roles, timeZoneCode, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompanyUserRequest {\n");
    sb.append("    accountGroups: ").append(toIndentedString(accountGroups)).append("\n");
    sb.append("    associatedMerchantAccounts: ").append(toIndentedString(associatedMerchantAccounts)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    timeZoneCode: ").append(toIndentedString(timeZoneCode)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

