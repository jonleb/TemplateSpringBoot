package org.jonleb.examples.support.mapstruct.mapper;

import org.jonleb.examples.support.lombok.CharacterDto;
import org.jonleb.examples.support.mapstruct.domain.Character;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CharacterMapper {

    Character characterDtoToCharater(CharacterDto characterDto);
    CharacterDto characterToCharacterDto(Character character);

}
