package com.edusatanaw.my_tools.services

import com.edusatanaw.my_tools.controllers.dto.CreateToolDTO
import com.edusatanaw.my_tools.entities.Tool
import com.edusatanaw.my_tools.exceptions.NotFoundException
import com.edusatanaw.my_tools.infra.gateway.ToolGateway
import org.springframework.stereotype.Service

@Service
class UpdateToolService(val repository: ToolGateway) {
    fun update(id: Long, tool: CreateToolDTO): Tool {
        repository.loadById(id) ?: throw NotFoundException("ferramenta não encontrada!");
        val updatedTool =
            Tool(id = id, title = tool.title, tags = tool.tags, link = tool.link, description = tool.description)
        repository.update(updatedTool)
        return updatedTool;
    }
}