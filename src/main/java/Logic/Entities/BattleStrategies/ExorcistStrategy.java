package Logic.Entities.BattleStrategies;

import Logic.Entities.Armor.ArmorType;
import Logic.Entities.Character.WarriorDecorator;
import Logic.Entities.Skill.BackStab;
import Logic.Entities.Skill.HeavenlyShield;
import Logic.Entities.Skill.RighteousStrike;
import Logic.Entities.Skill.Skill;
import Logic.Entities.Weapon.WeaponType;
import Logic.Mechanics.Damage;
import Logic.Mechanics.IStrategyOfFight;

import java.util.Random;

public class ExorcistStrategy implements IStrategyOfFight {

    private Random random;
    private Skill heavenlyShield;
    private Skill righteousStrike;
    public ExorcistStrategy() {
        random = new Random();
        heavenlyShield = new HeavenlyShield();
        righteousStrike = new RighteousStrike();
    }

    @Override
    public Damage dealingDamage(WarriorDecorator warrior) {

        Damage dealDamage;

        if (chanceToUseSkill(warrior.dexterity()) && (warrior.weapon.getWeaponType() == WeaponType.SWORD && warrior.armor.getArmorType() == ArmorType.MEDIUMARMOR))
        {
            System.out.println(warrior + " Использую скилл "+righteousStrike.getName());
            dealDamage = new Damage(righteousStrike.useSkill(warrior).getChangeMainDamage(),true);
        }if (chanceToUseSkill(warrior.dexterity()) && (warrior.weapon.getWeaponType() == WeaponType.SWORD && warrior.armor.getArmorType() == ArmorType.HARDARMOR))
        {
            System.out.println(warrior + " Использую скилл "+righteousStrike.getName());
            dealDamage = new Damage(righteousStrike.useSkill(warrior).getChangeMainDamage(),true);
        }
        else if (chanceOfCriticalDamage(warrior.dexterity())){
            dealDamage = new Damage((warrior.baseDamage() + warrior.weapon.getDamageValue())*2,true);
        }
        else dealDamage = new Damage(warrior.baseDamage() + warrior.weapon.getDamageValue(),false);
        return dealDamage;
    }

    @Override
    public synchronized Damage takingDamage(Damage damage, WarriorDecorator warrior) {

        Damage takenDamage;
        if(chanceToUseSkill(warrior.dexterity()) && (warrior.armor.getArmorType() == ArmorType.MEDIUMARMOR || warrior.armor.getArmorType() == ArmorType.HARDARMOR)){
            System.out.println(warrior + " Использую скилл "+heavenlyShield.getName());
            takenDamage = new Damage(0, false);
        }
        if (!chanceOfParrying(warrior.dexterity())){
            takenDamage = new Damage(damage.getDamage() - (damage.getDamage()*warrior.protection()/100),damage.isCritical());
        }
        else{
            takenDamage = new Damage(0,false);
        }
        return takenDamage;
    }

    private boolean chanceOfCriticalDamage(int dexterity) {
        int temp = 100;
        int chance = random.nextInt(temp);
        return chance <= (dexterity - 10);
    }

    private boolean chanceToUseSkill(int dexterity) {
        int temp = 70;
        int chance = random.nextInt(temp);
        return chance <= (double)dexterity/2.0;
    }

    private boolean chanceOfParrying(int dexterity) {
        int temp = 100;
        int chance = random.nextInt(temp);
        return !(chance > (double)dexterity / 2.5);
    }

}
