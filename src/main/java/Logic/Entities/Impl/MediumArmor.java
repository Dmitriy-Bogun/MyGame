package Logic.Entities.Impl;

import Logic.Entities.IArmor;

public class MediumArmor implements IArmor {
    @Override
    public int getProtection() {
        return 50;
    }

    @Override
    public int getDexterity() {
        return 50;
    }

    @Override
    public int getHealth() {
        return 200;
    }

    @Override
    public int getStrength() {
        return 0;
    }

    @Override
    public String getName() {
        return "Medium armor";
    }
}
