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
 * PayoutSettingsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T15:05:30.841Z[Etc/UTC]")
public class PayoutSettingsRequest {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ENABLED_FROM_DATE = "enabledFromDate";
  @SerializedName(SERIALIZED_NAME_ENABLED_FROM_DATE)
  private String enabledFromDate;

  public static final String SERIALIZED_NAME_TRANSFER_INSTRUMENT_ID = "transferInstrumentId";
  @SerializedName(SERIALIZED_NAME_TRANSFER_INSTRUMENT_ID)
  private String transferInstrumentId;

  public PayoutSettingsRequest() { 
  }

  public PayoutSettingsRequest enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates if payouts to this bank account are enabled. Default: **true**.  To receive payouts into this bank account, both &#x60;enabled&#x60; and &#x60;allowed&#x60; must be **true**.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if payouts to this bank account are enabled. Default: **true**.  To receive payouts into this bank account, both `enabled` and `allowed` must be **true**.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public PayoutSettingsRequest enabledFromDate(String enabledFromDate) {
    
    this.enabledFromDate = enabledFromDate;
    return this;
  }

   /**
   * The date when Adyen starts paying out to this bank account.  Format: [ISO 8601](https://www.w3.org/TR/NOTE-datetime), for example, **2019-11-23T12:25:28Z** or **2020-05-27T20:25:28+08:00**.  If not specified, the &#x60;enabled&#x60; field indicates if payouts are enabled for this bank account.  If a date is specified and:  * &#x60;enabled&#x60;: **true**, payouts are enabled starting the specified date. * &#x60;enabled&#x60;: **false**, payouts are disabled until the specified date. On the specified date, &#x60;enabled&#x60; changes to **true** and this field is reset to **null**.
   * @return enabledFromDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when Adyen starts paying out to this bank account.  Format: [ISO 8601](https://www.w3.org/TR/NOTE-datetime), for example, **2019-11-23T12:25:28Z** or **2020-05-27T20:25:28+08:00**.  If not specified, the `enabled` field indicates if payouts are enabled for this bank account.  If a date is specified and:  * `enabled`: **true**, payouts are enabled starting the specified date. * `enabled`: **false**, payouts are disabled until the specified date. On the specified date, `enabled` changes to **true** and this field is reset to **null**.")

  public String getEnabledFromDate() {
    return enabledFromDate;
  }


  public void setEnabledFromDate(String enabledFromDate) {
    this.enabledFromDate = enabledFromDate;
  }


  public PayoutSettingsRequest transferInstrumentId(String transferInstrumentId) {
    
    this.transferInstrumentId = transferInstrumentId;
    return this;
  }

   /**
   * The unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments) that contains the details of the bank account.
   * @return transferInstrumentId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments) that contains the details of the bank account.")

  public String getTransferInstrumentId() {
    return transferInstrumentId;
  }


  public void setTransferInstrumentId(String transferInstrumentId) {
    this.transferInstrumentId = transferInstrumentId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutSettingsRequest payoutSettingsRequest = (PayoutSettingsRequest) o;
    return Objects.equals(this.enabled, payoutSettingsRequest.enabled) &&
        Objects.equals(this.enabledFromDate, payoutSettingsRequest.enabledFromDate) &&
        Objects.equals(this.transferInstrumentId, payoutSettingsRequest.transferInstrumentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, enabledFromDate, transferInstrumentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutSettingsRequest {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    enabledFromDate: ").append(toIndentedString(enabledFromDate)).append("\n");
    sb.append("    transferInstrumentId: ").append(toIndentedString(transferInstrumentId)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("enabledFromDate");
    openapiFields.add("transferInstrumentId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("transferInstrumentId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayoutSettingsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PayoutSettingsRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayoutSettingsRequest is not found in the empty JSON string", PayoutSettingsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PayoutSettingsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PayoutSettingsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PayoutSettingsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("enabledFromDate") != null && !jsonObj.get("enabledFromDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enabledFromDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enabledFromDate").toString()));
      }
      if (jsonObj.get("transferInstrumentId") != null && !jsonObj.get("transferInstrumentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transferInstrumentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transferInstrumentId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayoutSettingsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayoutSettingsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayoutSettingsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayoutSettingsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PayoutSettingsRequest>() {
           @Override
           public void write(JsonWriter out, PayoutSettingsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PayoutSettingsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PayoutSettingsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayoutSettingsRequest
  * @throws IOException if the JSON string is invalid with respect to PayoutSettingsRequest
  */
  public static PayoutSettingsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayoutSettingsRequest.class);
  }

 /**
  * Convert an instance of PayoutSettingsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

