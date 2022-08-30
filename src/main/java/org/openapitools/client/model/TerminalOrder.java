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
import org.openapitools.client.model.BillingEntity;
import org.openapitools.client.model.OrderItem;
import org.openapitools.client.model.ShippingLocation;

/**
 * TerminalOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class TerminalOrder {
  public static final String SERIALIZED_NAME_BILLING_ENTITY = "billingEntity";
  @SerializedName(SERIALIZED_NAME_BILLING_ENTITY)
  private BillingEntity billingEntity;

  public static final String SERIALIZED_NAME_CUSTOMER_ORDER_REFERENCE = "customerOrderReference";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ORDER_REFERENCE)
  private String customerOrderReference;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<OrderItem> items = null;

  public static final String SERIALIZED_NAME_ORDER_DATE = "orderDate";
  @SerializedName(SERIALIZED_NAME_ORDER_DATE)
  private String orderDate;

  public static final String SERIALIZED_NAME_SHIPPING_LOCATION = "shippingLocation";
  @SerializedName(SERIALIZED_NAME_SHIPPING_LOCATION)
  private ShippingLocation shippingLocation;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TRACKING_URL = "trackingUrl";
  @SerializedName(SERIALIZED_NAME_TRACKING_URL)
  private String trackingUrl;

  public TerminalOrder() { 
  }

  public TerminalOrder billingEntity(BillingEntity billingEntity) {
    
    this.billingEntity = billingEntity;
    return this;
  }

   /**
   * Get billingEntity
   * @return billingEntity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BillingEntity getBillingEntity() {
    return billingEntity;
  }


  public void setBillingEntity(BillingEntity billingEntity) {
    this.billingEntity = billingEntity;
  }


  public TerminalOrder customerOrderReference(String customerOrderReference) {
    
    this.customerOrderReference = customerOrderReference;
    return this;
  }

   /**
   * The merchant-defined purchase order number. This will be printed on the packing list.
   * @return customerOrderReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The merchant-defined purchase order number. This will be printed on the packing list.")

  public String getCustomerOrderReference() {
    return customerOrderReference;
  }


  public void setCustomerOrderReference(String customerOrderReference) {
    this.customerOrderReference = customerOrderReference;
  }


  public TerminalOrder id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the order.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the order.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TerminalOrder items(List<OrderItem> items) {
    
    this.items = items;
    return this;
  }

  public TerminalOrder addItemsItem(OrderItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<OrderItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The products included in the order.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The products included in the order.")

  public List<OrderItem> getItems() {
    return items;
  }


  public void setItems(List<OrderItem> items) {
    this.items = items;
  }


  public TerminalOrder orderDate(String orderDate) {
    
    this.orderDate = orderDate;
    return this;
  }

   /**
   * The date and time that the order was placed, in UTC ISO 8601 format. For example, \&quot;2011-12-03T10:15:30Z\&quot;.
   * @return orderDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time that the order was placed, in UTC ISO 8601 format. For example, \"2011-12-03T10:15:30Z\".")

  public String getOrderDate() {
    return orderDate;
  }


  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }


  public TerminalOrder shippingLocation(ShippingLocation shippingLocation) {
    
    this.shippingLocation = shippingLocation;
    return this;
  }

   /**
   * Get shippingLocation
   * @return shippingLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShippingLocation getShippingLocation() {
    return shippingLocation;
  }


  public void setShippingLocation(ShippingLocation shippingLocation) {
    this.shippingLocation = shippingLocation;
  }


  public TerminalOrder status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The processing status of the order.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The processing status of the order.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public TerminalOrder trackingUrl(String trackingUrl) {
    
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * The URL, provided by the carrier company, where the shipment can be tracked.
   * @return trackingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL, provided by the carrier company, where the shipment can be tracked.")

  public String getTrackingUrl() {
    return trackingUrl;
  }


  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalOrder terminalOrder = (TerminalOrder) o;
    return Objects.equals(this.billingEntity, terminalOrder.billingEntity) &&
        Objects.equals(this.customerOrderReference, terminalOrder.customerOrderReference) &&
        Objects.equals(this.id, terminalOrder.id) &&
        Objects.equals(this.items, terminalOrder.items) &&
        Objects.equals(this.orderDate, terminalOrder.orderDate) &&
        Objects.equals(this.shippingLocation, terminalOrder.shippingLocation) &&
        Objects.equals(this.status, terminalOrder.status) &&
        Objects.equals(this.trackingUrl, terminalOrder.trackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingEntity, customerOrderReference, id, items, orderDate, shippingLocation, status, trackingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalOrder {\n");
    sb.append("    billingEntity: ").append(toIndentedString(billingEntity)).append("\n");
    sb.append("    customerOrderReference: ").append(toIndentedString(customerOrderReference)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    shippingLocation: ").append(toIndentedString(shippingLocation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
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
