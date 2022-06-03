package Logic.Entities.Impl;

import Logic.Entities.Skill;
import Logic.Entities.WarriorDecorator;

public class Inviz extends Skill {
    public Inviz() {
        super("Inviz");
    }

    @Override
    public void useSkill(WarriorDecorator warriorDecorator) {
        if(warriorDecorator.weapon.getCost() > 10){
            System.out.println("not escape to invizible");
        }else {
            System.out.println("go to invize");
        }

    }
}
