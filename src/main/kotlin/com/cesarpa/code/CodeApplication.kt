package com.cesarpa.code

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CodeApplication

fun main(args: Array<String>) {
	runApplication<CodeApplication>(*args)
}
