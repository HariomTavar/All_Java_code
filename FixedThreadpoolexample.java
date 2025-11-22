import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadpoolexample {
    public static void main(String[] args) {

        // Create a thread pool with 5 fixed threads
        ExecutorService pool = Executors.newFixedThreadPool(5);

        // Submit 10 tasks
        for (int i = 1; i <= 10; i++) {
            int taskId = i;  // for printing
            pool.submit(() -> {
                System.out.println("Task " + taskId + " running in " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // Shutdown the pool
        pool.shutdown();
    }
}
