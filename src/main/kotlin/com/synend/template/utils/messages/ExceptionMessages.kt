package com.synend.template.utils.messages

class ExceptionMessages{

    companion object {

        fun notFoundMessage (type: String, paramValue: String, value: String): String {
            return "Can't find ${type.capitalize()} with ${paramValue.capitalize()}: $value"
        }

        fun inputFilterInvalid() : String {
            return "You can only use one filter at time"
        }

        fun invalidFieldCombination(fields: String) : String {
            return "You provided an invalid combination of query parameters: $fields"
        }

        fun offsetAndLimitInvalid(): String {
            return "Offset must be grater than/or equal 0 and limit must be greater than/or equal 1"
        }

        fun tooLargeOffset(offset: Int): String {
            return "Too large offset: $offset"
        }

        fun missingRequiredField(field: String): String {
            return "Missing required field: ${field.capitalize()}"
        }

        fun invalidIdParameter(): String {
            return "Invalid id parameter. This should be a numeric string"
        }
        
        fun invalidTimeFormat(): String {
            return "Bad time format, this follows following formatting rules: \"yyyy-MM-dd HH:mm:ss\""
        }
        
        fun invalidJsonFormat(): String {
            return "Invalid JSON-format"
        }

        fun invalidParameter(required: String, received: String): String {
            return "Invalid parameter, expected: ${required.capitalize()}, but received: ${received.capitalize()}"
        }

        fun unableToParse(value: String): String {
            return "Unable to parse object variable: ${value.capitalize()}"
        }

        fun illegalParameter(value: String) : String{
            return "You should not provide parameter: ${value.capitalize()} in this request"
        }

        fun resourceAlreadyExists(type: String, paramValue: String, value: String): String {
            return "${type.capitalize()} with ${paramValue.capitalize()} equal to: '${value.capitalize()}' already exists."
        }

        fun notMachingIds(type: String): String {
            return "The given ${type.capitalize()} in DTO doesn't match the $type in the database"
        }

        fun subIdNotMatchingParentId(subId: String, parentId: String) : String {
            return "Foreign key '${subId.capitalize()}' not match primary key '${parentId.capitalize()}'"
        }
        
        fun preConditionFailed() : String{
            return "Precondition failed, your copy is not up to date."
        }

        fun missingRequiredHeader(header: String): String {
            return "Missing required header: $header"
        }

        fun unauthorizedUser(username: String) : String {
            return "$username is not authorized to to perform this action"
        }

        fun credentialsMissMatch() : String {
            return "The provided Username or password is wrong."
        }

        fun usernameInUse() : String {
            return "The username is already in use."
        }

        fun unauthenticated() : String {
            return "Unauthenticated, you need to log in."
        }

    }

}