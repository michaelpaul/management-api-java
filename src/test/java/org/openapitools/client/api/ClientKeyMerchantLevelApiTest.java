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
import org.openapitools.client.model.GenerateClientKeyResponse;
import org.openapitools.client.model.RestServiceError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClientKeyMerchantLevelApi
 */
@Disabled
public class ClientKeyMerchantLevelApiTest {

    private final ClientKeyMerchantLevelApi api = new ClientKeyMerchantLevelApi();

    /**
     * Generate new client key
     *
     * Returns a new [client key](https://docs.adyen.com/development-resources/client-side-authentication#how-it-works) for the API credential identified in the path. You can use the new client key a few minutes after generating it. The old client key stops working 24 hours after generating a new one.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateClientKeyTest() throws ApiException {
        String merchantId = null;
        String apiCredentialId = null;
        GenerateClientKeyResponse response = api.postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateClientKey(merchantId, apiCredentialId);
        // TODO: test validations
    }

}
