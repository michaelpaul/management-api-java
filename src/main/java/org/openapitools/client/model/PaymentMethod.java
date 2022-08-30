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
import org.openapitools.client.model.ApplePayInfo;
import org.openapitools.client.model.BcmcInfo;
import org.openapitools.client.model.CartesBancairesInfo;
import org.openapitools.client.model.GiroPayInfo;
import org.openapitools.client.model.KlarnaInfo;
import org.openapitools.client.model.PayPalInfo;
import org.openapitools.client.model.SofortInfo;
import org.openapitools.client.model.SwishInfo;

/**
 * PaymentMethod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class PaymentMethod {
  public static final String SERIALIZED_NAME_APPLE_PAY = "applePay";
  @SerializedName(SERIALIZED_NAME_APPLE_PAY)
  private ApplePayInfo applePay;

  public static final String SERIALIZED_NAME_BCMC = "bcmc";
  @SerializedName(SERIALIZED_NAME_BCMC)
  private BcmcInfo bcmc;

  public static final String SERIALIZED_NAME_BUSINESS_LINE_ID = "businessLineId";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LINE_ID)
  private String businessLineId;

  public static final String SERIALIZED_NAME_CARTES_BANCAIRES = "cartesBancaires";
  @SerializedName(SERIALIZED_NAME_CARTES_BANCAIRES)
  private CartesBancairesInfo cartesBancaires;

  public static final String SERIALIZED_NAME_COUNTRIES = "countries";
  @SerializedName(SERIALIZED_NAME_COUNTRIES)
  private List<String> countries = null;

  public static final String SERIALIZED_NAME_CURRENCIES = "currencies";
  @SerializedName(SERIALIZED_NAME_CURRENCIES)
  private List<String> currencies = null;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_GIRO_PAY = "giroPay";
  @SerializedName(SERIALIZED_NAME_GIRO_PAY)
  private GiroPayInfo giroPay;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KLARNA = "klarna";
  @SerializedName(SERIALIZED_NAME_KLARNA)
  private KlarnaInfo klarna;

  public static final String SERIALIZED_NAME_PAYPAL = "paypal";
  @SerializedName(SERIALIZED_NAME_PAYPAL)
  private PayPalInfo paypal;

  public static final String SERIALIZED_NAME_SOFORT = "sofort";
  @SerializedName(SERIALIZED_NAME_SOFORT)
  private SofortInfo sofort;

  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_SWISH = "swish";
  @SerializedName(SERIALIZED_NAME_SWISH)
  private SwishInfo swish;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public PaymentMethod() { 
  }

  public PaymentMethod applePay(ApplePayInfo applePay) {
    
    this.applePay = applePay;
    return this;
  }

   /**
   * Get applePay
   * @return applePay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplePayInfo getApplePay() {
    return applePay;
  }


  public void setApplePay(ApplePayInfo applePay) {
    this.applePay = applePay;
  }


  public PaymentMethod bcmc(BcmcInfo bcmc) {
    
    this.bcmc = bcmc;
    return this;
  }

   /**
   * Get bcmc
   * @return bcmc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BcmcInfo getBcmc() {
    return bcmc;
  }


  public void setBcmc(BcmcInfo bcmc) {
    this.bcmc = bcmc;
  }


  public PaymentMethod businessLineId(String businessLineId) {
    
    this.businessLineId = businessLineId;
    return this;
  }

   /**
   * The unique identifier of the business line.
   * @return businessLineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the business line.")

  public String getBusinessLineId() {
    return businessLineId;
  }


  public void setBusinessLineId(String businessLineId) {
    this.businessLineId = businessLineId;
  }


  public PaymentMethod cartesBancaires(CartesBancairesInfo cartesBancaires) {
    
    this.cartesBancaires = cartesBancaires;
    return this;
  }

   /**
   * Get cartesBancaires
   * @return cartesBancaires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CartesBancairesInfo getCartesBancaires() {
    return cartesBancaires;
  }


  public void setCartesBancaires(CartesBancairesInfo cartesBancaires) {
    this.cartesBancaires = cartesBancaires;
  }


  public PaymentMethod countries(List<String> countries) {
    
    this.countries = countries;
    return this;
  }

  public PaymentMethod addCountriesItem(String countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<String>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * The list of countries where a payment method is available. By default, all countries supported by the payment method.
   * @return countries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of countries where a payment method is available. By default, all countries supported by the payment method.")

  public List<String> getCountries() {
    return countries;
  }


  public void setCountries(List<String> countries) {
    this.countries = countries;
  }


  public PaymentMethod currencies(List<String> currencies) {
    
    this.currencies = currencies;
    return this;
  }

  public PaymentMethod addCurrenciesItem(String currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new ArrayList<String>();
    }
    this.currencies.add(currenciesItem);
    return this;
  }

   /**
   * The list of currencies that a payment method supports. By default, all currencies supported by the payment method.
   * @return currencies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of currencies that a payment method supports. By default, all currencies supported by the payment method.")

  public List<String> getCurrencies() {
    return currencies;
  }


  public void setCurrencies(List<String> currencies) {
    this.currencies = currencies;
  }


  public PaymentMethod enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the payment method is enabled (**true**) or disabled (**false**).
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the payment method is enabled (**true**) or disabled (**false**).")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public PaymentMethod giroPay(GiroPayInfo giroPay) {
    
    this.giroPay = giroPay;
    return this;
  }

   /**
   * Get giroPay
   * @return giroPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GiroPayInfo getGiroPay() {
    return giroPay;
  }


  public void setGiroPay(GiroPayInfo giroPay) {
    this.giroPay = giroPay;
  }


  public PaymentMethod id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The identifier of the resource.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier of the resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PaymentMethod klarna(KlarnaInfo klarna) {
    
    this.klarna = klarna;
    return this;
  }

   /**
   * Get klarna
   * @return klarna
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KlarnaInfo getKlarna() {
    return klarna;
  }


  public void setKlarna(KlarnaInfo klarna) {
    this.klarna = klarna;
  }


  public PaymentMethod paypal(PayPalInfo paypal) {
    
    this.paypal = paypal;
    return this;
  }

   /**
   * Get paypal
   * @return paypal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayPalInfo getPaypal() {
    return paypal;
  }


  public void setPaypal(PayPalInfo paypal) {
    this.paypal = paypal;
  }


  public PaymentMethod sofort(SofortInfo sofort) {
    
    this.sofort = sofort;
    return this;
  }

   /**
   * Get sofort
   * @return sofort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SofortInfo getSofort() {
    return sofort;
  }


  public void setSofort(SofortInfo sofort) {
    this.sofort = sofort;
  }


  public PaymentMethod storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * The ID of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/post/stores__resParam_id), if any.
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/post/stores__resParam_id), if any.")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public PaymentMethod swish(SwishInfo swish) {
    
    this.swish = swish;
    return this;
  }

   /**
   * Get swish
   * @return swish
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SwishInfo getSwish() {
    return swish;
  }


  public void setSwish(SwishInfo swish) {
    this.swish = swish;
  }


  public PaymentMethod type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api).
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api).")

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
    PaymentMethod paymentMethod = (PaymentMethod) o;
    return Objects.equals(this.applePay, paymentMethod.applePay) &&
        Objects.equals(this.bcmc, paymentMethod.bcmc) &&
        Objects.equals(this.businessLineId, paymentMethod.businessLineId) &&
        Objects.equals(this.cartesBancaires, paymentMethod.cartesBancaires) &&
        Objects.equals(this.countries, paymentMethod.countries) &&
        Objects.equals(this.currencies, paymentMethod.currencies) &&
        Objects.equals(this.enabled, paymentMethod.enabled) &&
        Objects.equals(this.giroPay, paymentMethod.giroPay) &&
        Objects.equals(this.id, paymentMethod.id) &&
        Objects.equals(this.klarna, paymentMethod.klarna) &&
        Objects.equals(this.paypal, paymentMethod.paypal) &&
        Objects.equals(this.sofort, paymentMethod.sofort) &&
        Objects.equals(this.storeId, paymentMethod.storeId) &&
        Objects.equals(this.swish, paymentMethod.swish) &&
        Objects.equals(this.type, paymentMethod.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applePay, bcmc, businessLineId, cartesBancaires, countries, currencies, enabled, giroPay, id, klarna, paypal, sofort, storeId, swish, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethod {\n");
    sb.append("    applePay: ").append(toIndentedString(applePay)).append("\n");
    sb.append("    bcmc: ").append(toIndentedString(bcmc)).append("\n");
    sb.append("    businessLineId: ").append(toIndentedString(businessLineId)).append("\n");
    sb.append("    cartesBancaires: ").append(toIndentedString(cartesBancaires)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    giroPay: ").append(toIndentedString(giroPay)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    klarna: ").append(toIndentedString(klarna)).append("\n");
    sb.append("    paypal: ").append(toIndentedString(paypal)).append("\n");
    sb.append("    sofort: ").append(toIndentedString(sofort)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    swish: ").append(toIndentedString(swish)).append("\n");
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
