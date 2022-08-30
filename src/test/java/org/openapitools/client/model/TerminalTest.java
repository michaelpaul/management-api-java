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
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for Terminal
 */
public class TerminalTest {
    private final Terminal model = new Terminal();

    /**
     * Model tests for Terminal
     */
    @Test
    public void testTerminal() {
        // TODO: test Terminal
    }

    /**
     * Test the property 'assigned'
     */
    @Test
    public void assignedTest() {
        // TODO: test assigned
    }

    /**
     * Test the property 'bluetoothIp'
     */
    @Test
    public void bluetoothIpTest() {
        // TODO: test bluetoothIp
    }

    /**
     * Test the property 'bluetoothMac'
     */
    @Test
    public void bluetoothMacTest() {
        // TODO: test bluetoothMac
    }

    /**
     * Test the property 'city'
     */
    @Test
    public void cityTest() {
        // TODO: test city
    }

    /**
     * Test the property 'companyAccount'
     */
    @Test
    public void companyAccountTest() {
        // TODO: test companyAccount
    }

    /**
     * Test the property 'countryCode'
     */
    @Test
    public void countryCodeTest() {
        // TODO: test countryCode
    }

    /**
     * Test the property 'deviceModel'
     */
    @Test
    public void deviceModelTest() {
        // TODO: test deviceModel
    }

    /**
     * Test the property 'ethernetIp'
     */
    @Test
    public void ethernetIpTest() {
        // TODO: test ethernetIp
    }

    /**
     * Test the property 'ethernetMac'
     */
    @Test
    public void ethernetMacTest() {
        // TODO: test ethernetMac
    }

    /**
     * Test the property 'firmwareVersion'
     */
    @Test
    public void firmwareVersionTest() {
        // TODO: test firmwareVersion
    }

    /**
     * Test the property 'iccid'
     */
    @Test
    public void iccidTest() {
        // TODO: test iccid
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'lastActivityDateTime'
     */
    @Test
    public void lastActivityDateTimeTest() {
        // TODO: test lastActivityDateTime
    }

    /**
     * Test the property 'lastTransactionDateTime'
     */
    @Test
    public void lastTransactionDateTimeTest() {
        // TODO: test lastTransactionDateTime
    }

    /**
     * Test the property 'linkNegotiation'
     */
    @Test
    public void linkNegotiationTest() {
        // TODO: test linkNegotiation
    }

    /**
     * Test the property 'serialNumber'
     */
    @Test
    public void serialNumberTest() {
        // TODO: test serialNumber
    }

    /**
     * Test the property 'simStatus'
     */
    @Test
    public void simStatusTest() {
        // TODO: test simStatus
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'storeStatus'
     */
    @Test
    public void storeStatusTest() {
        // TODO: test storeStatus
    }

    /**
     * Test the property 'wifiIp'
     */
    @Test
    public void wifiIpTest() {
        // TODO: test wifiIp
    }

    /**
     * Test the property 'wifiMac'
     */
    @Test
    public void wifiMacTest() {
        // TODO: test wifiMac
    }

    /**
     * Test the property 'wifiSsid'
     */
    @Test
    public void wifiSsidTest() {
        // TODO: test wifiSsid
    }

}
