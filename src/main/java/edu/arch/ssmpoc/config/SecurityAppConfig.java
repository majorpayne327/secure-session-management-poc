package edu.arch.ssmpoc.config;

import edu.arch.ssmpoc.controllers.HomeController;
import org.springframework.context.annotation.Bean;

/**
 * Created by chris on 10/27/16.
 */
public class SecurityAppConfig {

    @Bean
    public HomeController homeController(){
        return new HomeController();
    }
}
