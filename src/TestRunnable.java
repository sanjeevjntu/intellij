/**
 * Created by keerti sanjeev on 14/8/2017.
 */
public class TestRunnable {

    public static void main(String[] args) throws InterruptedException {
        AccountThread at = new AccountThread();
        Thread t1 = new Thread(at); // new state
        Thread t2 = new Thread(at);
        Thread t3 = new Thread(at);
        t1.setName("AAAA");
        t2.setName("BBBB");
        t3.setName("CCC");
        t1.start(); //Runnable state
        //t1.sleep(3000);


        t2.start();
        t2.join(); //yeild(), sleep(), join()--ysj.
        t3.start();
    }
}

class AccountThread implements Runnable {

    @Override
    public void run() {//Running state
        for (int i = 0; i < 100; i++) {
            System.out.println("Sanjeev" + i + "Run by Thread:" + Thread.currentThread().getName());


        }
    }
    //dead state
}
