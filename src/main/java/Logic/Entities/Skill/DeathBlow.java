package Logic.Entities.Skill;

import Logic.Entities.Character.WarriorDecorator;
import Logic.Entities.Weapon.WeaponType;
import Logic.Mechanics.SkillResult;

public class DeathBlow extends Skill {
    SkillResult skillResult;
    public DeathBlow() {
        super("Death Blow");
    }

    @Override
    public SkillResult useSkill(WarriorDecorator warriorDecorator) {

        if (warriorDecorator.weapon.getWeaponType() == WeaponType.KNIFE) {
            skillResult = new SkillResult(0,warriorDecorator.baseDamage() * 3,false);

        } if (warriorDecorator.weapon.getWeaponType() == WeaponType.SWORD) {
            skillResult = new SkillResult(0, warriorDecorator.baseDamage() * 2, false);
    }
            return skillResult;
        }
}
