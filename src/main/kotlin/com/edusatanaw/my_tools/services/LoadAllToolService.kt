package com.edusatanaw.my_tools.services

import com.edusatanaw.my_tools.controllers.dto.LoadTool
import com.edusatanaw.my_tools.entities.Tool
import com.edusatanaw.my_tools.infra.gateway.ToolGateway
import org.springframework.stereotype.Service

@Service()
class LoadAllToolService(private val repository: ToolGateway) {
    fun loadAll(data: LoadTool): List<Tool> {
        val tools = repository.loadAll(data.tag)
        return tools
    }
}