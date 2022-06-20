package Logic.Entities.Character;

import Logic.Entities.Skill.*;
import Logic.Entities.Armor.*;
import Logic.Entities.Weapon.*;
import Logic.Mechanics.IStrategyOfFight;

import java.util.List;

public abstract class WarriorDecorator extends Warrior{

    public IWeapon weapon;
    protected IArmor armor;
    protected Warrior warrior;
    protected Skill skill;
    protected String Name;
    protected IStrategyOfFight strategyOfFight;

    public WarriorDecorator(String Name, IWeapon weapon,IArmor armor, Warrior warrior, Skill skill, IStrategyOfFight strategyOfFight) {
        this.weapon = weapon;
        this.armor = armor;
        this.warrior = warrior;
        this.skill = skill;
        this.Name = Name;
        this.strategyOfFight = strategyOfFight;
    }
    public abstract void useSkill(List skillList );
}
