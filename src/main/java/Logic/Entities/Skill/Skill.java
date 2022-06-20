package Logic.Entities.Skill;

import Logic.Entities.Character.*;
import Logic.Mechanics.Damage;

import java.util.List;

public abstract class Skill {
    List<Skill> skillList;
    private String name;

    public String getName() {
        return name;
    }

    public Skill(String name) {
        this.name = name;
    }

    public abstract int useSkill(WarriorDecorator warriorDecorator, Warrior warrior);
}
