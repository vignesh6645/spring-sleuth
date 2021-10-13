package com.example.spring.sleuthclient.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users/hello")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/client")
    public String hello(){
        LOGGER.info("connecting the server....");
        String Data = restTemplate.getForObject("http://localhost:8081/user/hello/server",String.class);
        LOGGER.info("Server Connected");
        return Data;
    }
}
