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





    }
    //public Warrior startBattle(){

     //   while (firstWarrior.isAlive() && secondWarrior.isAlive()){

     //       if(!thread1.isAlive()){
          //      atackFirst();

       //     }if (!thread2.isAlive()) {
         //       atackSecond();
           // }
        //}
        //return firstWarrior.isAlive()? firstWarrior : secondWarrior;
   // }
    private void atackFirst(){
       // secondWarrior.takingDamage(firstWarrior.attack());

    }
    private void atackSecond(){
        //firstWarrior.takingDamage(secondWarrior.attack());

    }
}
