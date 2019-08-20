package org.jonleb.examples.openid.test;

import lombok.extern.log4j.Log4j2;
import org.jonleb.examples.restapi.CharacterController;
import org.jonleb.templates.springboot.SpringBootConsoleApplication;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest(classes = {SpringBootConsoleApplication.class, CharacterController.class})
@AutoConfigureMockMvc
@EnableAutoConfiguration
@Log4j2
public class OpenIdTest {
    @Autowired
    private WebApplicationContext wac;

    //@Autowired
    //private FilterChainProxy springSecurityFilterChain;

    private MockMvc mockMvc;

    @BeforeAll
    public void setup() {
        //this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac)
        //        .addFilter(springSecurityFilterChain).build();
    }
}
