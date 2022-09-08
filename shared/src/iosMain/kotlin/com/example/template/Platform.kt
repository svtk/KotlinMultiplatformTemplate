package com.example.template

import platform.UIKit.UIDevice

class PlatformIOS: Platform {
    override val name: String =
        UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = PlatformIOS()