package Logic.Entities.Impl;

public class Assasin extends WarriorDecorator {
    private int health;
    private int dexterity;
    private int protection;
    public Assasin(IWeapon weapon, Warrior warrior, Skill skill,int health, int dexterity, int protection) {
        super(weapon, warrior, skill);
        this.health = this.getHealth();
        this.dexterity = this.getDexterity();
        this.protection = this.getProtection();

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = warrior.health + 100;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = warrior.dexterity + 60 ;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = warrior.protection + 20;
    }

    @Override
    public void useSkill() {
        System.out.println(skill.getName());
        skill.useSkill(this);
           // return attack() * skill.getSkillDamage(weapon);

    }

    @Override
    public int attack() {
        return warrior.attack() + weapon.getDamageValue();
    }
}