class Counter {
    int count = 0;

    synchronized void increment() {
        count++;  // critical section
    }
}

public class Sychr {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();


                System.out.println(c.count);
        System.out.println(c.count);


        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                c.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int j = 0; j < 2000; j++) {
                c.increment();
            }
        });

        t1.start();
        t1.join();

    t2.start();
    t2.join();
        System.out.println("the thread one count :");
        System.out.println("final Count : "+ c.count);

    }
}
