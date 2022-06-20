package Logic.Entities.Skill;

import Logic.Entities.Character.*;
import Logic.Entities.Weapon.*;
import Logic.Mechanics.Damage;

public class BackStab extends Skill {
    private Damage damage;

    public BackStab() {
        super("BackStab");
    }


    @Override
    public Damage useSkill(WarriorDecorator warriorDecorator, Warrior warrior) {
        if (warriorDecorator.weapon instanceof Weapon) {
            return new Damage(warriorDecorator.warrior.getFinalDamage()*3);
        } else
            return 0;
    }
}
