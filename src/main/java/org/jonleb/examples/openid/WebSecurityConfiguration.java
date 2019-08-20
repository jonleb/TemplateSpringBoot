package org.jonleb.examples.openid;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        /**
         * Original solution
        http
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .and()
                .authorizeRequests()
                .mvcMatchers("/api/v1/character/*").denyAll()
                .and()
                .authorizeRequests().antMatchers("/api/v1/character/name/*").permitAll()
                .and().anonymous()
                ;
        **/

        /**
         * Solution
         * https://stackoverflow.com/questions/57575249/rest-services-always-returning-error-401-with-postman-but-integration-test-are-w/57575511#57575511
        */

        http
                .authorizeRequests()
                    //.mvcMatchers("/api/v1/character/name/**").permitAll()
                    .mvcMatchers("/api/v1/character/*").denyAll()
                    .anyRequest().permitAll()
                ;
        ;

        /*
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/**").permitAll()
                .antMatchers("/api/v1/character/name/**").permitAll()
                .antMatchers("/api/v1/character/**").denyAll();
        */

    }
}
