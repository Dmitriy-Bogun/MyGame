package Logic.Entities;

public abstract class WarriorDecorator extends Warrior{

    public IWeapon weapon;
    protected IArmor armor;
    protected Warrior warrior;
    protected Skill skill;

    public WarriorDecorator(IWeapon weapon,IArmor armor, Warrior warrior, Skill skill) {
        this.weapon = weapon;
        this.armor = armor;
        this.warrior = warrior;
        this.skill = skill;
    }
    public abstract void useSkill();
}
