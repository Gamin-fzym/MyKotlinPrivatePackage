package com.randomdt.myprivatepackage

public class GACalculate {

    // 实例方法：执行加法
    fun addInstance(a: Int, b: Int): Int {
        return a + b
    }

    companion object {
        // 类方法：执行加法
        fun addStatic(a: Int, b: Int): Int {
            return a + b
        }
    }
}