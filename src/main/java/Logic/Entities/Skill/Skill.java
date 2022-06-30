package Logic.Entities.Skill;

import Logic.Entities.Character.*;
import Logic.Mechanics.Damage;
import Logic.Mechanics.SkillResult;

import java.util.List;

public abstract class Skill {
    private String name;

    public String getName() {
        return name;
    }

    public Skill(String name) {
        this.name = name;
    }

    public abstract SkillResult useSkill(WarriorDecorator warriorDecorator);
}
