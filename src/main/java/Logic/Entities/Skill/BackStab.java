package Logic.Entities.Impl;

import Logic.Entities.Skill;
import Logic.Entities.WarriorDecorator;

public class BackStab extends Skill {


    public BackStab() {
        super("коварный удар");
    }


    @Override
    public void useSkill(WarriorDecorator warriorDecorator) {
        if (warriorDecorator.weapon instanceof Knife) {
            System.out.println(warriorDecorator.attack()*3);
        } else System.out.println("0");

    }
}
