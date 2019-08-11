package org.jonleb.examples.support.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Read more on
 * https://projectlombok.org/features/all
 * <p>
 * An example with a Dungeons & Dragons character definittion
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CharacterDto {

    private UUID uuid;

    private String name;

    private String race;

    /**
     * Character class
     */
    private String cclass;

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

}
