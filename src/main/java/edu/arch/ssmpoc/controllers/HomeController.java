package edu.arch.ssmpoc.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

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
