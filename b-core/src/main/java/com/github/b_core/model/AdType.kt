package com.github.b_core.model

import io.michaelrocks.paranoid.Obfuscate
import java.io.Serializable

@Obfuscate
enum class AdType : Serializable {
    BANNER, NATIVE_BANNER,NATIVE_BANNER_LARGE, NATIVE_LARGE, NATIVE_XL
}