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
import org.openapitools.client.model.DataCenter;
import org.openapitools.client.model.MerchantLinks;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for Merchant
 */
public class MerchantTest {
    private final Merchant model = new Merchant();

    /**
     * Model tests for Merchant
     */
    @Test
    public void testMerchant() {
        // TODO: test Merchant
    }

    /**
     * Test the property 'links'
     */
    @Test
    public void linksTest() {
        // TODO: test links
    }

    /**
     * Test the property 'captureDelay'
     */
    @Test
    public void captureDelayTest() {
        // TODO: test captureDelay
    }

    /**
     * Test the property 'companyId'
     */
    @Test
    public void companyIdTest() {
        // TODO: test companyId
    }

    /**
     * Test the property 'dataCenters'
     */
    @Test
    public void dataCentersTest() {
        // TODO: test dataCenters
    }

    /**
     * Test the property 'defaultShopperInteraction'
     */
    @Test
    public void defaultShopperInteractionTest() {
        // TODO: test defaultShopperInteraction
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'merchantCity'
     */
    @Test
    public void merchantCityTest() {
        // TODO: test merchantCity
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'pricingPlan'
     */
    @Test
    public void pricingPlanTest() {
        // TODO: test pricingPlan
    }

    /**
     * Test the property 'primarySettlementCurrency'
     */
    @Test
    public void primarySettlementCurrencyTest() {
        // TODO: test primarySettlementCurrency
    }

    /**
     * Test the property 'reference'
     */
    @Test
    public void referenceTest() {
        // TODO: test reference
    }

    /**
     * Test the property 'shopWebAddress'
     */
    @Test
    public void shopWebAddressTest() {
        // TODO: test shopWebAddress
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

}
