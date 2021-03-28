package com.gleidston.zup.vacinas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// explicaçao 12 9:29
@RestController
@RequestMapping("/vacina")
public class vacinaController {
    @RequestMapping("/ola")
    public String mensagen(){
        return "ola eu sou a vacina ";
    }
}
