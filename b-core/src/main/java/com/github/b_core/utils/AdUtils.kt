package com.github.b_core.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.ApplicationInfo
import android.os.Build
import androidx.fragment.app.Fragment
import com.github.b_core.helper.BHelper
import io.michaelrocks.paranoid.Obfuscate
import java.util.concurrent.TimeUnit

@Obfuscate
object AdUtils {

    const val APP_UPDATED = "app_updated"
    const val MID_TIMEOUT = 10000L
    const val LONG_TIMEOUT = 30000L
    var checkPastDays = false



}