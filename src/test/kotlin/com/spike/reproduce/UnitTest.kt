package com.spike.reproduce

import com.tngtech.archunit.core.importer.ClassFileImporter
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class UnitTest {

    private val instance = ClassWithLogger()

    private val classes = ClassFileImporter()

    @Test
    fun `should when`() {
        instance.hello()
        classes.importClass(ClassWithLogger::class.java)
        Assertions.assertTrue(true)
    }
}
