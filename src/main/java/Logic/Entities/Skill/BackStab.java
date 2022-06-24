package Logic.Entities.Skill;

import Logic.Entities.Character.*;
import Logic.Entities.Weapon.*;
import Logic.Mechanics.Damage;
import Logic.Mechanics.SkillResult;

public class BackStab extends Skill {
    private Damage damage;

    public BackStab() {
        super("BackStab");
    }


    @Override
    public SkillResult useSkill(WarriorDecorator warriorDecorator) {
        if (warriorDecorator.weapon.getWeaponType() == WeaponType.KNIFE) {
        }
        return new SkillResult(0, warriorDecorator.baseDamage() * 3,false);
    }
}
