package com.registry.registryspring.domain.service

interface Services<T> {

    fun save(entity: T): T
    fun findById(id: Int): T
}