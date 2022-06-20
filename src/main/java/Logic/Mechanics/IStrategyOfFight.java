package Logic.Mechanics;

public interface IStrategyOfFight {
    Damage dealingDamage();
    Damage takingDamage(Damage damage);
}
