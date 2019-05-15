package com.firelabs

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.Promise

class RNBridgeModule(context: ReactApplicationContext): ReactContextBaseJavaModule(context) {
    companion object {
        val MODULE_NAME = "RNBridgeModule"
    }

    override fun getName() = MODULE_NAME

    @ReactMethod
    fun testKotlinAndroid(promise: Promise) {
        promise.resolve('KOTLIN POWA')
    }
}