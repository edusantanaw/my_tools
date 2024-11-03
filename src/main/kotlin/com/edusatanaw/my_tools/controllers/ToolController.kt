package com.edusatanaw.my_tools.controllers

import com.edusatanaw.my_tools.controllers.dto.CreateToolDTO
import com.edusatanaw.my_tools.controllers.dto.LoadTool
import com.edusatanaw.my_tools.entities.Tool
import com.edusatanaw.my_tools.services.CreateToolService
import com.edusatanaw.my_tools.services.LoadAllToolService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController()
class ToolController {

    @Autowired()
    private final lateinit var createToolService: CreateToolService

    @Autowired
    private final  lateinit var loadAllService: LoadAllToolService

    @PostMapping("/api/tool")
     fun create(@RequestBody() data: CreateToolDTO): ResponseEntity<Tool> {
        val tool = createToolService.create(data);
        return ResponseEntity.status(HttpStatus.CREATED).body(tool);
    }

    @GetMapping("/api/tool")
    fun loadAll(@RequestParam tag: String?): ResponseEntity<List<Tool>> {
        val tools = loadAllService.loadAll(LoadTool(tag=tag));
        return ResponseEntity.status(HttpStatus.OK).body(tools);
    }
}