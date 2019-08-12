package org.jonleb.examples.support.mapstruct.domain;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Character {
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
