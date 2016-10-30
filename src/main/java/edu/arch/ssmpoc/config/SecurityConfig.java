package edu.arch.ssmpoc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;

import javax.sql.DataSource;

/**
 * Created by chris on 10/27/16.
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication().withUser("unAuth").password("").roles("unAuth");
        auth.inMemoryAuthentication().withUser("test").password("test").roles("User");
        auth.inMemoryAuthentication().withUser("admin").password("test").roles("PrivilegedUser");

    }

    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {

        httpSecurity.authorizeRequests()
                .antMatchers("/details/**").access("hasRole('User') or hasRole('PrivilegedUser')")
                .antMatchers("/").permitAll()
                .and().anonymous().authorities("Anonymous")
                .and().formLogin();
    }
}
