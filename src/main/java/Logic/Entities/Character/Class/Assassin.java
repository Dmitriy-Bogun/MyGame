package Logic.Entities.Character.Class;

import Logic.Entities.Character.*;
import Logic.Entities.Weapon.*;
import Logic.Entities.Armor.*;
import Logic.Entities.Skill.*;
import Logic.Mechanics.Damage;
import Logic.Mechanics.IStrategyOfFight;

import java.util.List;
import java.util.Random;

public class Assassin extends WarriorDecorator implements IStrategyOfFight {

    private int currentHealth;
    Random random;
    public Assassin(String name, IWeapon weapon, IArmor armor, Warrior warrior, Skill skill) {
        super(name,weapon, armor, warrior, skill);
        System.out.println(name + " мое снаряжение: "+ weapon.getName() + " и " + armor.getName());
        currentHealth = maxHealth();
        random = new Random();
    }

    private static final int CLASS_ADDITIONAL_HEALTH = 3000;
    private static final int CLASS_ADDITIONAL_DEXTERITY = 10;
    private static final int CLASS_ADDITIONAL_STRENGTH = 5;
    private static final int CLASS_ADDITIONAL_PROTECTION = 10;

    @Override
    public void useSkill(List skillsList) {
        System.out.println(skill.getName());
        skill.useSkill(this,this);
           // return attack() * skill.getSkillDamage(weapon);

    }

//    @Override
//    public Damage attack() {
//        int damage;
//        if (chanceOfCriticalDamage()) damage = (warrior.attack().getFinalDamage() + weapon.getDamageValue())*2;
//        else damage = warrior.attack().getFinalDamage() + weapon.getDamageValue();
//        System.out.println(Name+" пытаюсь нанести урон "+damage);
//        return new Damage(damage);
//
//    }

    @Override
    public int protection() {
        return warrior.protection() + armor.getProtection() + CLASS_ADDITIONAL_PROTECTION;
    }

    @Override
    public int maxHealth() {
        return warrior.maxHealth() + armor.getHealth() + CLASS_ADDITIONAL_HEALTH;
    }

    @Override
    public int currentHealth() {
        return currentHealth;
    }

    @Override
    public int dexterity() {
        return warrior.dexterity() + armor.getDexterity() + CLASS_ADDITIONAL_DEXTERITY;
    }

    @Override
    public int strength() {
        return warrior.strength() + armor.getStrength() + CLASS_ADDITIONAL_STRENGTH;
    }


   private boolean chanceOfCriticalDamage() {
        int temp = 100;
        int chance = random.nextInt(temp);
       return chance <= this.dexterity();
   }

    private boolean chanceOfParrying() {
        int temp = 100;
        int chance = random.nextInt(temp);
        return !(chance > (double)this.dexterity() / 2.0);
    }

   // @Override
    //public synchronized void takingDamage(Damage damage) {
//
//        if (!chanceOfParrying()){
//            int damaged = damage.getFinalDamage() - (damage.getFinalDamage()*this.protection()/100);
//            System.out.println(Name+" мне въебали: "+ damaged);
//            this.currentHealth = this.currentHealth - damaged;
//            System.out.println(Name+" осталось жизней: "+ this.currentHealth);
//            if (!isAlive()) System.out.println(Name+" мне пизда!");
//            else System.out.println(Name +" породолжаю бой!");
//        }
//        else System.out.println(Name+" Увернулся!");
//    }

    @Override
    public synchronized boolean isAlive(){
        return currentHealth>0;
    }
    @Override
    public String toString()
    {
        return this.Name;
    }

    @Override
    public Damage dealingDamage() {
        return new Damage(dealingDamage().getFinalDamage());
    }

    @Override
    public Damage takingDamage(Damage damage) {
        return null;
    }
}