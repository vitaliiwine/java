package threads;

import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Main thread has started");
        Thread thread0 = new Thread(new MyThread(), "Mainchild");
        thread0.start();
        System.out.println("Main thread has ended");

    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starts working \n"
                        + "My ID is " + Thread.currentThread().getId());
        Random random = new Random();

        try {
            System.out.println(Thread.currentThread().getName() + " takes a sleep pill...");
            Thread.sleep((random.nextInt(6) + 1) * 1000);
            System.out.println(Thread.currentThread().getName() + " wakes up!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finishes working \n"
                + "My ID is " + Thread.currentThread().getId());

    }
}
