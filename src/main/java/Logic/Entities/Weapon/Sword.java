package Logic.Entities.Weapon;

public class Sword implements IWeapon {
    private int ID;
    private int damage;
    private int dexterity;
    private int cost;
    private String name;

    @Override
    public int getDamageValue() {
        return damage;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getDexterity() {
        return dexterity;
    }
}
