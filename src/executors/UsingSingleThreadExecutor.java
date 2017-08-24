package executors;

import executors.common.LoopTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by keerti sanjeev on 14/8/2017.
 */
public class UsingSingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(new LoopTask());
        executorService.execute(new LoopTask());

        executorService.execute(new LoopTask());

        executorService.shutdown();

    }
}
