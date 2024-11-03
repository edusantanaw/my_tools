package com.edusatanaw.my_tools

import com.edusatanaw.my_tools.entities.ToolTest
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MyToolsApplicationTests {

    @Test()
    fun test() {
        ToolTest().createTool()
    }
}
