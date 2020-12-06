package com.registry.registryspring.domain.service

interface Services<T> {

    fun save(entity: T): T
    fun findAll(): List<T>
}