package Logic.Entities.Skill;

import Logic.Entities.Armor.ArmorType;
import Logic.Entities.Character.WarriorDecorator;
import Logic.Mechanics.SkillResult;

public class HeavenlyShield extends Skill {
    public HeavenlyShield() {
        super("HeavenlyShield");
    }

    @Override
    public SkillResult useSkill(WarriorDecorator warriorDecorator) {
        if (warriorDecorator.armor.getArmorType() == ArmorType.MEDIUMARMOR || warriorDecorator.armor.getArmorType() == ArmorType.HARDARMOR){
        }
        return new SkillResult(0, 0, false);
    }
}

