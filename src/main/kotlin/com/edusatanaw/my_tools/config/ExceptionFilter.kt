package com.edusatanaw.my_tools.config

import com.edusatanaw.my_tools.exceptions.NotFoundException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice()
class ExceptionFilter {
    @ExceptionHandler
    fun notFoundException(exception: NotFoundException): ResponseEntity<String> {
        return ResponseEntity.status(404).body(exception.message)
    }

    @ExceptionHandler
    fun exception(exception: Exception): ResponseEntity<String>{
        return ResponseEntity.status(500).body("Internal Server Error")
    }
}