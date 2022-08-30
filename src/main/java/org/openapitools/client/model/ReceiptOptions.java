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
 * ReceiptOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T15:05:30.841Z[Etc/UTC]")
public class ReceiptOptions {
  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_QR_CODE_DATA = "qrCodeData";
  @SerializedName(SERIALIZED_NAME_QR_CODE_DATA)
  private String qrCodeData;

  public ReceiptOptions() { 
  }

  public ReceiptOptions logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * The receipt logo converted to a Base64-encoded string. The image must be a .bmp file of &lt; 256 KB, dimensions 240 (H) x 384 (W) px.
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The receipt logo converted to a Base64-encoded string. The image must be a .bmp file of < 256 KB, dimensions 240 (H) x 384 (W) px.")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }


  public ReceiptOptions qrCodeData(String qrCodeData) {
    
    this.qrCodeData = qrCodeData;
    return this;
  }

   /**
   * Data to print on the receipt as a QR code. This can include static text and the following variables:  - &#x60;${merchantreference}&#x60;: the merchant reference of the transaction. - &#x60;${pspreference}&#x60;: the PSP reference of the transaction.   For example, **http://www.example.com/order/${pspreference}/${merchantreference}**.
   * @return qrCodeData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data to print on the receipt as a QR code. This can include static text and the following variables:  - `${merchantreference}`: the merchant reference of the transaction. - `${pspreference}`: the PSP reference of the transaction.   For example, **http://www.example.com/order/${pspreference}/${merchantreference}**.")

  public String getQrCodeData() {
    return qrCodeData;
  }


  public void setQrCodeData(String qrCodeData) {
    this.qrCodeData = qrCodeData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptOptions receiptOptions = (ReceiptOptions) o;
    return Objects.equals(this.logo, receiptOptions.logo) &&
        Objects.equals(this.qrCodeData, receiptOptions.qrCodeData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logo, qrCodeData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptOptions {\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    qrCodeData: ").append(toIndentedString(qrCodeData)).append("\n");
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
    openapiFields.add("logo");
    openapiFields.add("qrCodeData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReceiptOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReceiptOptions.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReceiptOptions is not found in the empty JSON string", ReceiptOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReceiptOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReceiptOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if (jsonObj.get("qrCodeData") != null && !jsonObj.get("qrCodeData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qrCodeData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qrCodeData").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReceiptOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReceiptOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReceiptOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReceiptOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<ReceiptOptions>() {
           @Override
           public void write(JsonWriter out, ReceiptOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReceiptOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReceiptOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReceiptOptions
  * @throws IOException if the JSON string is invalid with respect to ReceiptOptions
  */
  public static ReceiptOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReceiptOptions.class);
  }

 /**
  * Convert an instance of ReceiptOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

