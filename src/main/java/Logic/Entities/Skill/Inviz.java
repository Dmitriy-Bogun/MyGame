package Logic.Entities.Skill;

import Logic.Entities.Character.WarriorDecorator;
import Logic.Entities.Weapon.WeaponType;
import Logic.Mechanics.SkillResult;

public class Inviz extends Skill {

    public Inviz() {
        super("Inviz");
    }

    @Override
    public SkillResult useSkill(WarriorDecorator warriorDecorator) {
        if(warriorDecorator.weapon.getWeaponType() == WeaponType.KNIFE || warriorDecorator.weapon.getWeaponType() == WeaponType.SWORD){
        }
     return new SkillResult(0,0,true);
    }
}
