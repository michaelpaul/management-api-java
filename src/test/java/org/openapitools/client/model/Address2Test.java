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
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for Address2
 */
public class Address2Test {
    private final Address2 model = new Address2();

    /**
     * Model tests for Address2
     */
    @Test
    public void testAddress2() {
        // TODO: test Address2
    }

    /**
     * Test the property 'city'
     */
    @Test
    public void cityTest() {
        // TODO: test city
    }

    /**
     * Test the property 'country'
     */
    @Test
    public void countryTest() {
        // TODO: test country
    }

    /**
     * Test the property 'line1'
     */
    @Test
    public void line1Test() {
        // TODO: test line1
    }

    /**
     * Test the property 'line2'
     */
    @Test
    public void line2Test() {
        // TODO: test line2
    }

    /**
     * Test the property 'line3'
     */
    @Test
    public void line3Test() {
        // TODO: test line3
    }

    /**
     * Test the property 'postalCode'
     */
    @Test
    public void postalCodeTest() {
        // TODO: test postalCode
    }

    /**
     * Test the property 'stateOrProvince'
     */
    @Test
    public void stateOrProvinceTest() {
        // TODO: test stateOrProvince
    }

}