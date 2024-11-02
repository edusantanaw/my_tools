package com.edusatanaw.my_tools.controllers

import com.edusatanaw.my_tools.controllers.dto.CreateToolDTO
import com.edusatanaw.my_tools.entities.Tool
import com.edusatanaw.my_tools.services.CreateToolService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController()
class ToolController {

    @Autowired()
    private final lateinit var createToolService: CreateToolService

    @PostMapping("/api/tool")
    public fun create(@RequestBody() data: CreateToolDTO): ResponseEntity<Tool> {
        val tool = createToolService.create(data);
        return ResponseEntity.status(HttpStatus.CREATED).body(tool);
    }
}