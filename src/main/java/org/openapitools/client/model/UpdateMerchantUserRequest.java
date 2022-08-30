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
import org.openapitools.client.model.Name2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * UpdateMerchantUserRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T15:05:30.841Z[Etc/UTC]")
public class UpdateMerchantUserRequest {
  public static final String SERIALIZED_NAME_ACCOUNT_GROUPS = "accountGroups";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GROUPS)
  private List<String> accountGroups = null;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Name2 name;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<String> roles = null;

  public static final String SERIALIZED_NAME_TIME_ZONE_CODE = "timeZoneCode";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE_CODE)
  private String timeZoneCode;

  public UpdateMerchantUserRequest() { 
  }

  public UpdateMerchantUserRequest accountGroups(List<String> accountGroups) {
    
    this.accountGroups = accountGroups;
    return this;
  }

  public UpdateMerchantUserRequest addAccountGroupsItem(String accountGroupsItem) {
    if (this.accountGroups == null) {
      this.accountGroups = new ArrayList<>();
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


  public UpdateMerchantUserRequest active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Sets the status of the user to active (**true**) or inactive (**false**).
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets the status of the user to active (**true**) or inactive (**false**).")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public UpdateMerchantUserRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email address of the user.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address of the user.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UpdateMerchantUserRequest name(Name2 name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Name2 getName() {
    return name;
  }


  public void setName(Name2 name) {
    this.name = name;
  }


  public UpdateMerchantUserRequest roles(List<String> roles) {
    
    this.roles = roles;
    return this;
  }

  public UpdateMerchantUserRequest addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
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


  public UpdateMerchantUserRequest timeZoneCode(String timeZoneCode) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMerchantUserRequest updateMerchantUserRequest = (UpdateMerchantUserRequest) o;
    return Objects.equals(this.accountGroups, updateMerchantUserRequest.accountGroups) &&
        Objects.equals(this.active, updateMerchantUserRequest.active) &&
        Objects.equals(this.email, updateMerchantUserRequest.email) &&
        Objects.equals(this.name, updateMerchantUserRequest.name) &&
        Objects.equals(this.roles, updateMerchantUserRequest.roles) &&
        Objects.equals(this.timeZoneCode, updateMerchantUserRequest.timeZoneCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGroups, active, email, name, roles, timeZoneCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMerchantUserRequest {\n");
    sb.append("    accountGroups: ").append(toIndentedString(accountGroups)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    timeZoneCode: ").append(toIndentedString(timeZoneCode)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("accountGroups");
    openapiFields.add("active");
    openapiFields.add("email");
    openapiFields.add("name");
    openapiFields.add("roles");
    openapiFields.add("timeZoneCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateMerchantUserRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateMerchantUserRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateMerchantUserRequest is not found in the empty JSON string", UpdateMerchantUserRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateMerchantUserRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateMerchantUserRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("accountGroups") != null && !jsonObj.get("accountGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountGroups` to be an array in the JSON string but got `%s`", jsonObj.get("accountGroups").toString()));
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the optional field `name`
      if (jsonObj.getAsJsonObject("name") != null) {
        Name2.validateJsonObject(jsonObj.getAsJsonObject("name"));
      }
      // ensure the json data is an array
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
      }
      if (jsonObj.get("timeZoneCode") != null && !jsonObj.get("timeZoneCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeZoneCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeZoneCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateMerchantUserRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateMerchantUserRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateMerchantUserRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateMerchantUserRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateMerchantUserRequest>() {
           @Override
           public void write(JsonWriter out, UpdateMerchantUserRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateMerchantUserRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateMerchantUserRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateMerchantUserRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateMerchantUserRequest
  */
  public static UpdateMerchantUserRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateMerchantUserRequest.class);
  }

 /**
  * Convert an instance of UpdateMerchantUserRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

