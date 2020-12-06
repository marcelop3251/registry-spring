package com.registry.registryspring.domain.service.implementation

import com.registry.registryspring.domain.entity.Client
import com.registry.registryspring.domain.service.Services
import com.registry.registryspring.resources.repositories.ClientRepository
import org.springframework.stereotype.Service

@Service
class RegisterServices(
        private val repository: ClientRepository
) : Services<Client> {



    override fun save(entity: Client): Client {
       return repository.save(entity)
    }

    override fun findAll(): List<Client> {
        return repository.findAll()
    }

}