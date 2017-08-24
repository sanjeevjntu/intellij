/**
 * Created by keerti sanjeev on 14/8/2017.
 */
public class SynchronisedTest {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread();
        thread.start();

        System.out.println("X");
        synchronized (args) {
            thread.wait(2000);
        }


        System.out.println("Y");


    }
}
