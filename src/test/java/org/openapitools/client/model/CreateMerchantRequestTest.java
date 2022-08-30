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
 * Model tests for CreateMerchantRequest
 */
public class CreateMerchantRequestTest {
    private final CreateMerchantRequest model = new CreateMerchantRequest();

    /**
     * Model tests for CreateMerchantRequest
     */
    @Test
    public void testCreateMerchantRequest() {
        // TODO: test CreateMerchantRequest
    }

    /**
     * Test the property 'businessLineId'
     */
    @Test
    public void businessLineIdTest() {
        // TODO: test businessLineId
    }

    /**
     * Test the property 'companyId'
     */
    @Test
    public void companyIdTest() {
        // TODO: test companyId
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'legalEntityId'
     */
    @Test
    public void legalEntityIdTest() {
        // TODO: test legalEntityId
    }

    /**
     * Test the property 'pricingPlan'
     */
    @Test
    public void pricingPlanTest() {
        // TODO: test pricingPlan
    }

    /**
     * Test the property 'reference'
     */
    @Test
    public void referenceTest() {
        // TODO: test reference
    }

}
