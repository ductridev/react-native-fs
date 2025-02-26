package com.drpogodin.reactnativefs

import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfo
import com.facebook.react.module.model.ReactModuleInfoProvider
import java.util.HashMap

class ReactNativeFsPackage : BaseReactPackage() {
  override fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
    return if (name == ReactNativeFsModule.NAME) {
      ReactNativeFsModule(reactContext)
    } else {
      null
    }
  }

  override fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
    return ReactModuleInfoProvider {
      val moduleInfos: MutableMap<String, ReactModuleInfo> = HashMap()
      moduleInfos[ReactNativeFsModule.NAME] = ReactModuleInfo(
        ReactNativeFsModule.NAME,
        ReactNativeFsModule.NAME,
        canOverrideExistingModule = false,  // canOverrideExistingModule
        needsEagerInit = false,  // needsEagerInit
        hasConstants = true,   // Deprecated: This property is unused and it's planning to be removed in a future version of React Native.
        isCxxModule = false,  // isCxxModule
        isTurboModule = true // isTurboModule
      )
      moduleInfos
    }
  }
}
