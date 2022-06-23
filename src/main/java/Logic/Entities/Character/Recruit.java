package Logic.Entities.Character;

import Logic.Mechanics.Damage;

public class Recruit extends Warrior {
    private static final int CLASS_MAX_HEALTH = 300;
    private static final int CLASS_DEXTERITY = 10;
    private static final int CLASS_STRENGTH = 5;
    private static final int CLASS_PROTECTION = 0;
    private static final int CLASS_DAMAGE = 10;
    private int currentHealth;

    public Recruit() {
        currentHealth = maxHealth();
    }

    @Override
    public Damage dealingDamage() {
        return new Damage(CLASS_DAMAGE,false);
    }

    //TODO: Change strategy of Recruit
    @Override
    public Damage takingDamage(Damage damage) {
        return new Damage(damage.getDamage(),false);
    }

    @Override
    public int protection() {
        return CLASS_PROTECTION;
    }

    public double chanceOfCriticalDamage() {
        return CLASS_DEXTERITY;
    }

    public double chanceOfParrying() {
        return CLASS_DEXTERITY/2.0;
    }


    @Override
    public int maxHealth() {
        return CLASS_MAX_HEALTH;
    }

    @Override
    public int currentHealth() {
        return currentHealth;
    }

    @Override
    public int dexterity() {
        return CLASS_DEXTERITY;
    }

    @Override
    public int strength() {
        return CLASS_STRENGTH;
    }

    public boolean isAlive(){
        return this.currentHealth>0;
    }

    @Override
    public int baseDamage() {
        return CLASS_DAMAGE;
    }
}