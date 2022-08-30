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
import org.openapitools.client.model.PaginationLinks;
import org.openapitools.client.model.Store;

/**
 * ListStoresResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class ListStoresResponse {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private PaginationLinks links;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<Store> data = null;

  public static final String SERIALIZED_NAME_ITEMS_TOTAL = "itemsTotal";
  @SerializedName(SERIALIZED_NAME_ITEMS_TOTAL)
  private Integer itemsTotal;

  public static final String SERIALIZED_NAME_PAGES_TOTAL = "pagesTotal";
  @SerializedName(SERIALIZED_NAME_PAGES_TOTAL)
  private Integer pagesTotal;

  public ListStoresResponse() { 
  }

  public ListStoresResponse links(PaginationLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaginationLinks getLinks() {
    return links;
  }


  public void setLinks(PaginationLinks links) {
    this.links = links;
  }


  public ListStoresResponse data(List<Store> data) {
    
    this.data = data;
    return this;
  }

  public ListStoresResponse addDataItem(Store dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<Store>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Store> getData() {
    return data;
  }


  public void setData(List<Store> data) {
    this.data = data;
  }


  public ListStoresResponse itemsTotal(Integer itemsTotal) {
    
    this.itemsTotal = itemsTotal;
    return this;
  }

   /**
   * Total number of items.
   * @return itemsTotal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Total number of items.")

  public Integer getItemsTotal() {
    return itemsTotal;
  }


  public void setItemsTotal(Integer itemsTotal) {
    this.itemsTotal = itemsTotal;
  }


  public ListStoresResponse pagesTotal(Integer pagesTotal) {
    
    this.pagesTotal = pagesTotal;
    return this;
  }

   /**
   * Total number of pages.
   * @return pagesTotal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Total number of pages.")

  public Integer getPagesTotal() {
    return pagesTotal;
  }


  public void setPagesTotal(Integer pagesTotal) {
    this.pagesTotal = pagesTotal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListStoresResponse listStoresResponse = (ListStoresResponse) o;
    return Objects.equals(this.links, listStoresResponse.links) &&
        Objects.equals(this.data, listStoresResponse.data) &&
        Objects.equals(this.itemsTotal, listStoresResponse.itemsTotal) &&
        Objects.equals(this.pagesTotal, listStoresResponse.pagesTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, data, itemsTotal, pagesTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListStoresResponse {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    itemsTotal: ").append(toIndentedString(itemsTotal)).append("\n");
    sb.append("    pagesTotal: ").append(toIndentedString(pagesTotal)).append("\n");
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
