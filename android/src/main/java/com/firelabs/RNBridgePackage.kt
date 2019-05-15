package com.firelabs

import android.view.View
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.ViewManager

class RNBridgePackage : ReactPackage {
    override fun createNativeModules(reactContext: ReactApplicationContext)= reactContext?.let {
        mutableListOf(
                RNBridgeModule(it)
        )
    }

    override fun createViewManagers(reactContext: ReactApplicationContext): MutableList<ViewManager<View, ReactShadowNode<*>>> = mutableListOf()
}