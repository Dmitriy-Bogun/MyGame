package Logic.Entities.Impl;

public class Recruit extends Warrior{
    private int health = 300;
    private int dexterity = 15;
    private int protection = 10;

    public Recruit(int health, int dexterity, int protection) {
        this.health = health;
        this.dexterity = dexterity;
        this.protection = protection;
    }

    @Override
    public int attack() {
        return 2;
    }

    public int getHealth() {
        return health;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getProtection() {
        return protection;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }
}
