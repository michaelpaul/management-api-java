

# ScheduleTerminalActionsRequestActionDetails

Information about the action to take.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appId** | **String** | The unique identifier of the app to be uninstalled. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of terminal action: Uninstall an Android certificate. |  [optional] |
|**certificateId** | **String** | The unique identifier of the certificate to be uninstalled. |  [optional] |
|**updateAtFirstMaintenanceCall** | **Boolean** | Boolean flag that tells if the terminal should update at the first next maintenance call. If false, terminal will update on its configured reboot time. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UNINSTALLANDROIDCERTIFICATE | &quot;UninstallAndroidCertificate&quot; |



