package Logic.Battlefield;

import java.util.Random;

public class FirstTimer implements Runnable {
    public FirstTimer(){
        random = new Random();
    }
    Random random;
    @Override
    public synchronized void run() {
        int waiting = random.nextInt(200);
        System.out.println(waiting);
        try {
            Thread.sleep(waiting);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
