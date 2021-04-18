package com.registry.registryspring.resources.repositories

import com.registry.registryspring.domain.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : JpaRepository<Customer,Int> {

    fun findCustomerById(id: Int): Customer
}