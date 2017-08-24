package executors.common;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * Created by keerti sanjeev on 14/8/2017.
 */
public class CallableLoopTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("Sanjeev " + Thread.currentThread().getName());

            TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 1000));

        }

        return 1;
    }

}
