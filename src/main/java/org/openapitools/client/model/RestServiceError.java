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
import org.openapitools.client.model.InvalidField;
import org.openapitools.client.model.JSONObject;

/**
 * RestServiceError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class RestServiceError {
  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_INSTANCE = "instance";
  @SerializedName(SERIALIZED_NAME_INSTANCE)
  private String instance;

  public static final String SERIALIZED_NAME_INVALID_FIELDS = "invalidFields";
  @SerializedName(SERIALIZED_NAME_INVALID_FIELDS)
  private List<InvalidField> invalidFields = null;

  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private JSONObject response;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public RestServiceError() { 
  }

  public RestServiceError detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * A human-readable explanation specific to this occurrence of the problem.
   * @return detail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A human-readable explanation specific to this occurrence of the problem.")

  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }


  public RestServiceError errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * A code that identifies the problem type.
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A code that identifies the problem type.")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public RestServiceError instance(String instance) {
    
    this.instance = instance;
    return this;
  }

   /**
   * A unique URI that identifies the specific occurrence of the problem.
   * @return instance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique URI that identifies the specific occurrence of the problem.")

  public String getInstance() {
    return instance;
  }


  public void setInstance(String instance) {
    this.instance = instance;
  }


  public RestServiceError invalidFields(List<InvalidField> invalidFields) {
    
    this.invalidFields = invalidFields;
    return this;
  }

  public RestServiceError addInvalidFieldsItem(InvalidField invalidFieldsItem) {
    if (this.invalidFields == null) {
      this.invalidFields = new ArrayList<InvalidField>();
    }
    this.invalidFields.add(invalidFieldsItem);
    return this;
  }

   /**
   * Detailed explanation of each validation error, when applicable.
   * @return invalidFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Detailed explanation of each validation error, when applicable.")

  public List<InvalidField> getInvalidFields() {
    return invalidFields;
  }


  public void setInvalidFields(List<InvalidField> invalidFields) {
    this.invalidFields = invalidFields;
  }


  public RestServiceError requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique reference for the request, essentially the same as &#x60;pspReference&#x60;.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique reference for the request, essentially the same as `pspReference`.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public RestServiceError response(JSONObject response) {
    
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JSONObject getResponse() {
    return response;
  }


  public void setResponse(JSONObject response) {
    this.response = response;
  }


  public RestServiceError status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * The HTTP status code.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The HTTP status code.")

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public RestServiceError title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * A short, human-readable summary of the problem type.
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A short, human-readable summary of the problem type.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public RestServiceError type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * A URI that identifies the problem type, pointing to human-readable documentation on this problem type.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A URI that identifies the problem type, pointing to human-readable documentation on this problem type.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestServiceError restServiceError = (RestServiceError) o;
    return Objects.equals(this.detail, restServiceError.detail) &&
        Objects.equals(this.errorCode, restServiceError.errorCode) &&
        Objects.equals(this.instance, restServiceError.instance) &&
        Objects.equals(this.invalidFields, restServiceError.invalidFields) &&
        Objects.equals(this.requestId, restServiceError.requestId) &&
        Objects.equals(this.response, restServiceError.response) &&
        Objects.equals(this.status, restServiceError.status) &&
        Objects.equals(this.title, restServiceError.title) &&
        Objects.equals(this.type, restServiceError.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, errorCode, instance, invalidFields, requestId, response, status, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestServiceError {\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    invalidFields: ").append(toIndentedString(invalidFields)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
