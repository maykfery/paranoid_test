package com.utils

import android.content.Context
import io.michaelrocks.paranoid.Obfuscate

private const val constant = "testt:2_constant"

@Obfuscate
object Lion {
        private val s = "testt:2_global"
        private val s2 = "testt:2_global2"

        fun checkPermission(context: Context?, runnable: Runnable, vararg permissions: String): String {
            println(s2)
            return "testt:2_method"
        }

      
        private val cg = "testt:2_companion_global"
        fun chec2(context: Context?, runnable: Runnable, vararg permissions: String): String {
            return "testt:2_companion"
        }

        fun chec3(context: Context?, runnable: Runnable, vararg permissions: String): String {
            return cg+ constant
        }
  

    
}

