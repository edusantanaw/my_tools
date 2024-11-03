package com.edusatanaw.my_tools.infra.gateway

import com.edusatanaw.my_tools.controllers.dto.CreateToolDTO
import com.edusatanaw.my_tools.entities.Tool
import com.edusatanaw.my_tools.infra.entities.ToolEntity
import com.edusatanaw.my_tools.infra.repositories.ToolRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ToolGateway(
    @Autowired()
    final var repository: ToolRepository
) {
    fun create(data: CreateToolDTO): Tool {
        val entity = ToolEntity(
            link = data.link,
            tags = data.tags.joinToString(","),
            title = data.title,
            description = data.description
        )
        repository.save(entity)
        return entity.toDomain();
    }

    fun loadAll(tag: String?): List<Tool> {
        if(tag == null) {
            val tools = repository.findAll()
            return tools.map { e -> e.toDomain() };
        }
        val tools = repository.findByTagsContainingIgnoreCase(tag);
        return tools.map { e -> e.toDomain() };
    }
}