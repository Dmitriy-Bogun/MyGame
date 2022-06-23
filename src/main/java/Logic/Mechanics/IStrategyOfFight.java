package Logic.Mechanics;

import Logic.Entities.Character.WarriorDecorator;

public interface IStrategyOfFight {
    Damage dealingDamage(WarriorDecorator warrior);
    Damage takingDamage(Damage damage, WarriorDecorator warrior);
}
