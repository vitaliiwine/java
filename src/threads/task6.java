package threads;

import java.util.concurrent.Semaphore;

public class task6 {
    public static void main(String[] args) {

    }
}


class CountThread implements Runnable {
    CommonResource res;
    Semaphore sem;
    String name;

    CountThread(CommonResource res, Semaphore sem, String name) {
        this.res = res;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " waits for the boiler access");
            sem.acquire();
            System.out.println(name + " got boiler access!");
            res.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.println(this.name + ": " + res.x);
                res.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println(name + "frees up boiler access");
    }

}

class CommonResource {
    int x = 0;
}
