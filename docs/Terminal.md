

# Terminal


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assigned** | **Boolean** | The [assignment status](https://docs.adyen.com/point-of-sale/automating-terminal-management/assign-terminals-api) of the terminal. If true, the terminal is assigned. If false, the terminal is in inventory and can&#39;t be boarded. |  [optional]
**bluetoothIp** | **String** | The Bluetooth IP address of the terminal. |  [optional]
**bluetoothMac** | **String** | The Bluetooth MAC address of the terminal. |  [optional]
**city** | **String** | The city where the terminal is located. |  [optional]
**companyAccount** | **String** | The company account of the terminal. |  [optional]
**countryCode** | **String** | The country code where the terminal is located. |  [optional]
**deviceModel** | **String** | The terminal model of the device. |  [optional]
**ethernetIp** | **String** | The ethernet IP address of the terminal. |  [optional]
**ethernetMac** | **String** | The ethernet MAC address of the terminal. |  [optional]
**firmwareVersion** | **String** | The firmware Version of the terminal. |  [optional]
**iccid** | **String** | The ICCID number of the cellular communications card. |  [optional]
**id** | **String** | The unique identifier of the terminal. |  [optional]
**lastActivityDateTime** | **OffsetDateTime** | The last Activity Date and Time of the terminal. |  [optional]
**lastTransactionDateTime** | **OffsetDateTime** | The last Transaction Date and Time of the terminal. |  [optional]
**linkNegotiation** | **String** | The ethernet link speed of the terminal that was negotiated. |  [optional]
**serialNumber** | **String** | The serial number of the terminal. |  [optional]
**simStatus** | **String** | On a terminal that supports 3G or 4G connectivity, indicates the status of the SIM card in the terminal: ACTIVE or INVENTORY. |  [optional]
**status** | **String** | Indicates when the terminal was last online, whether the terminal is being reassigned, or whether the terminal is turned off. If the terminal was last online more that a week ago, it is also shown as turned off. |  [optional]
**storeStatus** | **String** | The Status of store where the terminal is located. |  [optional]
**wifiIp** | **String** | The WiFi IP address of the terminal. |  [optional]
**wifiMac** | **String** | The WiFi MAC address of the terminal. |  [optional]
**wifiSsid** | **String** | The WIFI SSID of the terminal. |  [optional]



