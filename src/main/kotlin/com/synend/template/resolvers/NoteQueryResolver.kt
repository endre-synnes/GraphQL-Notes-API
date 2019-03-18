package com.synend.template.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.synend.template.models.NoteConverter.Companion.entityToDto
import com.synend.template.models.dtos.NoteDto
import com.synend.template.repositories.NoteRepository
import com.synend.template.utils.logger
import org.springframework.stereotype.Component

@Component
class NoteQueryResolver(
        private var noteRepository: NoteRepository
): GraphQLQueryResolver {

    var logger = logger<NoteQueryResolver>()

    fun notes(author: String?): List<NoteDto> {


        val list = if (!author.isNullOrBlank()){
            noteRepository.findAllByAuthor(author!!)
        } else {
            noteRepository.findAll()
        }

        return entityToDto(list)

    }
}