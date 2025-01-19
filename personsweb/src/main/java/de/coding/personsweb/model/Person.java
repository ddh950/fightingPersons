package de.coding.personsweb.model;

import java.util.UUID;

public class Person{

    private final String id = UUID.randomUUID().toString();
    private final Ability[] abilities;
    private final String name;

    private int healthPointsMax = 50;
    private int healthPointsCurrent = healthPointsMax;
    private int experiencePoints = 0;

    private boolean readyToFight = true;
    private boolean inFights = false;
    private boolean alive = true;

    public Person(
            String name,
            Ability[] abilities
    ) {
        this.abilities = abilities;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public Ability[] getAbilities() {
        return abilities;
    }

    public String getName() {
        return name;
    }

    public int getHealthPointsMax() {
        return healthPointsMax;
    }

    public int getHealthPointsCurrent() {
        return healthPointsCurrent;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public boolean isReadyToFight() {
        return readyToFight;
    }

    public boolean isInFights() {
        return inFights;
    }

    public boolean isAlive() {
        return alive;
    }
}
