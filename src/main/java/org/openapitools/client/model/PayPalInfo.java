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
 * PayPalInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class PayPalInfo {
  public static final String SERIALIZED_NAME_DIRECT_CAPTURE = "directCapture";
  @SerializedName(SERIALIZED_NAME_DIRECT_CAPTURE)
  private Boolean directCapture;

  public static final String SERIALIZED_NAME_DIRECT_SETTLEMENT = "directSettlement";
  @SerializedName(SERIALIZED_NAME_DIRECT_SETTLEMENT)
  private Boolean directSettlement;

  public static final String SERIALIZED_NAME_PAYER_ID = "payerId";
  @SerializedName(SERIALIZED_NAME_PAYER_ID)
  private String payerId;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public PayPalInfo() { 
  }

  public PayPalInfo directCapture(Boolean directCapture) {
    
    this.directCapture = directCapture;
    return this;
  }

   /**
   * Indicates if direct (immediate) capture for PayPal is enabled. If set to **true**, this setting overrides the [capture](https://docs.adyen.com/online-payments/capture) settings of your merchant account. Default value: **true**.
   * @return directCapture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if direct (immediate) capture for PayPal is enabled. If set to **true**, this setting overrides the [capture](https://docs.adyen.com/online-payments/capture) settings of your merchant account. Default value: **true**.")

  public Boolean getDirectCapture() {
    return directCapture;
  }


  public void setDirectCapture(Boolean directCapture) {
    this.directCapture = directCapture;
  }


  public PayPalInfo directSettlement(Boolean directSettlement) {
    
    this.directSettlement = directSettlement;
    return this;
  }

   /**
   * Must be set to **true** to confirm that the settlement to your bank account is performed directly by PayPal. Default value: **null**.
   * @return directSettlement
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Must be set to **true** to confirm that the settlement to your bank account is performed directly by PayPal. Default value: **null**.")

  public Boolean getDirectSettlement() {
    return directSettlement;
  }


  public void setDirectSettlement(Boolean directSettlement) {
    this.directSettlement = directSettlement;
  }


  public PayPalInfo payerId(String payerId) {
    
    this.payerId = payerId;
    return this;
  }

   /**
   * PayPal Merchant ID. Character length and limitations: 13 single-byte alphanumeric characters.
   * @return payerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "PayPal Merchant ID. Character length and limitations: 13 single-byte alphanumeric characters.")

  public String getPayerId() {
    return payerId;
  }


  public void setPayerId(String payerId) {
    this.payerId = payerId;
  }


  public PayPalInfo subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Your business email address.
   * @return subject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Your business email address.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayPalInfo payPalInfo = (PayPalInfo) o;
    return Objects.equals(this.directCapture, payPalInfo.directCapture) &&
        Objects.equals(this.directSettlement, payPalInfo.directSettlement) &&
        Objects.equals(this.payerId, payPalInfo.payerId) &&
        Objects.equals(this.subject, payPalInfo.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directCapture, directSettlement, payerId, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayPalInfo {\n");
    sb.append("    directCapture: ").append(toIndentedString(directCapture)).append("\n");
    sb.append("    directSettlement: ").append(toIndentedString(directSettlement)).append("\n");
    sb.append("    payerId: ").append(toIndentedString(payerId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

