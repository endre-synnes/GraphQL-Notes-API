package com.synend.template.models

import com.synend.template.models.dtos.NoteDto
import com.synend.template.models.entities.NoteEntity
import java.util.*

class NoteConverter {

    companion object {

        fun entityToDto(entity: NoteEntity) : NoteDto {
            return NoteDto(
                    entity.id,
                    entity.text,
                    entity.priority,
                    entity.author
            )
        }

        fun entityToDto(entities: Iterable<NoteEntity>): List<NoteDto> {
            return entities.map { entityToDto(it) }.toList()
        }

        fun dtoToEntity(dto: NoteDto): NoteEntity {
            return NoteEntity(
                    UUID.randomUUID().toString(),
                    dto.text,
                    dto.priority,
                    dto.author
            )
        }


    }
}