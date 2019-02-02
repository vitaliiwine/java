package threads;

import java.util.Random;

public class task7 {
    public static void main(String[] args) {

        System.out.println("Main thread has started.");
        Mine mine = new Mine();
        Thread worker1 = new Thread(new Worker("Greg", mine));
        Thread worker2 = new Thread(new Worker("Grog", mine));
        Thread worker3 = new Thread(new Worker("Grut", mine));
        Thread worker4 = new Thread(new Worker("Grogant", mine));
        Thread worker5 = new Thread(new Worker("Oleh", mine));
        worker1.start();
        worker2.start();
        worker3.start();
        worker4.start();
        worker5.start();
        System.out.println("Main thread has ended.");


    }
}

class Mine {
    private int gold;

    Mine() {
        gold = 100;
    }

    synchronized int getGold(int goldToTake) {
        if (this.gold > goldToTake) {
            this.gold -= goldToTake;
            System.out.println("Mine: -" + goldToTake);
            return goldToTake;
        } else if (this.gold < goldToTake && this.gold > 0) {
            int tmp = this.gold;
            this.gold = 0;
            return tmp;
        } else return 0;
    }

    public boolean goldAvailable() {
        if (gold > 0)
            return true;
        else return false;
    }

}

class Worker implements Runnable {
    private String name;
    private int gold;
    private Mine mine;

    public Worker(String name, Mine mine) {
        this.name = name;
        this.gold = 0;
        this.mine = mine;
    }

    @Override
    public void run() {
        Random random = new Random();
        System.out.println(name + ": Ready to work!");
        while (mine.goldAvailable()) {
            System.out.println(name + ": Going to the mine!");
            gold += mine.getGold(random.nextInt(11) + 1);
            if (!name.equals("Oleh")) {
                try {
                    Thread.sleep((random.nextInt(11) + 1) * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(name + ": Oh yeah, I've got " + gold + " coins in my bag");
        }
        System.out.println(name + ": The mine is empty! Fuck!");

    }
}
