

# AndroidApp


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | The description that was provided when uploading the app. The description is not shown on the terminal. |  [optional]
**id** | **String** | The unique identifier of the app. | 
**label** | **String** | The app name that is shown on the terminal. |  [optional]
**packageName** | **String** | The package name of the app. |  [optional]
**status** | **String** | The status of the app. Possible values:  * &#x60;processing&#x60;: The app is being signed and converted to a format that the terminal can handle. * &#x60;error&#x60;: Something went wrong. Check that the app matches the [requirements](https://docs.adyen.com/point-of-sale/android-terminals/app-requirements). * &#x60;invalid&#x60;: There is something wrong with the APK file of the app. * &#x60;ready&#x60;: The app has been signed and converted. * &#x60;archived&#x60;: The app is no longer available. | 
**versionCode** | **Integer** | The internal version number of the app. |  [optional]
**versionName** | **String** | The app version number that is shown on the terminal. |  [optional]



