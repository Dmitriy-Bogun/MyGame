package Logic.Entities.Skill;

import Logic.Entities.Character.Warrior;
import Logic.Entities.Character.WarriorDecorator;
import Logic.Entities.Weapon.Sword;

public class Dissection extends Skill{
    public Dissection() {
        super("Dissection");
    }

    @Override
    public int useSkill(WarriorDecorator warriorDecorator, Warrior warrior) {
        if(warriorDecorator.weapon instanceof Sword)
        return 0;
        else return 0;
    }
}
