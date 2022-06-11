package Logic.Entities.Armor;

public class Armor implements IArmor {

    private String name;
    private int dexterity;
    private int health;
    private int protection;
    private int strength;
    private ArmorType armorType;

    public Armor(String name, int dexterity, int health, int protection, int strength, ArmorType armorType) {
        this.name = name;
        this.dexterity = dexterity;
        this.health = health;
        this. protection= protection;
        this.strength = strength;
        this.armorType = armorType;

    }

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

    @Override
    public ArmorType getArmorType() {   
        return armorType;
    }
}
