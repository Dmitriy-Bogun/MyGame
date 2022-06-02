package Logic.Entities;

public abstract class Skill {
    private String name;

    public String getName() {
        return name;
    }

    public Skill(String name) {
        this.name = name;
    }

    public abstract void useSkill(WarriorDecorator warriorDecorator);
}
