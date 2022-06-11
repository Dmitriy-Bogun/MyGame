package Logic.Entities.Skill;

import Logic.Entities.Character.Warrior;
import Logic.Entities.Character.WarriorDecorator;
import Logic.Entities.Weapon.Weapon;

public class Dissection extends Skill{
    public Dissection() {
        super("Dissection");
    }

    @Override
    public int useSkill(WarriorDecorator warriorDecorator, Warrior warrior) {
        //TODO: change weapon to special type of weapon
        if(warriorDecorator.weapon instanceof Weapon)
        return 0;
        else return 0;
    }
}
