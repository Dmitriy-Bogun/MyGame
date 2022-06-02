package Logic.Entities.Impl;

import Logic.Entities.*;

public class Paladin extends WarriorDecorator {

    public Paladin(IWeapon weapon, IArmor armor, Warrior warrior, Skill skill) {
        super(weapon,armor, warrior,skill);
    }

    @Override
    public void useSkill() {
      //  return 0;
    }

    @Override
    public int attack() {
        return warrior.attack() + weapon.getDamageValue();
    }
    public int protection() {
        return warrior.protection() + armor.getProtection() + 90;
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

    @Override
    public int maxHealth() {
        return warrior.maxHealth() + armor.getHealth() + 500;
    }

    @Override
    public int currentHealth() {
        return 0;
    }

    @Override
    public int dexterity() {
        return warrior.dexterity() + armor.getDexterity() + 60;
    }

    @Override
    public int strength() {
        return 0;
    }
}
