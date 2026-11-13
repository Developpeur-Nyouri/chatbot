package org.ldv.chatbot.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ChatBotController(

){
    @GetMapping("/")
    fun home ():String{
        return "index"
    }

    @GetMapping("/connexion","/login")
    fun login ():String{
        return "auth/connexion"
    }
}