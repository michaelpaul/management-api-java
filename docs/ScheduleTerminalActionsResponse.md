

# ScheduleTerminalActionsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionDetails** | [**OneOfInstallAndroidAppDetailsInstallAndroidCertificateDetailsReleaseUpdateDetailsUninstallAndroidAppDetailsUninstallAndroidCertificateDetails**](OneOfInstallAndroidAppDetailsInstallAndroidCertificateDetailsReleaseUpdateDetailsUninstallAndroidAppDetailsUninstallAndroidCertificateDetails.md) | Information about the action to take. |  [optional]
**items** | [**List&lt;TerminalActionScheduleDetail&gt;**](TerminalActionScheduleDetail.md) |  |  [optional]
**scheduledAt** | **String** | The date and time when the action should happen.  Format: [RFC 3339](https://www.rfc-editor.org/rfc/rfc3339), but without the **Z** before the time offset. For example, **2021-11-15T12:16:21+01:00**  The action is sent with the first [maintenance call](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api#when-actions-take-effect) after the specified date and time in the time zone of the terminal.  An empty value causes the action to be sent as soon as possible: at the next maintenance call. |  [optional]
**storeId** | **String** | The unique ID of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/stores). If present, all terminals in the &#x60;terminalIds&#x60; list must be assigned to this store. |  [optional]
**terminalIds** | **List&lt;String&gt;** | A list of unique IDs of the terminals to apply the action to. You can extract the IDs from the [GET &#x60;/terminals&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/terminals) response. Maximum length: 100 IDs. |  [optional]
**terminalsWithErrors** | **Map&lt;String, List&lt;String&gt;&gt;** | The validation errors that occurred in the list of terminals, and for each error the IDs of the terminals that the error applies to. |  [optional]
**totalErrors** | **Integer** | The number of terminals for which scheduling the action failed. |  [optional]
**totalScheduled** | **Integer** | The number of terminals for which the action was successfully scheduled. This doesn&#39;t mean the action has happened yet. |  [optional]



