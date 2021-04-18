package com.register.application.web.entities

import com.registry.registryspring.domain.entity.Address

class AddressRequest(
    val street:String,
    val city: String,
    val number: Int
) {
    fun toModel(): Address = Address(
        street = this.street,
        city = this.city,
        number = this.number
    )
}
