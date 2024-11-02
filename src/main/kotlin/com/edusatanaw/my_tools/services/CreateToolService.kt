package com.edusatanaw.my_tools.services

import com.edusatanaw.my_tools.controllers.dto.CreateToolDTO
import com.edusatanaw.my_tools.entities.Tool
import com.edusatanaw.my_tools.infra.gateway.ToolGateway
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service()
class CreateToolService {
    @Autowired()
    private final lateinit var toolRepository: ToolGateway

    fun create(data: CreateToolDTO): Tool {
        val tool = toolRepository.create(data);
        return tool
    }
}