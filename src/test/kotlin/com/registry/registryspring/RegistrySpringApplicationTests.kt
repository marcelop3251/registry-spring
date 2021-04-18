package com.registry.registryspring

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.registry.extensions.payload
import com.registry.registryspring.domain.entity.Customer
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RegistrySpringApplicationTests(
		@Autowired val restTemplate: TestRestTemplate
) {


	@Test
	fun When_called_should_return_content_and_200(){
		val entity = restTemplate.getForEntity<String>("/register-client")
		assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
	}

	@Test
	fun when_called_post_should_return_content_and_201(){
		val entity = restTemplate.postForEntity(
				"/register-client",
				jacksonObjectMapper().readValue("registry-client.json".payload(),Customer::class.java),
				Customer::class.java
				)

		assertNotNull(entity.body)
		assertThat(entity.statusCode).isEqualTo(HttpStatus.CREATED)

	}
}
