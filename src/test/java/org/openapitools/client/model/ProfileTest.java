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
import org.openapitools.client.model.ModelFile;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for Profile
 */
public class ProfileTest {
    private final Profile model = new Profile();

    /**
     * Model tests for Profile
     */
    @Test
    public void testProfile() {
        // TODO: test Profile
    }

    /**
     * Test the property 'authType'
     */
    @Test
    public void authTypeTest() {
        // TODO: test authType
    }

    /**
     * Test the property 'autoWifi'
     */
    @Test
    public void autoWifiTest() {
        // TODO: test autoWifi
    }

    /**
     * Test the property 'bssType'
     */
    @Test
    public void bssTypeTest() {
        // TODO: test bssType
    }

    /**
     * Test the property 'channel'
     */
    @Test
    public void channelTest() {
        // TODO: test channel
    }

    /**
     * Test the property 'defaultProfile'
     */
    @Test
    public void defaultProfileTest() {
        // TODO: test defaultProfile
    }

    /**
     * Test the property 'eap'
     */
    @Test
    public void eapTest() {
        // TODO: test eap
    }

    /**
     * Test the property 'eapCaCert'
     */
    @Test
    public void eapCaCertTest() {
        // TODO: test eapCaCert
    }

    /**
     * Test the property 'eapClientCert'
     */
    @Test
    public void eapClientCertTest() {
        // TODO: test eapClientCert
    }

    /**
     * Test the property 'eapClientKey'
     */
    @Test
    public void eapClientKeyTest() {
        // TODO: test eapClientKey
    }

    /**
     * Test the property 'eapClientPwd'
     */
    @Test
    public void eapClientPwdTest() {
        // TODO: test eapClientPwd
    }

    /**
     * Test the property 'eapIdentity'
     */
    @Test
    public void eapIdentityTest() {
        // TODO: test eapIdentity
    }

    /**
     * Test the property 'eapIntermediateCert'
     */
    @Test
    public void eapIntermediateCertTest() {
        // TODO: test eapIntermediateCert
    }

    /**
     * Test the property 'eapPwd'
     */
    @Test
    public void eapPwdTest() {
        // TODO: test eapPwd
    }

    /**
     * Test the property 'hiddenSsid'
     */
    @Test
    public void hiddenSsidTest() {
        // TODO: test hiddenSsid
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'psk'
     */
    @Test
    public void pskTest() {
        // TODO: test psk
    }

    /**
     * Test the property 'ssid'
     */
    @Test
    public void ssidTest() {
        // TODO: test ssid
    }

    /**
     * Test the property 'wsec'
     */
    @Test
    public void wsecTest() {
        // TODO: test wsec
    }

}
