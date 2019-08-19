package org.jonleb.examples.restapi.test;

import lombok.extern.log4j.Log4j2;
import org.jonleb.examples.restapi.CharacterController;
import org.jonleb.templates.springboot.SpringBootConsoleApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = {SpringBootConsoleApplication.class, CharacterController.class})
@AutoConfigureMockMvc
@Log4j2
class CharacterControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getCharacterById() throws Exception {
        log.debug("getCharacterById: ");
        MvcResult result = mockMvc.perform(get(
                "/api/v1/character/" + UUID.randomUUID()
                        .toString())
                .accept("application/json")).andExpect(status().isOk()).andReturn();
        log.debug(result.getResponse().getContentAsString());
    }
    @Test
    public void getCharacterByName() throws Exception {
        log.debug("getCharacterByName: ");
        MvcResult result = mockMvc.perform(get(
                "/api/v1/character/name/KalEl")
                .accept("application/json")).andExpect(status().isOk()).andReturn();
        log.debug(result.getResponse().getContentAsString());
    }

}
