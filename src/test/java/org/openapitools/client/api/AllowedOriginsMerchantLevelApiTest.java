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
import org.openapitools.client.model.AllowedOrigin;
import org.openapitools.client.model.AllowedOriginsResponse;
import org.openapitools.client.model.RestServiceError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AllowedOriginsMerchantLevelApi
 */
@Disabled
public class AllowedOriginsMerchantLevelApiTest {

    private final AllowedOriginsMerchantLevelApi api = new AllowedOriginsMerchantLevelApi();

    /**
     * Delete an allowed origin
     *
     * Removes the [allowed origin](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) identified in the path. As soon as an allowed origin is removed, we no longer accept client-side requests from that domain.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginIdTest() throws ApiException {
        String merchantId = null;
        String apiCredentialId = null;
        String originId = null;
        api.deleteMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId(merchantId, apiCredentialId, originId);
        // TODO: test validations
    }

    /**
     * Get a list of allowed origins
     *
     * Returns the list of [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) for the API credential identified in the path.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsTest() throws ApiException {
        String merchantId = null;
        String apiCredentialId = null;
        AllowedOriginsResponse response = api.getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins(merchantId, apiCredentialId);
        // TODO: test validations
    }

    /**
     * Get an allowed origin
     *
     * Returns the [allowed origin](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) identified in the path.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginIdTest() throws ApiException {
        String merchantId = null;
        String apiCredentialId = null;
        String originId = null;
        AllowedOrigin response = api.getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId(merchantId, apiCredentialId, originId);
        // TODO: test validations
    }

    /**
     * Create an allowed origin
     *
     * Adds a new [allowed origin](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) to the API credential&#39;s list of allowed origins.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsTest() throws ApiException {
        String merchantId = null;
        String apiCredentialId = null;
        AllowedOrigin allowedOrigin = null;
        AllowedOriginsResponse response = api.postMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins(merchantId, apiCredentialId, allowedOrigin);
        // TODO: test validations
    }

}
