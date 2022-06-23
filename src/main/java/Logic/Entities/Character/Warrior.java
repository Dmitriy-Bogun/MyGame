package Logic.Entities.Character;

import Logic.Mechanics.Damage;

public abstract class Warrior {
    public abstract int dexterity();
    public abstract int strength();
    public abstract int maxHealth();
    public abstract int currentHealth();
    public abstract int protection();
    public abstract boolean isAlive();
    public abstract int baseDamage();
    public abstract Damage takingDamage(Damage damage);
    public abstract Damage dealingDamage();
}

