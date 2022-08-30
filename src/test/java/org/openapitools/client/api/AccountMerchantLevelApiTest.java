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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.CreateMerchantRequest;
import org.openapitools.client.model.CreateMerchantResponse;
import org.openapitools.client.model.ListMerchantResponse;
import org.openapitools.client.model.Merchant;
import org.openapitools.client.model.RequestActivationResponse;
import org.openapitools.client.model.RestServiceError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountMerchantLevelApi
 */
@Ignore
public class AccountMerchantLevelApiTest {

    private final AccountMerchantLevelApi api = new AccountMerchantLevelApi();

    
    /**
     * Get a list of merchant accounts
     *
     * Returns the list of merchant accounts that your API credential has access to. The list is grouped into pages as defined by the query parameters.   To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Account read
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMerchantsTest() throws ApiException {
        Integer pageNumber = null;
        Integer pageSize = null;
                ListMerchantResponse response = api.getMerchants(pageNumber, pageSize);
        // TODO: test validations
    }
    
    /**
     * Get a merchant account
     *
     * Returns the merchant account specified in the path. Your API credential must have access to the merchant account.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Account read
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMerchantsMerchantIdTest() throws ApiException {
        String merchantId = null;
                Merchant response = api.getMerchantsMerchantId(merchantId);
        // TODO: test validations
    }
    
    /**
     * Create a merchant account
     *
     * Creates a merchant account for the company account specified in the request.  Use this endpoint if your integration requires it, such as Adyen for Platforms Manage. Your Adyen contact will set up your access.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Accounts read and write
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postMerchantsTest() throws ApiException {
        CreateMerchantRequest createMerchantRequest = null;
                CreateMerchantResponse response = api.postMerchants(createMerchantRequest);
        // TODO: test validations
    }
    
    /**
     * Request to activate a merchant account
     *
     * Sends a request to activate the merchant account identified in the path.  You get the result of the activation asychronously through a webhook. Once the merchant account is activated, you can start using it to accept payments and payouts.  Use this endpoint if your integration requires it, such as Adyen for Platforms Manage. Your Adyen contact will set up your access.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Accounts read and write
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postMerchantsMerchantIdActivateTest() throws ApiException {
        String merchantId = null;
                RequestActivationResponse response = api.postMerchantsMerchantIdActivate(merchantId);
        // TODO: test validations
    }
    
}
