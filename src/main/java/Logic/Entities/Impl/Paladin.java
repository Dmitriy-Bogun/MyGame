package Logic.Entities.Impl;

public class Paladin extends WarriorDecorator{
    private int health;
    private int dexterity;
    private int protection;

    public Paladin(IWeapon weapon, Warrior warrior,Skill skill) {
        super(weapon, warrior,skill);
    }

    @Override
    public void useSkill() {
      //  return 0;
    }

    @Override
    public int attack() {
        return warrior.attack() + weapon.getDamageValue();
    }
}
