package com.registry.registryspring.resources.repositories

import com.registry.registryspring.domain.entity.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository : JpaRepository<Client,Int> {
}