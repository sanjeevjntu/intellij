/**
 * Created by keerti sanjeev on 14/8/2017.
 */
public class TestThread {

    public static void main(String[] args) {

/*        Runnable r= new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    System.out.println("Sanjeev "+i);
                }
            }
        };*/

/*       new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i=0;i<100;i++){
                   System.out.println("Sanjeev "+i);
               }
           }
       }).start();*/

        new Thread(() -> System.out.println("Sanjeev")).start();
        new Thread(() -> System.out.println("Hello")).start();
        new Thread(() -> {
            for (int j = 0; j < 10000; j++) {
                System.out.println("Naisha");
            }

        }).start();
        new Thread(() -> {
            for (int j = 0; j < 10000; j++) {
                System.out.println("Sanjeev");
            }

        }).start();


    }
}


