package Logic.Entities.Skill;

import Logic.Entities.Character.Warrior;
import Logic.Entities.Character.WarriorDecorator;

public class Weakening extends Skill{
    public Weakening() {
        super("Weakening");
    }

    @Override
    public int useSkill(WarriorDecorator warriorDecorator, Warrior warrior) {
        return 0;
    }
}
