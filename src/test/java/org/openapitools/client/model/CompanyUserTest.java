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
import org.openapitools.client.model.Links;
import org.openapitools.client.model.Name;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for CompanyUser
 */
public class CompanyUserTest {
    private final CompanyUser model = new CompanyUser();

    /**
     * Model tests for CompanyUser
     */
    @Test
    public void testCompanyUser() {
        // TODO: test CompanyUser
    }

    /**
     * Test the property 'links'
     */
    @Test
    public void linksTest() {
        // TODO: test links
    }

    /**
     * Test the property 'accountGroups'
     */
    @Test
    public void accountGroupsTest() {
        // TODO: test accountGroups
    }

    /**
     * Test the property 'active'
     */
    @Test
    public void activeTest() {
        // TODO: test active
    }

    /**
     * Test the property 'associatedMerchantAccounts'
     */
    @Test
    public void associatedMerchantAccountsTest() {
        // TODO: test associatedMerchantAccounts
    }

    /**
     * Test the property 'email'
     */
    @Test
    public void emailTest() {
        // TODO: test email
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'roles'
     */
    @Test
    public void rolesTest() {
        // TODO: test roles
    }

    /**
     * Test the property 'timeZoneCode'
     */
    @Test
    public void timeZoneCodeTest() {
        // TODO: test timeZoneCode
    }

    /**
     * Test the property 'username'
     */
    @Test
    public void usernameTest() {
        // TODO: test username
    }

}
