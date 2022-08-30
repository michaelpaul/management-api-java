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
 * ReceiptPrinting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class ReceiptPrinting {
  public static final String SERIALIZED_NAME_MERCHANT_APPROVED = "merchantApproved";
  @SerializedName(SERIALIZED_NAME_MERCHANT_APPROVED)
  private Boolean merchantApproved;

  public static final String SERIALIZED_NAME_MERCHANT_CANCELLED = "merchantCancelled";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CANCELLED)
  private Boolean merchantCancelled;

  public static final String SERIALIZED_NAME_MERCHANT_CAPTURE_APPROVED = "merchantCaptureApproved";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CAPTURE_APPROVED)
  private Boolean merchantCaptureApproved;

  public static final String SERIALIZED_NAME_MERCHANT_CAPTURE_REFUSED = "merchantCaptureRefused";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CAPTURE_REFUSED)
  private Boolean merchantCaptureRefused;

  public static final String SERIALIZED_NAME_MERCHANT_REFUND_APPROVED = "merchantRefundApproved";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REFUND_APPROVED)
  private Boolean merchantRefundApproved;

  public static final String SERIALIZED_NAME_MERCHANT_REFUND_REFUSED = "merchantRefundRefused";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REFUND_REFUSED)
  private Boolean merchantRefundRefused;

  public static final String SERIALIZED_NAME_MERCHANT_REFUSED = "merchantRefused";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REFUSED)
  private Boolean merchantRefused;

  public static final String SERIALIZED_NAME_MERCHANT_VOID = "merchantVoid";
  @SerializedName(SERIALIZED_NAME_MERCHANT_VOID)
  private Boolean merchantVoid;

  public static final String SERIALIZED_NAME_SHOPPER_APPROVED = "shopperApproved";
  @SerializedName(SERIALIZED_NAME_SHOPPER_APPROVED)
  private Boolean shopperApproved;

  public static final String SERIALIZED_NAME_SHOPPER_CANCELLED = "shopperCancelled";
  @SerializedName(SERIALIZED_NAME_SHOPPER_CANCELLED)
  private Boolean shopperCancelled;

  public static final String SERIALIZED_NAME_SHOPPER_CAPTURE_APPROVED = "shopperCaptureApproved";
  @SerializedName(SERIALIZED_NAME_SHOPPER_CAPTURE_APPROVED)
  private Boolean shopperCaptureApproved;

  public static final String SERIALIZED_NAME_SHOPPER_CAPTURE_REFUSED = "shopperCaptureRefused";
  @SerializedName(SERIALIZED_NAME_SHOPPER_CAPTURE_REFUSED)
  private Boolean shopperCaptureRefused;

  public static final String SERIALIZED_NAME_SHOPPER_REFUND_APPROVED = "shopperRefundApproved";
  @SerializedName(SERIALIZED_NAME_SHOPPER_REFUND_APPROVED)
  private Boolean shopperRefundApproved;

  public static final String SERIALIZED_NAME_SHOPPER_REFUND_REFUSED = "shopperRefundRefused";
  @SerializedName(SERIALIZED_NAME_SHOPPER_REFUND_REFUSED)
  private Boolean shopperRefundRefused;

  public static final String SERIALIZED_NAME_SHOPPER_REFUSED = "shopperRefused";
  @SerializedName(SERIALIZED_NAME_SHOPPER_REFUSED)
  private Boolean shopperRefused;

  public static final String SERIALIZED_NAME_SHOPPER_VOID = "shopperVoid";
  @SerializedName(SERIALIZED_NAME_SHOPPER_VOID)
  private Boolean shopperVoid;

  public ReceiptPrinting() { 
  }

  public ReceiptPrinting merchantApproved(Boolean merchantApproved) {
    
    this.merchantApproved = merchantApproved;
    return this;
  }

   /**
   * Print a merchant receipt when the payment is approved.
   * @return merchantApproved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Print a merchant receipt when the payment is approved.")

  public Boolean getMerchantApproved() {
    return merchantApproved;
  }


  public void setMerchantApproved(Boolean merchantApproved) {
    this.merchantApproved = merchantApproved;
  }


  public ReceiptPrinting merchantCancelled(Boolean merchantCancelled) {
    
    this.merchantCancelled = merchantCancelled;
    return this;
  }

   /**
   * Print a merchant receipt when the transaction is cancelled.
   * @return merchantCancelled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Print a merchant receipt when the transaction is cancelled.")

  public Boolean getMerchantCancelled() {
    return merchantCancelled;
  }


  public void setMerchantCancelled(Boolean merchantCancelled) {
    this.merchantCancelled = merchantCancelled;
  }


  public ReceiptPrinting merchantCaptureApproved(Boolean merchantCaptureApproved) {
    
    this.merchantCaptureApproved = merchantCaptureApproved;
    return this;
  }

   /**
   * Print a merchant receipt when capturing the payment is approved.
   * @return merchantCaptureApproved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Print a merchant receipt when capturing the payment is approved.")

  public Boolean getMerchantCaptureApproved() {
    return merchantCaptureApproved;
  }


  public void setMerchantCaptureApproved(Boolean merchantCaptureApproved) {
    this.merchantCaptureApproved = merchantCaptureApproved;
  }


  public ReceiptPrinting merchantCaptureRefused(Boolean merchantCaptureRefused) {
    
    this.merchantCaptureRefused = merchantCaptureRefused;
    return this;
  }

   /**
   * Print a merchant receipt when capturing the payment is refused.
   * @return merchantCaptureRefused
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Print a merchant receipt when capturing the payment is refused.")

  public Boolean getMerchantCaptureRefused() {
    return merchantCaptureRefused;
  }


  public void setMerchantCaptureRefused(Boolean merchantCaptureRefused) {
    this.merchantCaptureRefused = merchantCaptureRefused;
  }


  public ReceiptPrinting merchantRefundApproved(Boolean merchantRefundApproved) {
    
    this.merchantRefundApproved = merchantRefundApproved;
    return this;
  }

   /**
   * Print a merchant receipt when the refund is approved.
   * @return merchantRefundApproved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Print a merchant receipt when the refund is approved.")

  public Boolean getMerchantRefundApproved() {
    return merchantRefundApproved;
  }


  public void setMerchantRefundApproved(Boolean merchantRefundApproved) {
    this.merchantRefundApproved = merchantRefundApproved;
  }


  public ReceiptPrinting merchantRefundRefused(Boolean merchantRefundRefused) {
    
    this.merchantRefundRefused = merchantRefundRefused;
    return this;
  }

   /**
   * Print a merchant receipt when the refund is refused.
   * @return merchantRefundRefused
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Print a merchant receipt when the refund is refused.")

  public Boolean getMerchantRefundRefused() {
    return merchantRefundRefused;
  }


  public void setMerchantRefundRefused(Boolean merchantRefundRefused) {
    this.merchantRefundRefused = merchantRefundRefused;
  }


  public ReceiptPrinting merchantRefused(Boolean merchantRefused) {
    
    this.merchantRefused = merchantRefused;
    return this;
  }

   /**
   * Print a merchant receipt when the payment is refused.
   * @return merchantRefused
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Print a merchant receipt when the payment is refused.")

  public Boolean getMerchantRefused() {
    return merchantRefused;
  }


  public void setMerchantRefused(Boolean merchantRefused) {
    this.merchantRefused = merchantRefused;
  }


  public ReceiptPrinting merchantVoid(Boolean merchantVoid) {
    
    this.merchantVoid = merchantVoid;
    return this;
  }

   /**
   * Print a merchant receipt when a previous transaction is voided.
   * @return merchantVoid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Print a merchant receipt when a previous transaction is voided.")

  public Boolean getMerchantVoid() {
    return merchantVoid;
  }


  public void setMerchantVoid(Boolean merchantVoid) {
    this.merchantVoid = merchantVoid;
  }


  public ReceiptPrinting shopperApproved(Boolean shopperApproved) {
    
    this.shopperApproved = shopperApproved;
    return this;
  }

   /**
   * Print a shopper receipt when the payment is approved.
   * @return shopperApproved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Print a shopper receipt when the payment is approved.")

  public Boolean getShopperApproved() {
    return shopperApproved;
  }


  public void setShopperApproved(Boolean shopperApproved) {
    this.shopperApproved = shopperApproved;
  }


  public ReceiptPrinting shopperCancelled(Boolean shopperCancelled) {
    
    this.shopperCancelled = shopperCancelled;
    return this;
  }

   /**
   * Print a shopper receipt when the transaction is cancelled.
   * @return shopperCancelled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Print a shopper receipt when the transaction is cancelled.")

  public Boolean getShopperCancelled() {
    return shopperCancelled;
  }


  public void setShopperCancelled(Boolean shopperCancelled) {
    this.shopperCancelled = shopperCancelled;
  }


  public ReceiptPrinting shopperCaptureApproved(Boolean shopperCaptureApproved) {
    
    this.shopperCaptureApproved = shopperCaptureApproved;
    return this;
  }

   /**
   * Print a shopper receipt when capturing the payment is approved.
   * @return shopperCaptureApproved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Print a shopper receipt when capturing the payment is approved.")

  public Boolean getShopperCaptureApproved() {
    return shopperCaptureApproved;
  }


  public void setShopperCaptureApproved(Boolean shopperCaptureApproved) {
    this.shopperCaptureApproved = shopperCaptureApproved;
  }


  public ReceiptPrinting shopperCaptureRefused(Boolean shopperCaptureRefused) {
    
    this.shopperCaptureRefused = shopperCaptureRefused;
    return this;
  }

   /**
   * Print a shopper receipt when capturing the payment is refused.
   * @return shopperCaptureRefused
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Print a shopper receipt when capturing the payment is refused.")

  public Boolean getShopperCaptureRefused() {
    return shopperCaptureRefused;
  }


  public void setShopperCaptureRefused(Boolean shopperCaptureRefused) {
    this.shopperCaptureRefused = shopperCaptureRefused;
  }


  public ReceiptPrinting shopperRefundApproved(Boolean shopperRefundApproved) {
    
    this.shopperRefundApproved = shopperRefundApproved;
    return this;
  }

   /**
   * Print a shopper receipt when the refund is approved.
   * @return shopperRefundApproved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Print a shopper receipt when the refund is approved.")

  public Boolean getShopperRefundApproved() {
    return shopperRefundApproved;
  }


  public void setShopperRefundApproved(Boolean shopperRefundApproved) {
    this.shopperRefundApproved = shopperRefundApproved;
  }


  public ReceiptPrinting shopperRefundRefused(Boolean shopperRefundRefused) {
    
    this.shopperRefundRefused = shopperRefundRefused;
    return this;
  }

   /**
   * Print a shopper receipt when the refund is refused.
   * @return shopperRefundRefused
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Print a shopper receipt when the refund is refused.")

  public Boolean getShopperRefundRefused() {
    return shopperRefundRefused;
  }


  public void setShopperRefundRefused(Boolean shopperRefundRefused) {
    this.shopperRefundRefused = shopperRefundRefused;
  }


  public ReceiptPrinting shopperRefused(Boolean shopperRefused) {
    
    this.shopperRefused = shopperRefused;
    return this;
  }

   /**
   * Print a shopper receipt when the payment is refused.
   * @return shopperRefused
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Print a shopper receipt when the payment is refused.")

  public Boolean getShopperRefused() {
    return shopperRefused;
  }


  public void setShopperRefused(Boolean shopperRefused) {
    this.shopperRefused = shopperRefused;
  }


  public ReceiptPrinting shopperVoid(Boolean shopperVoid) {
    
    this.shopperVoid = shopperVoid;
    return this;
  }

   /**
   * Print a shopper receipt when a previous transaction is voided.
   * @return shopperVoid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Print a shopper receipt when a previous transaction is voided.")

  public Boolean getShopperVoid() {
    return shopperVoid;
  }


  public void setShopperVoid(Boolean shopperVoid) {
    this.shopperVoid = shopperVoid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptPrinting receiptPrinting = (ReceiptPrinting) o;
    return Objects.equals(this.merchantApproved, receiptPrinting.merchantApproved) &&
        Objects.equals(this.merchantCancelled, receiptPrinting.merchantCancelled) &&
        Objects.equals(this.merchantCaptureApproved, receiptPrinting.merchantCaptureApproved) &&
        Objects.equals(this.merchantCaptureRefused, receiptPrinting.merchantCaptureRefused) &&
        Objects.equals(this.merchantRefundApproved, receiptPrinting.merchantRefundApproved) &&
        Objects.equals(this.merchantRefundRefused, receiptPrinting.merchantRefundRefused) &&
        Objects.equals(this.merchantRefused, receiptPrinting.merchantRefused) &&
        Objects.equals(this.merchantVoid, receiptPrinting.merchantVoid) &&
        Objects.equals(this.shopperApproved, receiptPrinting.shopperApproved) &&
        Objects.equals(this.shopperCancelled, receiptPrinting.shopperCancelled) &&
        Objects.equals(this.shopperCaptureApproved, receiptPrinting.shopperCaptureApproved) &&
        Objects.equals(this.shopperCaptureRefused, receiptPrinting.shopperCaptureRefused) &&
        Objects.equals(this.shopperRefundApproved, receiptPrinting.shopperRefundApproved) &&
        Objects.equals(this.shopperRefundRefused, receiptPrinting.shopperRefundRefused) &&
        Objects.equals(this.shopperRefused, receiptPrinting.shopperRefused) &&
        Objects.equals(this.shopperVoid, receiptPrinting.shopperVoid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantApproved, merchantCancelled, merchantCaptureApproved, merchantCaptureRefused, merchantRefundApproved, merchantRefundRefused, merchantRefused, merchantVoid, shopperApproved, shopperCancelled, shopperCaptureApproved, shopperCaptureRefused, shopperRefundApproved, shopperRefundRefused, shopperRefused, shopperVoid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptPrinting {\n");
    sb.append("    merchantApproved: ").append(toIndentedString(merchantApproved)).append("\n");
    sb.append("    merchantCancelled: ").append(toIndentedString(merchantCancelled)).append("\n");
    sb.append("    merchantCaptureApproved: ").append(toIndentedString(merchantCaptureApproved)).append("\n");
    sb.append("    merchantCaptureRefused: ").append(toIndentedString(merchantCaptureRefused)).append("\n");
    sb.append("    merchantRefundApproved: ").append(toIndentedString(merchantRefundApproved)).append("\n");
    sb.append("    merchantRefundRefused: ").append(toIndentedString(merchantRefundRefused)).append("\n");
    sb.append("    merchantRefused: ").append(toIndentedString(merchantRefused)).append("\n");
    sb.append("    merchantVoid: ").append(toIndentedString(merchantVoid)).append("\n");
    sb.append("    shopperApproved: ").append(toIndentedString(shopperApproved)).append("\n");
    sb.append("    shopperCancelled: ").append(toIndentedString(shopperCancelled)).append("\n");
    sb.append("    shopperCaptureApproved: ").append(toIndentedString(shopperCaptureApproved)).append("\n");
    sb.append("    shopperCaptureRefused: ").append(toIndentedString(shopperCaptureRefused)).append("\n");
    sb.append("    shopperRefundApproved: ").append(toIndentedString(shopperRefundApproved)).append("\n");
    sb.append("    shopperRefundRefused: ").append(toIndentedString(shopperRefundRefused)).append("\n");
    sb.append("    shopperRefused: ").append(toIndentedString(shopperRefused)).append("\n");
    sb.append("    shopperVoid: ").append(toIndentedString(shopperVoid)).append("\n");
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
