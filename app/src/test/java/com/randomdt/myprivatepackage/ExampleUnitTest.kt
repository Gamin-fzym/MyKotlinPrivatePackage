package com.randomdt.myprivatepackage

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
        assertEquals(30,  GACalculatee.addStatic(10, 20))
        //assertEquals(4, 2 + 2)
    }
}