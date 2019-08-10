package org.jonleb.templates.springboot;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by jonathan on 30/10/17.
 */
@SpringBootApplication
public class SpringBootConsoleApplication {
    public static void main(String[] args) throws Exception {

        SpringApplication.run(SpringBootConsoleApplication.class, args);

    }

    public void decodeJson(){
        ObjectMapper mapper = new ObjectMapper();

    }
}
