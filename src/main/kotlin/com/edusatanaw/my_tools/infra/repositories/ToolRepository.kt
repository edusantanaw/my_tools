package com.edusatanaw.my_tools.infra.repositories

import com.edusatanaw.my_tools.infra.entities.ToolEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Service

@Service()
interface ToolRepository : JpaRepository<ToolEntity, Long> {
}