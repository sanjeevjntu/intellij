package threads;

import java.util.concurrent.TimeUnit;

/**
 * Created by keerti sanjeev on 14/8/2017.
 */
public class FifthWay {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Sanjeev : " + i);

                try {
                    TimeUnit.MICROSECONDS.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}

