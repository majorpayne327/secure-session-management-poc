package edu.arch.securityapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chris on 10/27/16.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello World";
    }
}
