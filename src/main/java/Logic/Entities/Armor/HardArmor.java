package Logic.Entities.Armor;

public class HardArmor implements IArmor {
    private int ID;
    private  String name;
    private int dexterity;
    private int health;
    private int protection;
    private int strength;
    @Override
    public int getProtection() {
        return protection;
    }

    @Override
    public int getDexterity() {
        return dexterity;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public String getName() {
        return name;
    }
}