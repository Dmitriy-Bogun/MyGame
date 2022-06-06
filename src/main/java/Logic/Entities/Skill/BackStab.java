package Logic.Entities.Skill;

import Logic.Entities.Character.*;
import Logic.Entities.Weapon.*;

public class BackStab extends Skill {


    public BackStab() {
        super("коварный удар");
    }


    @Override
    public void useSkill(WarriorDecorator warriorDecorator) {
        if (warriorDecorator.weapon instanceof Knife) {
            System.out.println(warriorDecorator.attack().getFinalDamage()*3);
        } else System.out.println("0");

    }
}
