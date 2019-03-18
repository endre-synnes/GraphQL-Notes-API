package com.synend.template.models.entities

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
@Table(name = "NOTE")
class NoteEntity(

        @Id
        var id: String?,

        @NotBlank
        var text: String?,

        @NotNull
        var priority: Int?,

        @NotBlank
        var author: String?
)