package org.jonleb.templates;

import org.jonleb.examples.openid.WebSecurityConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by jonathan on 30/10/17.
 */
@SpringBootApplication(
        scanBasePackageClasses = {
                WebSecurityConfiguration.class},
        scanBasePackages = {
                "org.jonleb.examples.restapi"
        })
public class SpringBootConsoleApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootConsoleApplication.class, args);
    }
}
