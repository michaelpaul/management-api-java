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
import org.openapitools.client.model.LinksElement;

/**
 * WebhookLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class WebhookLinks {
  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private LinksElement company;

  public static final String SERIALIZED_NAME_GENERATE_HMAC = "generateHmac";
  @SerializedName(SERIALIZED_NAME_GENERATE_HMAC)
  private LinksElement generateHmac;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private LinksElement merchant;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private LinksElement self;

  public static final String SERIALIZED_NAME_TEST_WEBHOOK = "testWebhook";
  @SerializedName(SERIALIZED_NAME_TEST_WEBHOOK)
  private LinksElement testWebhook;

  public WebhookLinks() { 
  }

  public WebhookLinks company(LinksElement company) {
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinksElement getCompany() {
    return company;
  }


  public void setCompany(LinksElement company) {
    this.company = company;
  }


  public WebhookLinks generateHmac(LinksElement generateHmac) {
    
    this.generateHmac = generateHmac;
    return this;
  }

   /**
   * Get generateHmac
   * @return generateHmac
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LinksElement getGenerateHmac() {
    return generateHmac;
  }


  public void setGenerateHmac(LinksElement generateHmac) {
    this.generateHmac = generateHmac;
  }


  public WebhookLinks merchant(LinksElement merchant) {
    
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinksElement getMerchant() {
    return merchant;
  }


  public void setMerchant(LinksElement merchant) {
    this.merchant = merchant;
  }


  public WebhookLinks self(LinksElement self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LinksElement getSelf() {
    return self;
  }


  public void setSelf(LinksElement self) {
    this.self = self;
  }


  public WebhookLinks testWebhook(LinksElement testWebhook) {
    
    this.testWebhook = testWebhook;
    return this;
  }

   /**
   * Get testWebhook
   * @return testWebhook
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LinksElement getTestWebhook() {
    return testWebhook;
  }


  public void setTestWebhook(LinksElement testWebhook) {
    this.testWebhook = testWebhook;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookLinks webhookLinks = (WebhookLinks) o;
    return Objects.equals(this.company, webhookLinks.company) &&
        Objects.equals(this.generateHmac, webhookLinks.generateHmac) &&
        Objects.equals(this.merchant, webhookLinks.merchant) &&
        Objects.equals(this.self, webhookLinks.self) &&
        Objects.equals(this.testWebhook, webhookLinks.testWebhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, generateHmac, merchant, self, testWebhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookLinks {\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    generateHmac: ").append(toIndentedString(generateHmac)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    testWebhook: ").append(toIndentedString(testWebhook)).append("\n");
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

