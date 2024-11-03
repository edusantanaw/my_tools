package com.edusatanaw.my_tools.entities

import kotlin.test.assertEquals

class ToolTest {
    fun createTool() {
        val tool = Tool(id = 1, title = "test", description = "desc", link = "test", tags = listOf("test"))
        assertEquals(tool.id, 1)
        assertEquals(tool.title, "test")
        assertEquals(tool.description, "desc")
        assertEquals(tool.link, "test")
    }
}