package Logic.Entities.Skill;

import Logic.Entities.Character.Warrior;
import Logic.Entities.Character.WarriorDecorator;
import Logic.Mechanics.Damage;

public class Weakening extends Skill{
    public Weakening() {
        super("Weakening");
    }

    @Override
    public Damage useSkill(WarriorDecorator warriorDecorator, Warrior warrior) {
        return 0;
    }
}
