package com.registry.registryspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RegistrySpringApplication

fun main(args: Array<String>) {
	runApplication<RegistrySpringApplication>(*args)
}
