package com.randomdt.myprivatepackage

public class GACalculatee {

    // 实例方法：执行加法
    fun addInstance1(a: Int, b: Int): Int {
        return a + b
    }

    companion object {
        // 类方法：执行加法
        fun addStatic1(a: Int, b: Int): Int {
            return a + b
        }
    }
}