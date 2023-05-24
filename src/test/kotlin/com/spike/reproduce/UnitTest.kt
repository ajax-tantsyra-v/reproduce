package com.spike.reproduce

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class UnitTest {

    private val instance = ClassWithLogger()

    @Test
    fun `should when`() {
        instance.hello()

        Assertions.assertTrue(true)
    }
}
