package threads;

/*
Есть несколько философов, допустим, пять, но одновременно за столом могут сидеть
не более двух. И надо, чтобы все философы пообедали, но при этом не возникло
взаимоблокировки философами друг друга в борьбе за тарелку и вилку
 */

import java.util.concurrent.Semaphore;

public class task12 {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2, true);
        Dish dish = new Dish();
        Thread thread1 = new Thread(new Table(dish, sem, "Aristotel"));
        thread1.start();
        Thread thread2 = new Thread(new Table(dish, sem, "Socrat"));
        thread2.start();
        Thread thread3 = new Thread(new Table(dish, sem, "Evklid"));
        thread3.start();
        Thread thread4 = new Thread(new Table(dish, sem, "Platon"));
        thread4.start();


    }
}

class Table implements Runnable{
    Dish dish;
    Semaphore sem;
    String name;

    Table(Dish dish, Semaphore sem, String name){
        this.dish = dish;
        this.sem = sem;
        this.name = name; }

    @Override
    public void run() {
        try {
            System.out.println(name + " wants to sit at the table");
            sem.acquire();
            System.out.println(name + " sits at the table");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace(); }
            System.out.println(name + " frees up the table");
            sem.release(); }
}

class Dish{
    int x = 0;
}
