package org.jonleb.examples.support.mapstruct.test;

import lombok.extern.log4j.Log4j2;
import org.jonleb.examples.support.lombok.CharacterDto;
import org.jonleb.examples.support.mapstruct.mapper.CharacterMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mapstruct.factory.Mappers;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@Log4j2
public class CharacterMapperTest {

    @Test
    public void testCharacterMapper(){
        log.debug("Start test Character Mapper");
        CharacterMapper characterMapper = Mappers.getMapper(CharacterMapper.class);
        var characterDto = CharacterDto.builder()
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
        var character = characterMapper.characterDtoToCharater(characterDto);
        characterDto = characterMapper.characterToCharacterDto(character);
        assert character.getCclass().equals(characterDto.getCclass());
        log.debug(characterDto + " is equal to " + character);
        log.debug("End test Character Mapper");
    }
}
