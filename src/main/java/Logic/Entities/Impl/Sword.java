package Logic.Entities.Impl;

import Logic.Entities.IWeapon;

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

    @Override
    public int getDexterity() {
        return 2;
    }
}
