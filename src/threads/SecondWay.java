package threads;

import java.util.concurrent.TimeUnit;

public class SecondWay {
    public static void main(String[] args) {

        SecondTask s2 = new SecondTask();
        Thread t = new Thread(s2);
        t.start();

    }
}

class SecondTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Sanjeev : " + i);

            try {
                TimeUnit.MICROSECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}