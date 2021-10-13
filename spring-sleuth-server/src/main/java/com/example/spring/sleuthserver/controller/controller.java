package com.example.spring.sleuthserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/hello")
public class controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(controller.class);

    @GetMapping("/server")
    public String hello(){
        LOGGER.info("This is info Msg...");
        return "hello world";
    }
}
