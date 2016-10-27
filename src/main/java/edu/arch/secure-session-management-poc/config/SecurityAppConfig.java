package edu.arch.securityapp.config;

import edu.arch.securityapp.controllers.HomeController;
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
