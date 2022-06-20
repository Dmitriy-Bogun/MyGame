package Logic.Entities.Skill;

import Logic.Entities.Character.Warrior;
import Logic.Entities.Character.WarriorDecorator;
import Logic.Mechanics.Damage;

public class Healing extends Skill{
    public Healing(String name) {
        super(name);
    }

    @Override
    public Damage useSkill(WarriorDecorator warriorDecorator, Warrior warrior) {
        return 0;
    }
}
