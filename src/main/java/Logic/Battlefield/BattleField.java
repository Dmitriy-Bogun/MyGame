package Logic.Battlefield;

import Logic.Entities.Character.Warrior;

import java.util.Random;

public class BattleField {
    Random random;
    private final Warrior firstWarrior;// по требованию гита(не понятно зачем)
    private final Warrior secondWarrior;// по требованию гита

    public BattleField(Warrior warriorFirst, Warrior warriorSecond ){
        this.firstWarrior = warriorFirst;
        this.secondWarrior = warriorSecond;
        random = new Random();
    }
    public Warrior stardBattle(){
        while (firstWarrior.isAlive() && secondWarrior.isAlive()){
            int r = random.nextInt(101);
            System.out.println(r);
            if(r>50){
                atackFirst();
            }else atackSecond();
        }
        return firstWarrior.isAlive()? firstWarrior : secondWarrior;
    }
    private void atackFirst(){
        secondWarrior.takingDamage(firstWarrior.attack());
    }
    private void atackSecond(){
        firstWarrior.takingDamage(secondWarrior.attack());
    }
}
