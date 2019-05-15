package com.firelabs.rnbridgemodule

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.WritableMap
import com.facebook.react.modules.core.DeviceEventManagerModule

class RNBridgeModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    private var react:ReactContext? = null

    init {
        react = reactContext
    }

    companion object {
        const val MODULE_NAME = "RNBridgeModule"
    }

    private fun emitDeviceEvent(eventName: String, eventData: WritableMap?) {
        // https://facebook.github.io/react-native/docs/native-modules-android.html#sending-events-to-javascript
        react!!.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter::class.java).emit(eventName, eventData)
    }



    override fun getName() : String = MODULE_NAME
}