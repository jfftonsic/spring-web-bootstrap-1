package com.tonsic.changepackage.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class HomeController(@Value("\${whatever.field}") val whatever: String)  {

    @GetMapping("/home")
    fun home() : ModelAndView {
        return ModelAndView("home", mapOf("viewParam" to whatever))
    }

}
