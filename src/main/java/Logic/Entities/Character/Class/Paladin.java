package Logic.Entities.Character.Class;

import Logic.Entities.Armor.IArmor;
import Logic.Entities.Character.Warrior;
import Logic.Entities.Character.WarriorDecorator;
import Logic.Entities.Weapon.IWeapon;
import Logic.Mechanics.Damage;
import Logic.Mechanics.IStrategyOfFight;

import java.util.Random;

public class Paladin extends WarriorDecorator {

    private int currentHealth;
    Random random;

    public Paladin(String name, IWeapon weapon, IArmor armor, Warrior warrior, IStrategyOfFight strategyOfFight) {
        super(name, weapon, armor, warrior, strategyOfFight);
        System.out.println(name + " мое снаряжение: " + weapon.getName() + " и " + armor.getName());
        currentHealth = maxHealth();
        random = new Random();
    }

    private static final int CLASS_ADDITIONAL_HEALTH = 500;
    private static final int CLASS_ADDITIONAL_DEXTERITY = 5;
    private static final int CLASS_ADDITIONAL_STRENGTH = 8;
    private static final int CLASS_ADDITIONAL_PROTECTION = 15;
    private static final int CLASS_ADDITION_DAMAGE = 8;


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

    @Override
    public synchronized boolean isAlive() {
        return currentHealth > 0;
    }

    @Override
    public int baseDamage() {
        return warrior.baseDamage() + CLASS_ADDITION_DAMAGE;
    }

    @Override
    public String toString() {
        return this.Name;
    }

    @Override
    public Damage dealingDamage() {
        Damage dealingDamage = strategyOfFight.dealingDamage(this);
        System.out.println(this + " пытаюсь нанести урон: " + dealingDamage.getDamage());
        return dealingDamage;
    }

    @Override
    public synchronized Damage takingDamage(Damage damage) {
        Damage takenDamage = strategyOfFight.takingDamage(damage, this);

        if (takenDamage.getDamage() == 0)
            System.out.println(this + " Увернулся!");

        else {
            if (dealingDamage().isCritical())
                System.out.println(this + " мне въебали крит!!!: " + takenDamage.getDamage());
            else
                System.out.println(this + " мне въебали: " + takenDamage.getDamage());

            this.currentHealth = this.currentHealth() - takenDamage.getDamage();
            System.out.println(this + " осталось жизней: " + this.currentHealth);

            if (!isAlive())
                System.out.println(this + " мне пизда!");
            else
                System.out.println(this + " породолжаю бой!");
        }

        return takenDamage;
    }
}
