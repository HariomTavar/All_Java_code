import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock();

    void increment() {
        // try to get lock (no waiting)
        if (lock.tryLock()) {
            try {
                count++;  // critical section
            } finally {
                lock.unlock();
            }
        } else {
            // lock not available → skip
            System.out.println(Thread.currentThread().getName() + " skipped (lock busy)");
        }
    }

    int getCount() {
        return count;
    }
}

public class TryLockExample {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + c.getCount());
    }
}
