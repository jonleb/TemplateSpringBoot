package org.jonleb.templates.springboot.test;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by jonathan on 30/10/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSpringBootApp {

    private static final Logger logger = LogManager.getLogger(TestSpringBootApp.class);

    @Test
    public void TestRunApplication(){
        logger.info("Run application");
    }
}
