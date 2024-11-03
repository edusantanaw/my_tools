package com.edusatanaw.my_tools.services

import com.edusatanaw.my_tools.controllers.dto.CreateToolDTO
import com.edusatanaw.my_tools.entities.Tool
import com.edusatanaw.my_tools.infra.gateway.ToolGateway
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CreateToolDtoTest {

    @Test
    fun createToolService() {
        val repository: ToolGateway = mockk()
        val toolService = CreateToolService(repository)
        val dto = CreateToolDTO(title = "test", description = "desc", link = "link", tags = listOf<String>())
        val tool = Tool(id = 1, title = "test", description = "desc", link = "link", tags = listOf<String>())
        every { repository.create(dto) }.returns(tool)
        val response = toolService.create(dto)
        assertEquals(response, tool)
    }
}
