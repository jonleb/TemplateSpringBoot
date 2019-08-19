package org.jonleb.templates.springboot.test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * Created by jonathan on 30/10/17.
 */
@SpringBootTest
public class TestSpringBootApp {

    private static final Logger logger = LogManager.getLogger(TestSpringBootApp.class);

    @Test
    public void TestRunApplication(){
        logger.info("Run application");
    }
}
