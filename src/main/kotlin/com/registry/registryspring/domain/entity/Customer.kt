package com.registry.registryspring.domain.entity

import javax.persistence.*

@Entity
data class Customer(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = null,
        val name:String,
        val age: Int,
        @OneToOne(cascade = [CascadeType.ALL])
        val address: Address
)