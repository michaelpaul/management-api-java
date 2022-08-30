

# CustomNotification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**Amount2**](Amount2.md) |  |  [optional]
**eventCode** | **String** | The event that caused the notification to be sent.Currently supported values: * **AUTHORISATION** * **CANCELLATION** * **REFUND** * **CAPTURE** * **DEACTIVATE_RECURRING** * **REPORT_AVAILABLE** * **CHARGEBACK** * **REQUEST_FOR_INFORMATION** * **NOTIFICATION_OF_CHARGEBACK** * **NOTIFICATIONTEST** * **ORDER_OPENED** * **ORDER_CLOSED** * **CHARGEBACK_REVERSED** * **REFUNDED_REVERSED** * **REFUND_WITH_DATA** |  [optional]
**eventDate** | **OffsetDateTime** | The time of the event. Format: [ISO 8601](http://www.w3.org/TR/NOTE-datetime), YYYY-MM-DDThh:mm:ssTZD. |  [optional]
**merchantReference** | **String** | Your reference for the custom test notification. |  [optional]
**paymentMethod** | **String** | The payment method for the payment that the notification is about. Possible values: * **amex** * **visa** * **mc** * **maestro** * **bcmc** * **paypal**  * **sms**  * **bankTransfer_NL** * **bankTransfer_DE** * **bankTransfer_BE** * **ideal** * **elv** * **sepadirectdebit**  |  [optional]
**reason** | **String** | A descripton of what caused the notification. |  [optional]
**success** | **Boolean** | The outcome of the event which the notification is about. Set to either **true** or **false**.  |  [optional]



