package threads;

public class task8 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyThread(), "t1");
        Thread t2 = new Thread(new MyThread(), "t2");
        Thread t3 = new Thread(new MyThread(), "t3");

        t1.start();
        try {
            t1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
        try {
        t1.join();
        t2.join();
        t3.join(); }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
