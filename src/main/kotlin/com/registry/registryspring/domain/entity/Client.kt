package com.registry.registryspring.domain.entity

import javax.persistence.*

@Entity
data class Client(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Int? = null,
        val name:String,
        val age: Int,
        @OneToOne(cascade = arrayOf(CascadeType.ALL))
        val address: Address
)