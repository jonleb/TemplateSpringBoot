package org.jonleb.templates.springboot.test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static com.fasterxml.jackson.core.JsonParser.*;

/**
 * Created by jonathan on 30/10/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSpringBootApp {

    // https://www.stubbornjava.com/posts/practical-jackson-objectmapper-configuration

    private static final Logger logger = LogManager.getLogger(TestSpringBootApp.class);

    @Test
    public void TutorialMapping(){
        logger.info("Run application");
    }
}
