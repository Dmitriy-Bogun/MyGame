package Logic.Entities.Character;

public abstract class Warrior {
    public abstract int attack();
    public abstract int dexterity();
    public abstract int strength();
    public abstract int maxHealth();
    public abstract int currentHealth();
    public abstract int protection();
    public abstract void takingDamage(int damage);
    public abstract boolean isAlive();
}

