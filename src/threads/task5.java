package threads;

public class task5 {
    public static void main(String[] args) {
        System.out.println("Main thread has started...");
        Thread2 thread2 = new Thread2();
        new Thread(thread2, "Thread2").start();
        try {
            Thread.sleep(1100);
            thread2.disable();
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread has ended");
    }
}

class Thread2 implements Runnable {

    private boolean isActive;

    void disable(){
        isActive = false;
    }

    Thread2() { isActive = true; }

    @Override
    public void run() {
        System.out.printf("%s started...\n", Thread.currentThread().getName());
        int counter = 1;
        while (isActive){
            System.out.println("Loop " + counter++);
            try {
                Thread.sleep(400); }
                catch (InterruptedException e) {
                    System.out.println("Thread has been interrupted");
            }
        }
        System.out.printf("%s started...\n", Thread.currentThread().getName());
    }
}
