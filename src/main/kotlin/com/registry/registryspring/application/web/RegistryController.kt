package com.registry.registryspring.application.web

import com.register.application.web.entities.CustomerRequest
import com.register.application.web.entities.CustomerResponse
import com.registry.registryspring.domain.entity.Customer
import com.registry.registryspring.domain.service.Services
import javax.websocket.server.PathParam
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class RegistryController(
        private val service: Services<Customer>
) {

    @GetMapping("/registry-customer/{id}")
    fun getCustomerById(@PathVariable id: Int): CustomerResponse {
        return CustomerResponse(service.findById(id))
    }

    @PostMapping("/registry-customer")
    @ResponseStatus(value = HttpStatus.CREATED)
    fun registerClient(@RequestBody client: CustomerRequest) : CustomerResponse {
        return CustomerResponse(service.save(client.toModel()))
    }
}