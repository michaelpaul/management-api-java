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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for Address
 */
public class AddressTest {
    private final Address model = new Address();

    /**
     * Model tests for Address
     */
    @Test
    public void testAddress() {
        // TODO: test Address
    }

    /**
     * Test the property 'city'
     */
    @Test
    public void cityTest() {
        // TODO: test city
    }

    /**
     * Test the property 'companyName'
     */
    @Test
    public void companyNameTest() {
        // TODO: test companyName
    }

    /**
     * Test the property 'country'
     */
    @Test
    public void countryTest() {
        // TODO: test country
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

    /**
     * Test the property 'streetAddress'
     */
    @Test
    public void streetAddressTest() {
        // TODO: test streetAddress
    }

    /**
     * Test the property 'streetAddress2'
     */
    @Test
    public void streetAddress2Test() {
        // TODO: test streetAddress2
    }

}
