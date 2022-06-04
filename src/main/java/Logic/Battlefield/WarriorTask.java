package Logic.Battlefield;

import Logic.Entities.Character.Warrior;

import java.util.Random;
import java.util.TimerTask;



public class WarriorTask extends TimerTask {
    Random random;
    Warrior firstWarrior;
    Warrior secondWarrior;

    public WarriorTask(Warrior firstWarrior, Warrior secondWarrior) {
        this.firstWarrior = firstWarrior;
        this.secondWarrior = secondWarrior;
        random = new Random();
    }

    @Override
    public void run() {
            try{
                Thread.sleep(random.nextInt((10) + 10));
                if(firstWarrior.isAlive() && secondWarrior.isAlive()){
                    secondWarrior.takingDamage(firstWarrior.attack());

                    System.out.println("jhgfjh");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
}
