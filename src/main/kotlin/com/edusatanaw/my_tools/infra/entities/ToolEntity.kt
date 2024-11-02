package com.edusatanaw.my_tools.infra.entities

import com.edusatanaw.my_tools.entities.Tool
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity(name = "tool")
@Table()
class ToolEntity(
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column()
    val title: String,
    @Column()
    val description: String,
    @Column()
    val link: String,
    @Column()
    val tags: String
) {
    fun toDomain(): Tool {
        return Tool(id!!, title, link,description, tags = tags.split((",")))
    }
}
