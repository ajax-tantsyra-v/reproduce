package com.spike.reproduce

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReproduceApplication

fun main(args: Array<String>) {
	runApplication<ReproduceApplication>(*args)
}
