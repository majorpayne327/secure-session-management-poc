package edu.arch.ssmpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import java.util.ArrayList;

/**
 * Created by chris on 10/27/16.
 */
@SpringBootApplication
@EnableWebSecurity
public class SecurityApp {
    public static void main(String[] args){

        Menu.menu.add(new MenuItem("Ham",2.99,5));
        Menu.menu.add(new MenuItem("Milk",2.99,8));
        Menu.menu.add(new MenuItem("Bread",3,7));
        Menu.menu.add(new MenuItem("Cassette Tapes",6,5));
        Menu.menu.add(new MenuItem("Compact Disks",5.99,5));
        Menu.menu.add(new MenuItem("DVDs",9,20));
        SpringApplication.run(SecurityApp.class, args);
    }
}
