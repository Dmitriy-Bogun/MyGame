package Logic.Entities.Character.Class;

import Logic.Entities.Character.*;
import Logic.Entities.Weapon.*;
import Logic.Entities.Armor.*;
import Logic.Entities.Skill.*;

public class Assassin extends WarriorDecorator {

    private int currentHealth;
    public Assassin(IWeapon weapon, IArmor armor, Warrior warrior, Skill skill) {
        super(weapon, armor, warrior, skill);
        currentHealth = maxHealth();
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
        return 0;
    }

    @Override
    public int dexterity() {
        return warrior.dexterity() + armor.getDexterity() + CLASS_ADDITIONAL_DEXTERITY;
    }

    @Override
    public int strength() {
        return warrior.strength() + armor.getStrength() + CLASS_ADDITIONAL_STRENGTH;
    }

    @Override
    public double chanceOfCriticalDamage() {
        return 0;
    }

    @Override
    public double chanceOfParrying() {
        return 0;
    }

    @Override
    public void takingDamage(int damage) {

    }
}