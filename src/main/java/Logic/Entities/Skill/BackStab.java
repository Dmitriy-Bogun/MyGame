package Logic.Entities.Skill;

import Logic.Entities.Character.*;
import Logic.Entities.Weapon.*;

public class BackStab extends Skill {

    public BackStab() {
        super("BackStab");
    }


    @Override
    public int useSkill(WarriorDecorator warriorDecorator, Warrior warrior) {
        if (warriorDecorator.weapon instanceof Weapon) {
            return warriorDecorator.attack().getFinalDamage()*3;
        } else
            return 0;
    }
}
