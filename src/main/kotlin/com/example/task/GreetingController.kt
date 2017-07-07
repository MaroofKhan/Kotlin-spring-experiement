package com.example.task

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")
@RestController

class GreetingController {

    @RequestMapping("/greeting")

    fun greeting(@RequestParam(value = "name", defaultValue = "Random Person") name: String, @RequestParam(value = "greeting", defaultValue = "Hello") greeting: String): Greeting {
        return Greeting(name, "$greeting, $name!")
    }
}
