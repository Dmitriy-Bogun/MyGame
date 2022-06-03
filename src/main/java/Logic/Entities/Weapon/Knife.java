package Logic.Entities.Weapon;

public class Knife implements IWeapon {
    @Override
    public int getDamageValue() {
        return 3;
    }

    @Override
    public int getCost() {
        return 9;
    }

    @Override
    public String getName() {
        return "Knife";
    }
    @Override
    public int getDexterity() {
        return 5;
    }
}
