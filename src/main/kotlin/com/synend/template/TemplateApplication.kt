package com.synend.template

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TemplateApplication

/*
    UI accessible at
    http://localhost:8084/graphiql
    (note the "i" between graph and ql...)
    UI graph representation at
    http://localhost:8084/voyager
 */

fun main(args: Array<String>) {
    runApplication<TemplateApplication>(*args)
}

