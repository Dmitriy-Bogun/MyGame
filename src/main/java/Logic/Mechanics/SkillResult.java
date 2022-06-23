package Logic.Mechanics;

public class SkillResult {
    private int additionalDamage;
    private int changeMainDamage;

    public int getAdditionalDamage() {
        return additionalDamage;
    }

    public int getChangeMainDamage() {
        return changeMainDamage;
    }

    public SkillResult(int additionalDamage, int changeMainDamage) {
        this.additionalDamage = additionalDamage;
        this.changeMainDamage = changeMainDamage;
    }
}
