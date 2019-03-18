package com.synend.template.utils.messages

class InfoMessages{

    companion object {

        // POST
        fun entityCreatedSuccessfully(type: String, id: String): String {
            return "Successfully created ${type.capitalize()} with id: $id"
        }

        // PATCH
        fun entityFieldUpdatedSuccessfully(type: String, id: String, field: String): String {
            return "Updated ${field.capitalize()} on ${type.capitalize()} with id: $id"
        }

        // PUT
        fun entitySuccessfullyUpdated(type: String, id: String): String {
            return "Successfully updated ${type.capitalize()} with id: $id"
        }

        // DELETE
        fun entitySuccessfullyDeleted(type: String, id: String): String {
            return "Successfully deleted ${type.capitalize()} with id: $id"
        }
    }
}