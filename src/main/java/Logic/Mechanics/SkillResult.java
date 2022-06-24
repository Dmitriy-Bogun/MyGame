package Logic.Mechanics;

public class SkillResult {
    private int additionalDamage;
    private int changeMainDamage;

    private boolean chanceOfParrying;

    public int getAdditionalDamage() {
        return additionalDamage;
    }

    public int getChangeMainDamage() {
        return changeMainDamage;
    }

    public boolean isChanceOfParrying() {
        return chanceOfParrying;
    }

    public SkillResult(int additionalDamage, int changeMainDamage,boolean chanceOfParrying) {
        this.additionalDamage = additionalDamage;
        this.changeMainDamage = changeMainDamage;
        this.chanceOfParrying = chanceOfParrying;
    }
}
