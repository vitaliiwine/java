package threads;

import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Main thread has started");
        Random random = new Random();
        Thread[] threads1 = new Thread[10];

        for (int i = 0; i < threads1.length; i++) {
            threads1[i] = new Thread(new Thread1(), "Worker " + i);
            threads1[i].start();
            try {
                Thread.sleep((random.nextInt(5) + 1) * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Main thread has ended");

    }
}

class Thread1 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starts working \n"
        + "My ID is " + Thread.currentThread().getId());
        Random random = new Random();
        System.out.println(Thread.currentThread().getName() + " goes to the mine!");
        try {
            Thread.sleep((random.nextInt(5) + 1) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " comes back!");
        System.out.println(Thread.currentThread().getName() + " ends up working \n"
        + "My ID is " + Thread.currentThread().getId());
    }
}
