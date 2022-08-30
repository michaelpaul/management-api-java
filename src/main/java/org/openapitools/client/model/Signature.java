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
 * Signature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class Signature {
  public static final String SERIALIZED_NAME_ASK_SIGNATURE_ON_SCREEN = "askSignatureOnScreen";
  @SerializedName(SERIALIZED_NAME_ASK_SIGNATURE_ON_SCREEN)
  private Boolean askSignatureOnScreen;

  public static final String SERIALIZED_NAME_DEVICE_NAME = "deviceName";
  @SerializedName(SERIALIZED_NAME_DEVICE_NAME)
  private String deviceName;

  public static final String SERIALIZED_NAME_SKIP_SIGNATURE = "skipSignature";
  @SerializedName(SERIALIZED_NAME_SKIP_SIGNATURE)
  private Boolean skipSignature;

  public Signature() { 
  }

  public Signature askSignatureOnScreen(Boolean askSignatureOnScreen) {
    
    this.askSignatureOnScreen = askSignatureOnScreen;
    return this;
  }

   /**
   * If &#x60;skipSignature&#x60; is false, indicates whether the shopper should provide a signature on the display (**true**) or on the merchant receipt (**false**).
   * @return askSignatureOnScreen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `skipSignature` is false, indicates whether the shopper should provide a signature on the display (**true**) or on the merchant receipt (**false**).")

  public Boolean getAskSignatureOnScreen() {
    return askSignatureOnScreen;
  }


  public void setAskSignatureOnScreen(Boolean askSignatureOnScreen) {
    this.askSignatureOnScreen = askSignatureOnScreen;
  }


  public Signature deviceName(String deviceName) {
    
    this.deviceName = deviceName;
    return this;
  }

   /**
   * Name that identifies the terminal.
   * @return deviceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name that identifies the terminal.")

  public String getDeviceName() {
    return deviceName;
  }


  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }


  public Signature skipSignature(Boolean skipSignature) {
    
    this.skipSignature = skipSignature;
    return this;
  }

   /**
   * Skip asking for a signature. This is possible because all global card schemes (American Express, Diners, Discover, JCB, MasterCard, VISA, and UnionPay) regard a signature as optional.
   * @return skipSignature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip asking for a signature. This is possible because all global card schemes (American Express, Diners, Discover, JCB, MasterCard, VISA, and UnionPay) regard a signature as optional.")

  public Boolean getSkipSignature() {
    return skipSignature;
  }


  public void setSkipSignature(Boolean skipSignature) {
    this.skipSignature = skipSignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Signature signature = (Signature) o;
    return Objects.equals(this.askSignatureOnScreen, signature.askSignatureOnScreen) &&
        Objects.equals(this.deviceName, signature.deviceName) &&
        Objects.equals(this.skipSignature, signature.skipSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(askSignatureOnScreen, deviceName, skipSignature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signature {\n");
    sb.append("    askSignatureOnScreen: ").append(toIndentedString(askSignatureOnScreen)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    skipSignature: ").append(toIndentedString(skipSignature)).append("\n");
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
