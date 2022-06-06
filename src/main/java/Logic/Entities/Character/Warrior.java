package Logic.Entities.Character;

import Logic.Mechanics.Damage;

public abstract class Warrior {
    public abstract Damage attack();
    public abstract int dexterity();
    public abstract int strength();
    public abstract int maxHealth();
    public abstract int currentHealth();
    public abstract int protection();
    public abstract void takingDamage(Damage damage);
    public abstract boolean isAlive();
}

