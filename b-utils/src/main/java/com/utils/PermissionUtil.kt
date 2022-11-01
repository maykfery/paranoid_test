package com.utils

import android.content.Context
import io.michaelrocks.paranoid.Obfuscate

private const val constant = "testt:constant"

@Obfuscate
class PermissionUtil {
    private val s = "testt:global"
    private val s2 = "testt:global2"

    fun checkPermission(context: Context?, runnable: Runnable, vararg permissions: String): String {
        println(s2)
        return "testt:method"+constant
    }

    companion object    {
        private val cg = "testt:companion_global"
        fun chec2(context: Context?, runnable: Runnable, vararg permissions: String): String {
            return "testt:companion"
        }

        fun chec3(context: Context?, runnable: Runnable, vararg permissions: String): String {
            println(Test().x)
            println(Test2().x)
            println(Test3.x)
            println(Test4().x)
            val message = object : Test5 {
                override fun x(x: String) {
                    println(x)
                }
            }
            println(message.x("testt:method call"))

            println(CompanionTest().x)
            println(CompanionTest2().x)
            println(CompanionTest3.x)
            println(CompanionTest4().x)
            val cmessage = object : CompanionTest5 {
                override fun x(x: String) {
                    println(x)
                }
            }
            println(cmessage.x("testt:method call Companion"))
            return cg+ constant
        }


        internal class CompanionTest {
            var x = "testt:internal class test Companion"
        }
        class CompanionTest2 {
            var x = "testt:class test2 Companion"
        }
        object CompanionTest3 {
            var x = "testt:class test3 Companion"
        }

        data class CompanionTest4(val x:String = "testt:class test4 Companion")
        interface CompanionTest5{
            fun x(x:String = "testt:class test5 Companion")
        }
    }

    internal class Test {
        var x = "testt:internal class test"
    }
    class Test2 {
        var x = "testt:class test2"
    }
    object Test3 {
        var x = "testt:class test3"
    }

    data class Test4(val x:String = "testt:class test4")
    interface Test5{
        fun x(x:String = "testt:class test5")
    }

}

