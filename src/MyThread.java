/**
 * Created by keerti sanjeev on 14/8/2017.
 */
public class MyThread extends Thread {

    public static void main(String[] args) {
        MyThread m = new MyThread();
        Thread t = new Thread(m);
        t.start();
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Sanjeev" + i);
        }
    }

}
