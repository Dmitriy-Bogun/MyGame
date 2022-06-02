package Logic.Entities;

public abstract class Warrior {
    public abstract int attack();
    public abstract int dexterity();
    public abstract int strength();
    public abstract int maxHealth();
    public abstract int currentHealth();
    public abstract int protection();
    public abstract double chanceOfCriticalDamage();
    public abstract double chanceOfParrying();
    public abstract void takingDamage(int damage);
    public boolean isAlive(){
        return maxHealth()<=0;
    }
}

