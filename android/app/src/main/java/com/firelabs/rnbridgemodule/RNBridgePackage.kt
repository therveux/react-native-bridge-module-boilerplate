package com.firelabs.rnbridgemodule

import android.view.View
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.JavaScriptModule
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.ViewManager

import java.util.Collections
import java.util.Arrays

class RNBridgePackage : ReactPackage {
    override fun createViewManagers(reactContext: ReactApplicationContext?): MutableList<ViewManager<View, ReactShadowNode>> {
        return Collections.emptyList()
    }

    override fun createJSModules(): MutableList<Class<out JavaScriptModule>> {
        return Collections.emptyList()
    }


    override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
        return Arrays.asList<NativeModule>(
            RNBridgeModule(reactContext)
        )
    }
}