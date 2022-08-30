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
 * KlarnaInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T15:05:30.841Z[Etc/UTC]")
public class KlarnaInfo {
  public static final String SERIALIZED_NAME_AUTO_CAPTURE = "autoCapture";
  @SerializedName(SERIALIZED_NAME_AUTO_CAPTURE)
  private Boolean autoCapture;

  public static final String SERIALIZED_NAME_DISPUTE_EMAIL = "disputeEmail";
  @SerializedName(SERIALIZED_NAME_DISPUTE_EMAIL)
  private String disputeEmail;

  /**
   * The region of operation. For example, **NA**, **EU**, **CH**, **AU**.
   */
  @JsonAdapter(RegionEnum.Adapter.class)
  public enum RegionEnum {
    NA("NA"),
    
    EU("EU"),
    
    CH("CH"),
    
    AU("AU");

    private String value;

    RegionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RegionEnum fromValue(String value) {
      for (RegionEnum b : RegionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RegionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RegionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RegionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RegionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private RegionEnum region;

  public static final String SERIALIZED_NAME_SUPPORT_EMAIL = "supportEmail";
  @SerializedName(SERIALIZED_NAME_SUPPORT_EMAIL)
  private String supportEmail;

  public KlarnaInfo() { 
  }

  public KlarnaInfo autoCapture(Boolean autoCapture) {
    
    this.autoCapture = autoCapture;
    return this;
  }

   /**
   * Indicates the status of [Automatic capture](https://docs.adyen.com/online-payments/capture#automatic-capture). Default value: **false**.
   * @return autoCapture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the status of [Automatic capture](https://docs.adyen.com/online-payments/capture#automatic-capture). Default value: **false**.")

  public Boolean getAutoCapture() {
    return autoCapture;
  }


  public void setAutoCapture(Boolean autoCapture) {
    this.autoCapture = autoCapture;
  }


  public KlarnaInfo disputeEmail(String disputeEmail) {
    
    this.disputeEmail = disputeEmail;
    return this;
  }

   /**
   * The email address for disputes.
   * @return disputeEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The email address for disputes.")

  public String getDisputeEmail() {
    return disputeEmail;
  }


  public void setDisputeEmail(String disputeEmail) {
    this.disputeEmail = disputeEmail;
  }


  public KlarnaInfo region(RegionEnum region) {
    
    this.region = region;
    return this;
  }

   /**
   * The region of operation. For example, **NA**, **EU**, **CH**, **AU**.
   * @return region
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The region of operation. For example, **NA**, **EU**, **CH**, **AU**.")

  public RegionEnum getRegion() {
    return region;
  }


  public void setRegion(RegionEnum region) {
    this.region = region;
  }


  public KlarnaInfo supportEmail(String supportEmail) {
    
    this.supportEmail = supportEmail;
    return this;
  }

   /**
   * The email address of merchant support.
   * @return supportEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The email address of merchant support.")

  public String getSupportEmail() {
    return supportEmail;
  }


  public void setSupportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KlarnaInfo klarnaInfo = (KlarnaInfo) o;
    return Objects.equals(this.autoCapture, klarnaInfo.autoCapture) &&
        Objects.equals(this.disputeEmail, klarnaInfo.disputeEmail) &&
        Objects.equals(this.region, klarnaInfo.region) &&
        Objects.equals(this.supportEmail, klarnaInfo.supportEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoCapture, disputeEmail, region, supportEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KlarnaInfo {\n");
    sb.append("    autoCapture: ").append(toIndentedString(autoCapture)).append("\n");
    sb.append("    disputeEmail: ").append(toIndentedString(disputeEmail)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    supportEmail: ").append(toIndentedString(supportEmail)).append("\n");
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
    openapiFields.add("autoCapture");
    openapiFields.add("disputeEmail");
    openapiFields.add("region");
    openapiFields.add("supportEmail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("disputeEmail");
    openapiRequiredFields.add("region");
    openapiRequiredFields.add("supportEmail");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KlarnaInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (KlarnaInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in KlarnaInfo is not found in the empty JSON string", KlarnaInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KlarnaInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KlarnaInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : KlarnaInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("disputeEmail") != null && !jsonObj.get("disputeEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disputeEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disputeEmail").toString()));
      }
      if (jsonObj.get("region") != null && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if (jsonObj.get("supportEmail") != null && !jsonObj.get("supportEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supportEmail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KlarnaInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KlarnaInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KlarnaInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KlarnaInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<KlarnaInfo>() {
           @Override
           public void write(JsonWriter out, KlarnaInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KlarnaInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KlarnaInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KlarnaInfo
  * @throws IOException if the JSON string is invalid with respect to KlarnaInfo
  */
  public static KlarnaInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KlarnaInfo.class);
  }

 /**
  * Convert an instance of KlarnaInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

