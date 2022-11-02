package com.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping(method= RequestMethod.GET, path = "/greeting")
    public String helloWorld() {
        return "Hi there! It's me Adam Boyd";
    }

}
