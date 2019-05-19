package com.firelabs

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import com.facebook.react.uimanager.ReactShadowNode


import android.view.View
import com.facebook.react.bridge.JavaScriptModule

class RNBridgePackage : ReactPackage {

    override fun createJSModules(): MutableList<Class<out JavaScriptModule>> = mutableListOf()


    override fun createNativeModules(reactContext: ReactApplicationContext) = reactContext?.let {
        // Register your native module
        // https://facebook.github.io/react-native/docs/native-modules-android.html#register-the-module
        mutableListOf(
                RNBridgeModule(reactContext)
        )
    }

    override fun createViewManagers(reactContext: ReactApplicationContext): MutableList<ViewManager<View, ReactShadowNode<*>>> = mutableListOf()


}