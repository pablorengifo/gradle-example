package com.gradle.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by prengifo on 9/1/17.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
