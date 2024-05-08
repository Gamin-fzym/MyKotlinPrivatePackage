package com.randomdt.myprivatepackage

import com.randomyyds.mylibrary.GACalculate
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(30,  GACalculate().addInstance(10, 20))
//        assertEquals(4, 2 + 2)
    }
}