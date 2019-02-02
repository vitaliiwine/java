package threads;

/*
Разведчики обнаружили неподалеку рудник! Ты должен, как можно скорее,
добыть оттуда всё золото! Держи пять рабочих и вперёд!
Нужно создать класс “Рабочий”, который будет являться потоком. Помимо этого нужны
два класса “Шахта” и “Замок”, которые будут являться “общественным” ресурсом для
рабочих. Рабочий будет заходить в шахту, “засыпать” на случайное время, выходить,
заходить в замок, “засыпать” на случайное время. В шахту и замок заходить можно только
по одному рабочему.
 */

import java.util.Random;

public class task7 {
    public static void main(String[] args) {

        System.out.println("Main thread has started.");
        Mine mine = new Mine();
        Castle castle = new Castle();
        Thread worker1 = new Thread(new Worker("Greg", mine, castle));
        Thread worker2 = new Thread(new Worker("Grog", mine, castle));
        Thread worker3 = new Thread(new Worker("Grut", mine, castle));
        Thread worker4 = new Thread(new Worker("Grogant", mine, castle));
        Thread worker5 = new Thread(new Worker("Oleh", mine, castle));
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

    public int getGold() {
        return gold;
    }

    public synchronized boolean goldAvailable() {
        if (this.gold > 0) {
            return true;
        } else
            return false;
    }

    public synchronized int getGoldFromMine(int x) {
        if (x < this.gold) {
            this.gold -= x;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return x;
        } else {
            int tmp = this.gold;
            this.gold = 0;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return tmp;
        }
    }
}

class Castle {
    private int space;

    Castle() {
        space = 100;
    }

    public int getSpace() {
        return space;
    }

    public synchronized boolean spaceAvailable() {
        if (this.space > 0) {
            return true;
        } else
            return false;
    }

    public synchronized int putGoldToStore(int x) {
        if (x < this.space){
            this.space -= x;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } return x;
        } else {
            int tmp = this.space;
            this.space = 0;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } return tmp;
        }
    }
}


class Worker implements Runnable {
    private String name;
    private int gold;
    private Mine mine;
    private Castle castle;


    public Worker(String name, Mine mine, Castle castle) {
        this.name = name;
        this.gold = 0;
        this.mine = mine;
        this.castle = castle;
    }

    @Override
    public void run() {
        Random random = new Random();
        System.out.println(name + ": Ready to work!");
        while (mine.goldAvailable() && castle.spaceAvailable()) {
            System.out.println(name + ": Going to the mine!");
            if ((gold += mine.getGoldFromMine(10)) != 0){

            System.out.println(name + ": Oh yeah, I've got " + gold + " coins in my bag!\n"
                    + "Now I'm taking this gold to the Castle's storehouse!");
            gold -= castle.putGoldToStore(10);
                System.out.println("I have put gold to the storehouse!");
            }
        }
        System.out.println(name + ": The mine is empty! Fuck!");
        System.out.println(name + ": Storage is full! Fuck!");
    }
}

