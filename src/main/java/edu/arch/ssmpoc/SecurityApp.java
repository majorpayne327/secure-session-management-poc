package edu.arch.ssmpoc;

import edu.arch.ssmpoc.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by chris on 10/27/16.
 */

@SpringBootApplication
public class SecurityApp {
    public static void main(String[] args){
        SpringApplication.run(SecurityApp.class, args);
    }
}
