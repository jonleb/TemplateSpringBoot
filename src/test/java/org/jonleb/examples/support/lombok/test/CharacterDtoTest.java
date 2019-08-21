package org.jonleb.examples.support.lombok.test;

import lombok.extern.log4j.Log4j2;
import org.jonleb.examples.support.lombok.CharacterDto;
import org.jonleb.templates.SpringBootConsoleApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Log4j2
@SpringBootTest(classes = {SpringBootConsoleApplication.class})
public class CharacterDtoTest {
    @Test
    public void testCharacterDtoInstantiation() {
        log.debug("Start method");
        var character = CharacterDto.builder()
                .name("Test")
                .race("Human")
                .cclass("Cleric")
                .charisma(13)
                .constitution(12)
                .dexterity(10)
                .intelligence(9)
                .strength(13)
                .wisdom(3)
                .build();
        assert character != null;
        log.debug(String.format("End method with value %s", character) );
    }
}
