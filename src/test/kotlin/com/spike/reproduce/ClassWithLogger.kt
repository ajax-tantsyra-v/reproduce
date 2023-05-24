package com.spike.reproduce

import org.slf4j.LoggerFactory

class ClassWithLogger : AbstractTest() {

    fun hello(){
        println("hello")
    }

    companion object {
        private val LOG = LoggerFactory.getLogger(ClassWithLogger::class.java)

        init {
            LOG.info("Logger for ClassWithLogger successfully loaded")
        }
    }
}
