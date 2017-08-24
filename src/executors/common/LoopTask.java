package executors.common;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by keerti sanjeev on 14/8/2017.
 */
public class LoopTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Sanjeev" + i + "Thread id: " + Thread.currentThread().getName());

            try {
                TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("End of the Thread for the Task Sanjeev...." + Thread.currentThread().getName());
    }
}
