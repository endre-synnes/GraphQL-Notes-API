package com.synend.template.repositories

import com.synend.template.models.entities.NoteEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface NoteRepository : CrudRepository<NoteEntity, String> {

    fun findAllByAuthor(author: String): Iterable<NoteEntity>
}