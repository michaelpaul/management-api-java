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
 * TestOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class TestOutput {
  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchantId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_OUTPUT = "output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private String output;

  public static final String SERIALIZED_NAME_REQUEST_SENT = "requestSent";
  @SerializedName(SERIALIZED_NAME_REQUEST_SENT)
  private String requestSent;

  public static final String SERIALIZED_NAME_RESPONSE_CODE = "responseCode";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CODE)
  private String responseCode;

  public static final String SERIALIZED_NAME_RESPONSE_TIME = "responseTime";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TIME)
  private String responseTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public TestOutput() { 
  }

  public TestOutput merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Unique identifier of the merchant account that the notification is about.
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the merchant account that the notification is about.")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public TestOutput output(String output) {
    
    this.output = output;
    return this;
  }

   /**
   * The response your server returned for the test webhook.  Your server must respond with **[accepted]** for the test webhook to be successful (&#x60;data.status&#x60;: **success**). Find out more about [accepting notifications](https://docs.adyen.com/development-resources/webhooks#accept-notifications)  You can use the value of this field together with the [&#x60;responseCode&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot unsuccessful test webhooks.
   * @return output
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The response your server returned for the test webhook.  Your server must respond with **[accepted]** for the test webhook to be successful (`data.status`: **success**). Find out more about [accepting notifications](https://docs.adyen.com/development-resources/webhooks#accept-notifications)  You can use the value of this field together with the [`responseCode`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot unsuccessful test webhooks.")

  public String getOutput() {
    return output;
  }


  public void setOutput(String output) {
    this.output = output;
  }


  public TestOutput requestSent(String requestSent) {
    
    this.requestSent = requestSent;
    return this;
  }

   /**
   * The [body of the notification webhook](https://docs.adyen.com/development-resources/webhooks/understand-notifications#notification-structure) that was sent to your server.
   * @return requestSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [body of the notification webhook](https://docs.adyen.com/development-resources/webhooks/understand-notifications#notification-structure) that was sent to your server.")

  public String getRequestSent() {
    return requestSent;
  }


  public void setRequestSent(String requestSent) {
    this.requestSent = requestSent;
  }


  public TestOutput responseCode(String responseCode) {
    
    this.responseCode = responseCode;
    return this;
  }

   /**
   * The HTTP response code for your server&#39;s response to the test webhook.  You can use the value of this field together with the the [&#x60;output&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field value to troubleshoot failed test webhooks.
   * @return responseCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "The HTTP response code for your server's response to the test webhook.  You can use the value of this field together with the the [`output`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field value to troubleshoot failed test webhooks.")

  public String getResponseCode() {
    return responseCode;
  }


  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }


  public TestOutput responseTime(String responseTime) {
    
    this.responseTime = responseTime;
    return this;
  }

   /**
   * The time between sending the test webhook and receiving the response from your server. You can use it as an indication of how long your server takes to process a webhook notification. Measured in milliseconds, for example **304 ms**.
   * @return responseTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time between sending the test webhook and receiving the response from your server. You can use it as an indication of how long your server takes to process a webhook notification. Measured in milliseconds, for example **304 ms**.")

  public String getResponseTime() {
    return responseTime;
  }


  public void setResponseTime(String responseTime) {
    this.responseTime = responseTime;
  }


  public TestOutput status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the test request. Possible values are: * **success**, if &#x60;data.output&#x60;: **[accepted]** and &#x60;data.responseCode&#x60;: **200**. * **failed**, in all other cases.  You can use the value of the [&#x60;output&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field together with the [&#x60;responseCode&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot failed test webhooks.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The status of the test request. Possible values are: * **success**, if `data.output`: **[accepted]** and `data.responseCode`: **200**. * **failed**, in all other cases.  You can use the value of the [`output`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-output) field together with the [`responseCode`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/merchants/{merchantId}/webhooks/{id}/test__resParam_data-responseCode) value to troubleshoot failed test webhooks.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestOutput testOutput = (TestOutput) o;
    return Objects.equals(this.merchantId, testOutput.merchantId) &&
        Objects.equals(this.output, testOutput.output) &&
        Objects.equals(this.requestSent, testOutput.requestSent) &&
        Objects.equals(this.responseCode, testOutput.responseCode) &&
        Objects.equals(this.responseTime, testOutput.responseTime) &&
        Objects.equals(this.status, testOutput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, output, requestSent, responseCode, responseTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestOutput {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    requestSent: ").append(toIndentedString(requestSent)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

