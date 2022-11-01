package com.github.b_core.helper

import android.content.Context
import com.github.b_core.utils.AdUtils
import io.michaelrocks.paranoid.Obfuscate


@Obfuscate
class BHelper private constructor(context: Context) {
    private val TAG = "BLAB_"
    private val sharePref =
        context.getSharedPreferences("premium_ads", Context.MODE_PRIVATE)
    private var adsEnabled = sharePref.getBoolean("ads_enabled", true)

    fun getAdsEnabled(): Boolean {
        return adsEnabled
    }

    fun setAdsEnabled(enabled: Boolean) {
        if (adsEnabled != enabled) {
            sharePref.edit().putBoolean("ads_enabled", enabled).apply()
            adsEnabled = enabled
        }
    }

    companion object {
        @Volatile
        @JvmStatic
        private var INSTANCE: BHelper? = null
        fun instance(context: Context): BHelper =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: BHelper(context).also { INSTANCE = it }
            }
    }

}