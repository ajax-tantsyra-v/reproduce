package com.spike.reproduce

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TestWithContext : AbstractTest(){

    @Test
    fun `should when`() {
        assertTrue(true)
    }
}
