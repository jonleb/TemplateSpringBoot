package org.jonleb.examples.restapi;

import org.jonleb.examples.support.lombok.CharacterDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/character")
public class CharacterController {

    @GetMapping("/{characterId}")
    public ResponseEntity<CharacterDto> getCharacterById(@PathVariable("characterId") UUID characterId){
        CharacterDto character = createCharacterDto();
        character.setUuid(characterId);
        return new ResponseEntity<>(character, HttpStatus.OK);
    }

    @GetMapping("/name/{surname}")
    public ResponseEntity<CharacterDto> getCharacterByName(
            @PathVariable("surname") String surname){
        CharacterDto character = createCharacterDto();
        character.setName(surname);
        return new ResponseEntity<>(character, HttpStatus.OK);
    }

    private CharacterDto createCharacterDto() {
        return CharacterDto.builder()
                .uuid(UUID.randomUUID())
                .name("Yandar Toramun")
                .race("Human")
                .cclass("Cleric")
                .charisma(12)
                .constitution(12)
                .dexterity(10)
                .intelligence(9)
                .strength(13)
                .wisdom(16)
                .build();
    }
}
