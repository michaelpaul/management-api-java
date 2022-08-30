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
import org.openapitools.client.model.CreateMerchantUserRequest;
import org.openapitools.client.model.CreateUserResponse;
import org.openapitools.client.model.ListMerchantUsersResponse;
import org.openapitools.client.model.RestServiceError;
import org.openapitools.client.model.UpdateMerchantUserRequest;
import org.openapitools.client.model.User;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersMerchantLevelApi
 */
@Disabled
public class UsersMerchantLevelApiTest {

    private final UsersMerchantLevelApi api = new UsersMerchantLevelApi();

    /**
     * Get a list of users
     *
     * Returns a list of users associated with the &#x60;merchantId&#x60; specified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Users read and write 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMerchantsMerchantIdUsersTest() throws ApiException {
        String merchantId = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        ListMerchantUsersResponse response = api.getMerchantsMerchantIdUsers(merchantId, pageNumber, pageSize);
        // TODO: test validations
    }

    /**
     * Get user details
     *
     * Returns user details for the &#x60;userId&#x60; and the &#x60;merchantId&#x60; specified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Users read and write 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMerchantsMerchantIdUsersUserIdTest() throws ApiException {
        String merchantId = null;
        String userId = null;
        User response = api.getMerchantsMerchantIdUsersUserId(merchantId, userId);
        // TODO: test validations
    }

    /**
     * Update a user
     *
     * Updates user details for the &#x60;userId&#x60; and the &#x60;merchantId&#x60; specified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Users read and write 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchMerchantsMerchantIdUsersUserIdTest() throws ApiException {
        String merchantId = null;
        String userId = null;
        UpdateMerchantUserRequest updateMerchantUserRequest = null;
        User response = api.patchMerchantsMerchantIdUsersUserId(merchantId, userId, updateMerchantUserRequest);
        // TODO: test validations
    }

    /**
     * Create a new user
     *
     * Creates a user for the &#x60;merchantId&#x60; specified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Users read and write 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postMerchantsMerchantIdUsersTest() throws ApiException {
        String merchantId = null;
        CreateMerchantUserRequest createMerchantUserRequest = null;
        CreateUserResponse response = api.postMerchantsMerchantIdUsers(merchantId, createMerchantUserRequest);
        // TODO: test validations
    }

}
