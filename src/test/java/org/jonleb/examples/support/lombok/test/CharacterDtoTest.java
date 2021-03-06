package org.jonleb.examples.support.lombok.test;

import lombok.extern.log4j.Log4j2;
import org.jonleb.examples.support.lombok.CharacterDto;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Log4j2
@SpringBootTest
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
        var a = character != null;
        assert a;
        log.debug("End method with value " + a + " for " + character );
    }
}
