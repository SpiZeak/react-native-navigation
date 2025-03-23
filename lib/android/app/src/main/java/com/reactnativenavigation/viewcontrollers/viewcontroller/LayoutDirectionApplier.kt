package com.reactnativenavigation.viewcontrollers.viewcontroller

import com.facebook.react.ReactInstanceManager
import com.facebook.react.bridge.ReactContext
import com.facebook.react.modules.i18nmanager.I18nUtil
import com.reactnativenavigation.options.Options

class LayoutDirectionApplier {
    fun apply(root: ViewController<*>, options: Options, instanceManager: ReactInstanceManager) {
        // currentReactContext'in null olup olmadığını kontrol ediyoruz
        val reactContext = instanceManager.currentReactContext as? ReactContext
        if (options.layout.direction.hasValue() && reactContext != null) {
            root.activity.window.decorView.layoutDirection = options.layout.direction.get()
            I18nUtil.getInstance().allowRTL(reactContext, options.layout.direction.isRtl)
            I18nUtil.getInstance().forceRTL(reactContext, options.layout.direction.isRtl)
        }
    }
}
