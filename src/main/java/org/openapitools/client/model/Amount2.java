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
 * Amount2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T15:05:30.841Z[Etc/UTC]")
public class Amount2 {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Long value;

  public Amount2() { 
  }

  public Amount2 currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes).
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes).")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Amount2 value(Long value) {
    
    this.value = value;
    return this;
  }

   /**
   * The amount of the transaction, in [minor units](https://docs.adyen.com/development-resources/currency-codes).
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The amount of the transaction, in [minor units](https://docs.adyen.com/development-resources/currency-codes).")

  public Long getValue() {
    return value;
  }


  public void setValue(Long value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amount2 amount2 = (Amount2) o;
    return Objects.equals(this.currency, amount2.currency) &&
        Objects.equals(this.value, amount2.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount2 {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("currency");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Amount2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Amount2.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Amount2 is not found in the empty JSON string", Amount2.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Amount2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Amount2` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Amount2.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Amount2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Amount2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Amount2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Amount2.class));

       return (TypeAdapter<T>) new TypeAdapter<Amount2>() {
           @Override
           public void write(JsonWriter out, Amount2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Amount2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Amount2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Amount2
  * @throws IOException if the JSON string is invalid with respect to Amount2
  */
  public static Amount2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Amount2.class);
  }

 /**
  * Convert an instance of Amount2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

