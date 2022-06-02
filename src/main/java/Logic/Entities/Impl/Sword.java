package Logic.Entities.Impl;

public class Sword implements IWeapon {
    @Override
    public int getDamageValue() {
        return 10;
    }

    @Override
    public int getCost() {
        return 15;
    }

    @Override
    public String getName() {
        return "Sword";
    }
}
