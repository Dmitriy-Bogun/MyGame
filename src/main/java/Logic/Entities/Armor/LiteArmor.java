package Logic.Entities.Armor;

public class LiteArmor implements IArmor {
    @Override
    public int getProtection() {
        return 15;
    }

    @Override
    public int getDexterity() {
        return 40;
    }

    @Override
    public int getHealth() {
        return 100;
    }

    @Override
    public int getStrength() {
        return 3;
    }

    @Override
    public String getName() {
        return "Lite armor";
    }
}
