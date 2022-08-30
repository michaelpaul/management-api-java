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
import org.openapitools.client.model.Address2;
import org.openapitools.client.model.StoreSplitConfiguration;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for StoreCreationWithMerchantCodeRequest
 */
public class StoreCreationWithMerchantCodeRequestTest {
    private final StoreCreationWithMerchantCodeRequest model = new StoreCreationWithMerchantCodeRequest();

    /**
     * Model tests for StoreCreationWithMerchantCodeRequest
     */
    @Test
    public void testStoreCreationWithMerchantCodeRequest() {
        // TODO: test StoreCreationWithMerchantCodeRequest
    }

    /**
     * Test the property 'address'
     */
    @Test
    public void addressTest() {
        // TODO: test address
    }

    /**
     * Test the property 'businessLineIds'
     */
    @Test
    public void businessLineIdsTest() {
        // TODO: test businessLineIds
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'externalReferenceId'
     */
    @Test
    public void externalReferenceIdTest() {
        // TODO: test externalReferenceId
    }

    /**
     * Test the property 'merchantId'
     */
    @Test
    public void merchantIdTest() {
        // TODO: test merchantId
    }

    /**
     * Test the property 'phoneNumber'
     */
    @Test
    public void phoneNumberTest() {
        // TODO: test phoneNumber
    }

    /**
     * Test the property 'reference'
     */
    @Test
    public void referenceTest() {
        // TODO: test reference
    }

    /**
     * Test the property 'shopperStatement'
     */
    @Test
    public void shopperStatementTest() {
        // TODO: test shopperStatement
    }

    /**
     * Test the property 'splitConfiguration'
     */
    @Test
    public void splitConfigurationTest() {
        // TODO: test splitConfiguration
    }

}
