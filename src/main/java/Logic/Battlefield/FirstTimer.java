package Logic.Battlefield;

import java.util.Random;

public class FirstTimer implements Runnable {
    public FirstTimer(){
        random = new Random();
    }
    Random random;
    @Override
    public void run() {
        int waiting = random.nextInt(3000);
        try {
            Thread.sleep(waiting);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
