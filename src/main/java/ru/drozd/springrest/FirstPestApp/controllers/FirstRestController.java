package ru.drozd.springrest.FirstPestApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api")
public class FirstRestController {


    @ResponseBody
    @GetMapping
    public  String sayHello(){
        return "Hello World!";
    }

    @ResponseBody
    @GetMapping("/bye")
    public String sayGoodBye(){
        return "GoodBye";
    }

    @GetMapping("/hello")
    public String getHello(){
        return "hello";
    }
}
