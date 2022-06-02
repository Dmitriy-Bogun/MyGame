package Logic.Entities;

public abstract class WarriorDecorator extends Warrior{

    protected IWeapon weapon;
    protected Warrior warrior;

    protected Skill skill;

    public WarriorDecorator(IWeapon weapon, Warrior warrior, Skill skill) {
        this.weapon = weapon;
        this.warrior = warrior;
        this.skill = skill;
    }
    public abstract void useSkill();
}
