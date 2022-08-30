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
 * KlarnaInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
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

}

