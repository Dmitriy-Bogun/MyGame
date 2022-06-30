package Logic.Entities.BattleStrategies;

import Logic.Entities.Character.WarriorDecorator;
import Logic.Entities.Skill.BackStab;
import Logic.Entities.Skill.Inviz;
import Logic.Entities.Skill.Skill;
import Logic.Entities.Weapon.WeaponType;
import Logic.Mechanics.Damage;
import Logic.Mechanics.IStrategyOfFight;

import java.util.Random;

public class ShadowAssassinStrategy implements IStrategyOfFight {

    private Random random;
    private Skill backstub;
    private Skill inviz;
    public ShadowAssassinStrategy() {
        random = new Random();
        backstub = new BackStab();
        inviz = new Inviz();
    }

    @Override
    public  Damage dealingDamage(WarriorDecorator warrior) {

        Damage dealDamage;

        if (chanceToUseSkill(warrior.dexterity()) && warrior.weapon.getWeaponType() == WeaponType.KNIFE )
        {
            System.out.println(warrior + " Использую скилл "+backstub.getName());
            dealDamage = new Damage(backstub.useSkill(warrior).getChangeMainDamage(),true);
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
        if(chanceToUseSkill(warrior.dexterity()) && (warrior.weapon.getWeaponType() == WeaponType.KNIFE || warrior.weapon.getWeaponType() == WeaponType.SWORD )){
            System.out.println(warrior + " Использую скилл "+inviz.getName());
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
       return chance <= dexterity;
   }

    private boolean chanceToUseSkill(int dexterity) {
        int temp = 100;
        int chance = random.nextInt(temp);
        return chance <= (double)dexterity/2.0;
    }

    private boolean chanceOfParrying(int dexterity) {
        int temp = 100;
        int chance = random.nextInt(temp);
        return !(chance > (double)dexterity / 2.0);
    }
}
