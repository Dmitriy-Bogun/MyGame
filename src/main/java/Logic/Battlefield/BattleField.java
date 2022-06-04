package Logic.Battlefield;

import Logic.Entities.Character.Warrior;

import java.util.Random;

public class BattleField {
    Random random;
    private final Warrior firstWarrior;// по требованию гита(не понятно зачем)
    private final Warrior secondWarrior;// по требованию гита

    Thread timer1;
    Thread timer2;


    public BattleField(Warrior warriorFirst, Warrior warriorSecond ){
        this.firstWarrior = warriorFirst;
        this.secondWarrior = warriorSecond;
        random = new Random();
        timer1 = new Thread(new FirstTimer());
        timer2 = new Thread(new FirstTimer());

    }
    public Warrior stardBattle(){

        while (firstWarrior.isAlive() && secondWarrior.isAlive()){
            if(!timer1.isAlive()){
                atackFirst();
                timer1.start();
            }else if (!timer2.isAlive()) {
                atackSecond();
                timer2.start();
            }
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
