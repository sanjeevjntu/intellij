package executors.common;

import java.util.concurrent.TimeUnit;

/**
 * Created by keerti sanjeev on 14/8/2017.
 */
public class LoopTaskB implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println("Naisha.." + 1 + "Thread Id: " + Thread.currentThread().getName());
            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("End of the Thread Naisha...." + Thread.currentThread().getName());
    }
}
