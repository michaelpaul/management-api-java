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
 * Model tests for TestOutput
 */
public class TestOutputTest {
    private final TestOutput model = new TestOutput();

    /**
     * Model tests for TestOutput
     */
    @Test
    public void testTestOutput() {
        // TODO: test TestOutput
    }

    /**
     * Test the property 'merchantId'
     */
    @Test
    public void merchantIdTest() {
        // TODO: test merchantId
    }

    /**
     * Test the property 'output'
     */
    @Test
    public void outputTest() {
        // TODO: test output
    }

    /**
     * Test the property 'requestSent'
     */
    @Test
    public void requestSentTest() {
        // TODO: test requestSent
    }

    /**
     * Test the property 'responseCode'
     */
    @Test
    public void responseCodeTest() {
        // TODO: test responseCode
    }

    /**
     * Test the property 'responseTime'
     */
    @Test
    public void responseTimeTest() {
        // TODO: test responseTime
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

}
