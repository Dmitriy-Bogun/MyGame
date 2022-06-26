package Logic.Entities.Skill;

import Logic.Entities.Armor.ArmorType;
import Logic.Entities.Character.WarriorDecorator;
import Logic.Entities.Weapon.WeaponType;
import Logic.Mechanics.SkillResult;

public class SwordOfJustice extends Skill{
    SkillResult skillResult;
    public SwordOfJustice() {
        super("Sword Of Justice");
    }

    @Override
    public SkillResult useSkill(WarriorDecorator warriorDecorator) {
        if ((warriorDecorator.weapon.getWeaponType() == WeaponType.SWORD || warriorDecorator.weapon.getWeaponType() == WeaponType.KNIFE) && warriorDecorator.armor.getArmorType() == ArmorType.MEDIUMARMOR) {
            skillResult = new SkillResult(warriorDecorator.weapon.getDamageValue() * 5, 0 ,false);
        }
        if ((warriorDecorator.weapon.getWeaponType() == WeaponType.SWORD || warriorDecorator.weapon.getWeaponType() == WeaponType.KNIFE) && warriorDecorator.armor.getArmorType() == ArmorType.HARDARMOR){
            skillResult = new SkillResult(warriorDecorator.weapon.getDamageValue() * 6, 0 , false);
        }
        return skillResult;
    }
}
