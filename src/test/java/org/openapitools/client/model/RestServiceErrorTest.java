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
import org.openapitools.client.model.InvalidField;
import org.openapitools.client.model.JSONObject;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for RestServiceError
 */
public class RestServiceErrorTest {
    private final RestServiceError model = new RestServiceError();

    /**
     * Model tests for RestServiceError
     */
    @Test
    public void testRestServiceError() {
        // TODO: test RestServiceError
    }

    /**
     * Test the property 'detail'
     */
    @Test
    public void detailTest() {
        // TODO: test detail
    }

    /**
     * Test the property 'errorCode'
     */
    @Test
    public void errorCodeTest() {
        // TODO: test errorCode
    }

    /**
     * Test the property 'instance'
     */
    @Test
    public void instanceTest() {
        // TODO: test instance
    }

    /**
     * Test the property 'invalidFields'
     */
    @Test
    public void invalidFieldsTest() {
        // TODO: test invalidFields
    }

    /**
     * Test the property 'requestId'
     */
    @Test
    public void requestIdTest() {
        // TODO: test requestId
    }

    /**
     * Test the property 'response'
     */
    @Test
    public void responseTest() {
        // TODO: test response
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'title'
     */
    @Test
    public void titleTest() {
        // TODO: test title
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

}