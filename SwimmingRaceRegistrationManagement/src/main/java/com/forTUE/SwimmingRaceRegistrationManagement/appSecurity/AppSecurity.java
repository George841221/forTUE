
/*package com.forTUE.SwimmingRaceRegistrationManagement.appSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class AppSecurity extends WebSecurityConfigurerAdapter {

    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }



*//*@Autowired
    protected void configureWeb(final HttpSecurity http) throws Exception{
        http


                .logout().logoutSuccessUrl("/homePage.html")
                .and()
                .authorizeRequests()
                .antMatchers("/homePage", "/loginPage", "/regPage").permitAll()
                .antMatchers("/loggedInUser").hasAuthority("USER");

    }*//*

}*/
