package executors;

import executors.common.LoopTask;
import executors.common.LoopTaskB;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by keerti sanjeev on 14/8/2017.
 */
public class UsingCachedThreadPool {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new LoopTaskB());
        executorService.execute(new LoopTaskB());
        executorService.execute(new LoopTaskB());
        executorService.execute(new LoopTaskB());
        executorService.execute(new LoopTask());
        executorService.execute(new LoopTask());
        executorService.execute(new LoopTask());
        executorService.execute(new LoopTask());


        executorService.shutdown();

    }
}
