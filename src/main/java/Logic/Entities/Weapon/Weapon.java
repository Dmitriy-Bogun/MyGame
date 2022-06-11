package Logic.Entities.Weapon;

public class Weapon implements IWeapon {

    private int damage;
    private int dexterity;
    private int cost;
    private String name;
    private WeaponType weaponType;

    public Weapon(int damage, int dexterity, int cost, String name, WeaponType weaponType) {
        this.damage = damage;
        this.dexterity = dexterity;
        this.cost = cost;
        this.name = name;
        this.weaponType = weaponType;
    }

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

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }
}
