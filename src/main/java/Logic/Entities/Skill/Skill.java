package Logic.Entities.Skill;

import Logic.Entities.Character.*;

public abstract class Skill {
    private String name;

    public String getName() {
        return name;
    }

    public Skill(String name) {
        this.name = name;
    }

    public abstract int useSkill(WarriorDecorator warriorDecorator,Warrior warrior);
}
