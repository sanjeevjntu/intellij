package executors;

import executors.common.LoopTask;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by keerti sanjeev on 14/8/2017.
 */
public class UsingFixedThredPool {

    public static void main(String[] args) {
        System.out.println("Main Start of thread");
        ExecutorService executorService = Executors.newFixedThreadPool(3);
//submitting task
        executorService.execute(new LoopTask());
        executorService.execute(new LoopTask());
        executorService.execute(new LoopTask());//progrma will not end
        executorService.execute(new LoopTask());
        executorService.execute(new LoopTask());
        executorService.execute(new LoopTask());
        //we need to shutdown();

        executorService.shutdown();

        //executorService.execute(new LoopTask());//RejectedExceutionException
        //executorService.execute(new LoopTask());

        System.out.println("Main End.....");
    }

}
