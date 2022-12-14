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
import org.openapitools.client.model.Currency;

/**
 * ModelConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class ModelConfiguration {
  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_CURRENCIES = "currencies";
  @SerializedName(SERIALIZED_NAME_CURRENCIES)
  private List<Currency> currencies = new ArrayList<Currency>();

  /**
   * Gets or Sets sources
   */
  @JsonAdapter(String.Adapter.class)
  public enum String {

    private String value;

    String(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static String fromValue(String value) {
      for (String b : String.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<String> {
      @Override
      public void write(final JsonWriter jsonWriter, final String enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public String read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return String.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SOURCES = "sources";
  @SerializedName(SERIALIZED_NAME_SOURCES)
  private SourcesEnum sources = null;

  public ModelConfiguration() { 
  }

  public ModelConfiguration brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * Payment method, like **eftpos_australia** or **mc**. See the [possible values](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api). 
   * @return brand
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Payment method, like **eftpos_australia** or **mc**. See the [possible values](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api). ")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public ModelConfiguration currencies(List<Currency> currencies) {
    
    this.currencies = currencies;
    return this;
  }

  public ModelConfiguration addCurrenciesItem(Currency currenciesItem) {
    this.currencies.add(currenciesItem);
    return this;
  }

   /**
   * Currency, and surcharge percentage or amount.
   * @return currencies
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Currency, and surcharge percentage or amount.")

  public List<Currency> getCurrencies() {
    return currencies;
  }


  public void setCurrencies(List<Currency> currencies) {
    this.currencies = currencies;
  }


  public ModelConfiguration sources(SourcesEnum sources) {
    
    this.sources = sources;
    return this;
  }

  public ModelConfiguration addSourcesItem(String sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<String>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * Funding source. Possible values: * **Credit** * **Debit**
   * @return sources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Funding source. Possible values: * **Credit** * **Debit**")

  public SourcesEnum getSources() {
    return sources;
  }


  public void setSources(SourcesEnum sources) {
    this.sources = sources;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelConfiguration _configuration = (ModelConfiguration) o;
    return Objects.equals(this.brand, _configuration.brand) &&
        Objects.equals(this.currencies, _configuration.currencies) &&
        Objects.equals(this.sources, _configuration.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, currencies, sources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelConfiguration {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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

