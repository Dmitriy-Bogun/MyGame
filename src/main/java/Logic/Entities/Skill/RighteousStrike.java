package Logic.Entities.Skill;

import Logic.Entities.Armor.ArmorType;
import Logic.Entities.Character.WarriorDecorator;
import Logic.Entities.Weapon.WeaponType;
import Logic.Mechanics.SkillResult;

public class RighteousStrike extends Skill{
    SkillResult skillResult;
    public RighteousStrike() {
        super("Righteous Strike");
    }

    @Override
    public SkillResult useSkill(WarriorDecorator warriorDecorator) {
        if (warriorDecorator.weapon.getWeaponType() == WeaponType.SWORD && warriorDecorator.armor.getArmorType() == ArmorType.MEDIUMARMOR) {
            skillResult = new SkillResult(0, warriorDecorator.baseDamage() * 3,false);
    }
        if (warriorDecorator.weapon.getWeaponType() == WeaponType.SWORD && warriorDecorator.armor.getArmorType() == ArmorType.HARDARMOR){
            skillResult = new SkillResult(0, warriorDecorator.baseDamage() * 4, false);
        }
        return skillResult;
    }
}
