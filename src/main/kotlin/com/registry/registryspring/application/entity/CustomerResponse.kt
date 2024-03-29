package com.register.application.web.entities

import com.registry.registryspring.domain.entity.Customer

class CustomerResponse(
    val id: Int,
    val name: String,
    val age: Int,
    val address: AddressResponse
) {
    constructor(customer: Customer) : this(
        id = customer.id!!,
        name = customer.name,
        age = customer.age,
        address = AddressResponse(customer.address)
    )
}
