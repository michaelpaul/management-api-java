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
import org.openapitools.client.model.AndroidAppsResponse;
import org.openapitools.client.model.AndroidCertificatesResponse;
import org.openapitools.client.model.ExternalTerminalAction;
import org.openapitools.client.model.ListExternalTerminalActionsResponse;
import org.openapitools.client.model.RestServiceError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TerminalActionsCompanyLevelApi
 */
@Disabled
public class TerminalActionsCompanyLevelApiTest {

    private final TerminalActionsCompanyLevelApi api = new TerminalActionsCompanyLevelApi();

    /**
     * Get a list of Android apps
     *
     * Returns a list of the Android apps that are available for the company identified in the path.  These apps have been uploaded to Adyen and can be installed or uninstalled on Android payment terminals through [terminal actions](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api).  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal actions read * Management API—Terminal actions read and write
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCompaniesCompanyIdAndroidAppsTest() throws ApiException {
        String companyId = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        AndroidAppsResponse response = api.getCompaniesCompanyIdAndroidApps(companyId, pageNumber, pageSize);
        // TODO: test validations
    }

    /**
     * Get a list of Android certificates
     *
     * Returns a list of the Android certificates that are available for the company identified in the path. Typically, these certificates enable running apps on Android payment terminals. The certifcates in the list have been uploaded to Adyen and can be installed or uninstalled on Android terminals through [terminal actions](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api).  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal actions read * Management API—Terminal actions read and write
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCompaniesCompanyIdAndroidCertificatesTest() throws ApiException {
        String companyId = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        AndroidCertificatesResponse response = api.getCompaniesCompanyIdAndroidCertificates(companyId, pageNumber, pageSize);
        // TODO: test validations
    }

    /**
     * Get a list of terminal actions
     *
     * Returns the [terminal actions](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api) that have been scheduled for the company identified in the path.The response doesn&#39;t include actions that are scheduled by Adyen. To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal actions read * Management API—Terminal actions read and write
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCompaniesCompanyIdTerminalActionsTest() throws ApiException {
        String companyId = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        String status = null;
        String type = null;
        ListExternalTerminalActionsResponse response = api.getCompaniesCompanyIdTerminalActions(companyId, pageNumber, pageSize, status, type);
        // TODO: test validations
    }

    /**
     * Get terminal action
     *
     * Returns the details of the [terminal action](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api) identified in the path. To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal actions read * Management API—Terminal actions read and write
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCompaniesCompanyIdTerminalActionsActionIdTest() throws ApiException {
        String companyId = null;
        String actionId = null;
        ExternalTerminalAction response = api.getCompaniesCompanyIdTerminalActionsActionId(companyId, actionId);
        // TODO: test validations
    }

}
