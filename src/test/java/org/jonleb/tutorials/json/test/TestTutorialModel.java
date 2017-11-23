package org.jonleb.tutorials.json.test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jonleb.tutorials.json.model.Tutorial;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static com.fasterxml.jackson.core.JsonParser.*;
import static com.fasterxml.jackson.core.JsonParser.Feature.*;

/**
 * Created by jonathan on 30/10/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestTutorialModel {

    // https://www.stubbornjava.com/posts/practical-jackson-objectmapper-configuration

    private static final Logger logger = LogManager.getLogger(TestTutorialModel.class);

    @Test
    public void TutorialMapping(){
        try {
            String jsontree = "{\"id\": \"0\", \"name\":\"My Tutorial\", \"tst\":\"r\"}";
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
            mapper.configure(Feature.ALLOW_MISSING_VALUES, true);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            Tutorial tutorial = mapper.readValue(jsontree, Tutorial.class);
            logger.info("DEBUG Turorial ID : " + tutorial.getId());
        } catch (IOException e) {
            e.printStackTrace();
            assert false;
        }
    }
}
