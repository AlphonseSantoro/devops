package com.slakje17.devops

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DevopsApplication

fun main(args: Array<String>) {
    runApplication<DevopsApplication>(*args)

    @RestController
    class HomeController {

        @RequestMapping("/")
        fun landing(): String {
            return "This is the landing page";
        }

    }
}
