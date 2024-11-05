package com.edusatanaw.my_tools.services

import com.edusatanaw.my_tools.entities.Tool
import com.edusatanaw.my_tools.infra.gateway.ToolGateway
import org.springframework.stereotype.Service

@Service
class LoadByIdService(private val repository: ToolGateway) {
    fun loadById(id: Long): Tool {
        val tool = repository.loadById(id) ?: throw  Exception("ferramenta não encontrada!");
        return tool
    }
}