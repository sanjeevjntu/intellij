package threads;

import java.util.concurrent.TimeUnit;

/**
 * Created by keerti sanjeev on 14/8/2017.
 */
public class FirstWay {

    public static void main(String[] args) {
        System.out.println("Main Thread starts here");
        new FirstTask();
        new FirstTask();
    }
}

class FirstTask extends Thread {
    public FirstTask() {
        this.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("TICK TICK: " + i + " and Thread Id: " + Thread.currentThread().getId());

            try {
                TimeUnit.MICROSECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
