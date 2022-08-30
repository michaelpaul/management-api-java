

# CreateMerchantWebhookRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptsExpiredCertificate** | **Boolean** | Indicates if expired SSL certificates are accepted. Default value: **false**. |  [optional]
**acceptsSelfSignedCertificate** | **Boolean** | Indicates if self-signed SSL certificates are accepted. Default value: **false**. |  [optional]
**acceptsUntrustedRootCertificate** | **Boolean** | Indicates if untrusted SSL certificates are accepted. Default value: **false**. |  [optional]
**active** | **Boolean** | Indicates if the webhook configuration is active. The field must be **true** for us to send webhooks about events related an account. | 
**additionalSettings** | [**AdditionalSettings**](AdditionalSettings.md) |  |  [optional]
**communicationFormat** | [**CommunicationFormatEnum**](#CommunicationFormatEnum) | Format or protocol for receiving webhooks. Possible values: * **soap** * **http** * **json**  | 
**description** | **String** | Your description for this webhook configuration. |  [optional]
**networkType** | [**NetworkTypeEnum**](#NetworkTypeEnum) | Network type for Terminal API notification webhooks. Possible values: * **public** * **local**  Default Value: **public**. |  [optional]
**password** | **String** | Password to access the webhook URL. |  [optional]
**populateSoapActionHeader** | **Boolean** | Indicates if the SOAP action header needs to be populated. Default value: **false**.  Only applies if &#x60;communicationFormat&#x60;: **soap**. |  [optional]
**sslVersion** | [**SslVersionEnum**](#SslVersionEnum) | SSL version to access the public webhook URL specified in the &#x60;url&#x60; field. Possible values: * **TLSv1.2** * **HTTP** - Only allowed on Test environment.  If not specified, the webhook will use &#x60;sslVersion&#x60;: **TLSv1.2**. |  [optional]
**type** | **String** | The type of webhook that is being created. Possible values are:  - **standard** - **account-settings-notification** - **banktransfer-notification** - **boletobancario-notification** - **directdebit-notification** - **pending-notification** - **ideal-notification** - **ideal-pending-notification** - **report-notification** - **rreq-notification**  Find out more about [standard notification webhooks](https://docs.adyen.com/development-resources/webhooks/understand-notifications#event-codes) and [other types of notifications](https://docs.adyen.com/development-resources/webhooks/understand-notifications#other-notifications). | 
**url** | **String** | Public URL where webhooks will be sent, for example **https://www.domain.com/webhook-endpoint**. | 
**username** | **String** | Username to access the webhook URL. |  [optional]



## Enum: CommunicationFormatEnum

Name | Value
---- | -----
HTTP | &quot;HTTP&quot;
JSON | &quot;JSON&quot;
SOAP | &quot;SOAP&quot;



## Enum: NetworkTypeEnum

Name | Value
---- | -----
LOCAL | &quot;LOCAL&quot;
PUBLIC | &quot;PUBLIC&quot;



## Enum: SslVersionEnum

Name | Value
---- | -----
HTTP | &quot;HTTP&quot;
SSL | &quot;SSL&quot;
SSLV3 | &quot;SSLV3&quot;
SSL_INSECURE_CIPHERS | &quot;SSL_INSECURE_CIPHERS&quot;
TLS | &quot;TLS&quot;
TLSV1 | &quot;TLSV1&quot;
TLSV1_1 | &quot;TLSV1_1&quot;
TLSV1_2 | &quot;TLSV1_2&quot;
TLSV1_INSECURE_CIPHERS | &quot;TLSV1_INSECURE_CIPHERS&quot;



