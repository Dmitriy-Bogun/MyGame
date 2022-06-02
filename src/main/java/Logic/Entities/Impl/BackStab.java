package Logic.Entities.Impl;

public class BackStab extends Skill{


    public BackStab() {
        super("коварный удар");
    }


    @Override
    public void useSkill(WarriorDecorator warriorDecorator) {
        if (warriorDecorator.weapon instanceof Knife) {
            System.out.println(warriorDecorator.attack()*3);
        } else System.out.println("0");

    }
}
