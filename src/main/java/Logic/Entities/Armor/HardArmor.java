package Logic.Entities.Armor;

public class HardArmor implements IArmor {
    @Override
    public int getProtection() {
        return 80;
    }

    @Override
    public int getDexterity() {
        return 30;
    }

    @Override
    public int getHealth() {
        return 300;
    }

    @Override
    public int getStrength() {
        return 0;
    }

    @Override
    public String getName() {
        return "Hard armor";
    }
}
