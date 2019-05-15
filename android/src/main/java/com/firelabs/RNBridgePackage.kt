package com.firelabs

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.JavaScriptModule
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import com.facebook.react.uimanager.ReactShadowNode

import android.view.View
import java.util.Arrays

class RNBridgePackage : ReactPackage {


    override fun createNativeModules(reactContext: ReactApplicationContext) = reactContext?.let {
        // Register your native module
        // https://facebook.github.io/react-native/docs/native-modules-android.html#register-the-module
        mutableListOf(
                RNBridgeModule(reactContext)
        )
    }

    override fun createViewManagers(reactContext: ReactApplicationContext): MutableList<ViewManager<View, ReactShadowNode<*>>> = mutableListOf()


}