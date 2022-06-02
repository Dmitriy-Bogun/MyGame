package Logic.Entities.Impl;

public class MediumArmor implements IArmor{
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
    public String getName() {
        return "Medium armor";
    }
}
