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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.GenerateApiKeyResponse;
import org.openapitools.client.model.RestServiceError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ApiKeyCompanyLevelApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ApiKeyCompanyLevelApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApiKeyCompanyLevelApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateApiKey
     * @param companyId The unique identifier of the company account. (required)
     * @param apiCredentialId Unique identifier of the API credential. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request - a problem reading or understanding the request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateApiKeyCall(String companyId, String apiCredentialId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{companyId}/apiCredentials/{apiCredentialId}/generateApiKey"
            .replaceAll("\\{" + "companyId" + "\\}", localVarApiClient.escapeString(companyId.toString()))
            .replaceAll("\\{" + "apiCredentialId" + "\\}", localVarApiClient.escapeString(apiCredentialId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateApiKeyValidateBeforeCall(String companyId, String apiCredentialId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateApiKey(Async)");
        }
        
        // verify the required parameter 'apiCredentialId' is set
        if (apiCredentialId == null) {
            throw new ApiException("Missing the required parameter 'apiCredentialId' when calling postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateApiKey(Async)");
        }
        

        okhttp3.Call localVarCall = postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateApiKeyCall(companyId, apiCredentialId, _callback);
        return localVarCall;

    }

    /**
     * Generate new API key
     * Returns a new API key for the API credential. You can use the new API key a few minutes after generating it. The old API key stops working 24 hours after generating a new one.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write
     * @param companyId The unique identifier of the company account. (required)
     * @param apiCredentialId Unique identifier of the API credential. (required)
     * @return GenerateApiKeyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request - a problem reading or understanding the request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public GenerateApiKeyResponse postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateApiKey(String companyId, String apiCredentialId) throws ApiException {
        ApiResponse<GenerateApiKeyResponse> localVarResp = postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateApiKeyWithHttpInfo(companyId, apiCredentialId);
        return localVarResp.getData();
    }

    /**
     * Generate new API key
     * Returns a new API key for the API credential. You can use the new API key a few minutes after generating it. The old API key stops working 24 hours after generating a new one.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write
     * @param companyId The unique identifier of the company account. (required)
     * @param apiCredentialId Unique identifier of the API credential. (required)
     * @return ApiResponse&lt;GenerateApiKeyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request - a problem reading or understanding the request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GenerateApiKeyResponse> postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateApiKeyWithHttpInfo(String companyId, String apiCredentialId) throws ApiException {
        okhttp3.Call localVarCall = postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateApiKeyValidateBeforeCall(companyId, apiCredentialId, null);
        Type localVarReturnType = new TypeToken<GenerateApiKeyResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Generate new API key (asynchronously)
     * Returns a new API key for the API credential. You can use the new API key a few minutes after generating it. The old API key stops working 24 hours after generating a new one.  To make this request, your API credential must have the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—API credentials read and write
     * @param companyId The unique identifier of the company account. (required)
     * @param apiCredentialId Unique identifier of the API credential. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request - a problem reading or understanding the request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized - authentication required. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - insufficient permissions to process the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity - a request validation error. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error - the server could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateApiKeyAsync(String companyId, String apiCredentialId, final ApiCallback<GenerateApiKeyResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateApiKeyValidateBeforeCall(companyId, apiCredentialId, _callback);
        Type localVarReturnType = new TypeToken<GenerateApiKeyResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
