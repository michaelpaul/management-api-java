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
import org.openapitools.client.model.AdditionalSettingsResponse;
import org.openapitools.client.model.WebhookLinks;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for Webhook
 */
public class WebhookTest {
    private final Webhook model = new Webhook();

    /**
     * Model tests for Webhook
     */
    @Test
    public void testWebhook() {
        // TODO: test Webhook
    }

    /**
     * Test the property 'links'
     */
    @Test
    public void linksTest() {
        // TODO: test links
    }

    /**
     * Test the property 'acceptsExpiredCertificate'
     */
    @Test
    public void acceptsExpiredCertificateTest() {
        // TODO: test acceptsExpiredCertificate
    }

    /**
     * Test the property 'acceptsSelfSignedCertificate'
     */
    @Test
    public void acceptsSelfSignedCertificateTest() {
        // TODO: test acceptsSelfSignedCertificate
    }

    /**
     * Test the property 'acceptsUntrustedRootCertificate'
     */
    @Test
    public void acceptsUntrustedRootCertificateTest() {
        // TODO: test acceptsUntrustedRootCertificate
    }

    /**
     * Test the property 'accountReference'
     */
    @Test
    public void accountReferenceTest() {
        // TODO: test accountReference
    }

    /**
     * Test the property 'active'
     */
    @Test
    public void activeTest() {
        // TODO: test active
    }

    /**
     * Test the property 'additionalSettings'
     */
    @Test
    public void additionalSettingsTest() {
        // TODO: test additionalSettings
    }

    /**
     * Test the property 'certificateAlias'
     */
    @Test
    public void certificateAliasTest() {
        // TODO: test certificateAlias
    }

    /**
     * Test the property 'communicationFormat'
     */
    @Test
    public void communicationFormatTest() {
        // TODO: test communicationFormat
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'filterMerchantAccountType'
     */
    @Test
    public void filterMerchantAccountTypeTest() {
        // TODO: test filterMerchantAccountType
    }

    /**
     * Test the property 'filterMerchantAccounts'
     */
    @Test
    public void filterMerchantAccountsTest() {
        // TODO: test filterMerchantAccounts
    }

    /**
     * Test the property 'hasError'
     */
    @Test
    public void hasErrorTest() {
        // TODO: test hasError
    }

    /**
     * Test the property 'hasPassword'
     */
    @Test
    public void hasPasswordTest() {
        // TODO: test hasPassword
    }

    /**
     * Test the property 'hmacKeyCheckValue'
     */
    @Test
    public void hmacKeyCheckValueTest() {
        // TODO: test hmacKeyCheckValue
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'networkType'
     */
    @Test
    public void networkTypeTest() {
        // TODO: test networkType
    }

    /**
     * Test the property 'populateSoapActionHeader'
     */
    @Test
    public void populateSoapActionHeaderTest() {
        // TODO: test populateSoapActionHeader
    }

    /**
     * Test the property 'sslVersion'
     */
    @Test
    public void sslVersionTest() {
        // TODO: test sslVersion
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'url'
     */
    @Test
    public void urlTest() {
        // TODO: test url
    }

    /**
     * Test the property 'username'
     */
    @Test
    public void usernameTest() {
        // TODO: test username
    }

}
