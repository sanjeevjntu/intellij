package executors;

import executors.common.CallableLoopTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by keerti sanjeev on 14/8/2017.
 */
public class UsingCachedThreadPoolCallable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();


        Future<Integer> future = executorService.submit(new CallableLoopTask());

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
