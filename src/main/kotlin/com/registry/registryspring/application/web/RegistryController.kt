package com.registry.registryspring.application.web

import com.registry.registryspring.domain.entity.Client
import com.registry.registryspring.domain.service.Services
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class RegistryController(
        private val service: Services<Client>
) {


    @GetMapping("/registry-client")
    fun listClients(): List<Client> {
        return service.findAll()
    }

    @PostMapping("/registry-client")
    @ResponseStatus(value = HttpStatus.CREATED)
    fun registerClient(@RequestBody client: Client) : Client{
        print(client.toString())
        return service.save(client)

    }
}