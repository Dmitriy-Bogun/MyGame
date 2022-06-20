package Logic.Entities.Skill;

import Logic.Entities.Character.*;
import Logic.Mechanics.Damage;

public class Inviz extends Skill {
    public Inviz() {
        super("Inviz");
    }

    @Override
    public Damage useSkill(WarriorDecorator warriorDecorator, Warrior warrior) {
        if(warriorDecorator.weapon.getCost() > 10){
            System.out.println("not escape to invizible");
        }else {
            System.out.println("go to invize");

        }return warrior.dexterity()*2;
    }
}
