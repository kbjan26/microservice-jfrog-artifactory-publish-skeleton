package com.micro.service.helloworld.web;

import com.micro.service.helloworld.User;
import com.micro.service.helloworld.config.HelloWorldProperties;
import com.micro.service.helloworld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkout")
public class HelloWorldController {

    @Autowired
    private HelloWorldProperties helloWorldProperties;

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/greetings")
    public String getGreetings(){

        return helloWorldProperties.getGreetings();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){

        return helloWorldService.getUser(id);

    }
}
