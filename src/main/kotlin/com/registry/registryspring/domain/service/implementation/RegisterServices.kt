package com.registry.registryspring.domain.service.implementation

import com.registry.registryspring.domain.entity.Customer
import com.registry.registryspring.domain.service.Services
import com.registry.registryspring.resources.repositories.CustomerRepository
import org.springframework.stereotype.Service

@Service
class RegisterServices(
        private val repository: CustomerRepository
) : Services<Customer> {

    override fun save(entity: Customer): Customer {
       return repository.save(entity)
    }

    override fun findById(id: Int): Customer {
        return repository.findCustomerById(id)
    }

}