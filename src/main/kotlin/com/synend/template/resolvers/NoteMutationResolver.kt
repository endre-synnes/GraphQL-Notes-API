package com.synend.template.resolvers

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.synend.template.models.NoteConverter.Companion.dtoToEntity
import com.synend.template.models.dtos.NoteDto
import com.synend.template.repositories.NoteRepository
import com.synend.template.utils.logger
import com.synend.template.utils.messages.ExceptionMessages.Companion.missingRequiredField
import com.synend.template.utils.messages.InfoMessages.Companion.entityCreatedSuccessfully
import graphql.execution.DataFetcherResult
import graphql.servlet.GenericGraphQLError
import org.springframework.stereotype.Component

@Component
class NoteMutationResolver(
        private var noteRepository: NoteRepository
): GraphQLMutationResolver {

    var logger = logger<NoteMutationResolver>()

    fun createNote(input: NoteDto): DataFetcherResult<String> {

        try {
            validateDto(input)
        } catch (ex : IllegalStateException){
            return missingField(ex.message!!)
        }

        val id = noteRepository.save(dtoToEntity(input)).id

        logger.info(entityCreatedSuccessfully("Note", id.toString()))
        return DataFetcherResult(id!!, listOf())
    }

    private fun validateDto(input: NoteDto) {

        when {
            input.author.isNullOrBlank() -> throw IllegalStateException("author")
            input.priority == null -> throw IllegalStateException("priority")
            input.text.isNullOrBlank() -> throw IllegalStateException("text")
        }
    }

    private fun missingField(fieldName: String): DataFetcherResult<String> {
        val errorMsg = missingRequiredField(fieldName)
        logger.warn(errorMsg)
        return DataFetcherResult<String>(null, listOf(GenericGraphQLError(errorMsg)))
    }

}