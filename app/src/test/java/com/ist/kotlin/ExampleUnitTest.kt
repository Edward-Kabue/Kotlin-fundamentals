package com.ist.kotlin

import app.src.main.java.com.ist.kotlin.start
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
        assertEquals(4, 2 + 2)
    }
}



class StartTest {
    @Test
    fun `start should return OK`() {
        val result = start()
        assertEquals("Jambo bwana", result)
    }
}
