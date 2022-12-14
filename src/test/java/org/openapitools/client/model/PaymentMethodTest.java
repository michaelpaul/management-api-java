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
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for PaymentMethod
 */
public class PaymentMethodTest {
    private final PaymentMethod model = new PaymentMethod();

    /**
     * Model tests for PaymentMethod
     */
    @Test
    public void testPaymentMethod() {
        // TODO: test PaymentMethod
    }

    /**
     * Test the property 'applePay'
     */
    @Test
    public void applePayTest() {
        // TODO: test applePay
    }

    /**
     * Test the property 'bcmc'
     */
    @Test
    public void bcmcTest() {
        // TODO: test bcmc
    }

    /**
     * Test the property 'businessLineId'
     */
    @Test
    public void businessLineIdTest() {
        // TODO: test businessLineId
    }

    /**
     * Test the property 'cartesBancaires'
     */
    @Test
    public void cartesBancairesTest() {
        // TODO: test cartesBancaires
    }

    /**
     * Test the property 'countries'
     */
    @Test
    public void countriesTest() {
        // TODO: test countries
    }

    /**
     * Test the property 'currencies'
     */
    @Test
    public void currenciesTest() {
        // TODO: test currencies
    }

    /**
     * Test the property 'enabled'
     */
    @Test
    public void enabledTest() {
        // TODO: test enabled
    }

    /**
     * Test the property 'giroPay'
     */
    @Test
    public void giroPayTest() {
        // TODO: test giroPay
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'klarna'
     */
    @Test
    public void klarnaTest() {
        // TODO: test klarna
    }

    /**
     * Test the property 'paypal'
     */
    @Test
    public void paypalTest() {
        // TODO: test paypal
    }

    /**
     * Test the property 'sofort'
     */
    @Test
    public void sofortTest() {
        // TODO: test sofort
    }

    /**
     * Test the property 'storeId'
     */
    @Test
    public void storeIdTest() {
        // TODO: test storeId
    }

    /**
     * Test the property 'swish'
     */
    @Test
    public void swishTest() {
        // TODO: test swish
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

}
