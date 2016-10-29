package edu.arch.ssmpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


/**
 * Created by chris on 10/27/16.
 */
@SpringBootApplication
@EnableWebSecurity
public class SecurityApp {
    public static void main(String[] args){
        SpringApplication.run(SecurityApp.class, args);
    }
}
