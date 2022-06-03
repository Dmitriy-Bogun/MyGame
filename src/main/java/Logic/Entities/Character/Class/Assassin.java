package Logic.Entities.Character.Class;

import Logic.Entities.Character.*;
import Logic.Entities.Weapon.*;
import Logic.Entities.Armor.*;
import Logic.Entities.Skill.*;

import java.util.Random;

public class Assassin extends WarriorDecorator {

    private int currentHealth;
    Random random;
    public Assassin(IWeapon weapon, IArmor armor, Warrior warrior, Skill skill) {
        super(weapon, armor, warrior, skill);
        currentHealth = maxHealth();
        random = new Random();
    }

    private static final int CLASS_ADDITIONAL_HEALTH = 300;
    private static final int CLASS_ADDITIONAL_DEXTERITY = 10;
    private static final int CLASS_ADDITIONAL_STRENGTH = 5;
    private static final int CLASS_ADDITIONAL_PROTECTION = 10;

    @Override
    public void useSkill() {
        System.out.println(skill.getName());
        skill.useSkill(this);
           // return attack() * skill.getSkillDamage(weapon);

    }

    @Override
    public int attack() {
        return warrior.attack() + weapon.getDamageValue();
    }

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

    @Override
    public void takingDamage(int damage) {
        if (!chanceOfParrying()){
            this.currentHealth = this.currentHealth - (damage - (damage*this.protection()/100));
        }
    }

    @Override
    public boolean isAlive(){
        return currentHealth>0;
    }
}