package threads;

/*
На ваш лагерь планируется нападение, через несколько дней. Нужно готовиться к обороне и
строить оборонительные сооружения! Для этого потребуются запасы леса. Пришло время
отправлять их в лес. Но одновременно в лес может зайти не больше 3 рабочих, иначе их
заметят. Получится ли защитить лагерь?

Нужно создать класс “Лес”, в который могут войти лишь трое рабочих, класс “Лагерь”, в
котором будут складывать дерево и класс "Рабочий", который будет заходить в лес и нести
оттуда дерево в лагерь. Соответственно, когда рабочий заходит в лес он “засыпает” на
случайное значение времени и потом возвращается в лагерь с определенным количеством
дерева(каждый раз оно может быть разным).

Каждый рабочий может сходить в лес только 5 раз, на большее у него не хватит сил. В конце,
нужно проверить хватит ли дерева на постройку оборонительных сооружений и понять,
переживет ли ваш лагерь нападение.
*/

import java.util.Random;
import java.util.concurrent.Semaphore;

public class task13 {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(3, true);
        Forest forest = new Forest();
        Camp camp = new Camp();
        Thread lumberjack1 = new Thread(new Lumberjack("Gilbert", forest, camp, sem));
        Thread lumberjack2 = new Thread(new Lumberjack("Grogant", forest, camp, sem));
        Thread lumberjack3 = new Thread(new Lumberjack("Gregor", forest, camp, sem));
        Thread lumberjack4 = new Thread(new Lumberjack("Govard", forest, camp, sem));
        Thread lumberjack5 = new Thread(new Lumberjack("Grivin", forest, camp, sem));
        lumberjack1.start();
        lumberjack2.start();
        lumberjack3.start();
        lumberjack4.start();
        lumberjack5.start();

    }
}

class Forest {
    private int wood;

    Forest() {
        wood = 5000;
    }

    public synchronized boolean woodAvailable() {
        if (this.wood > 0) {
            return true;
        } else return false;
    }

    public synchronized int getWoodFromForest(int x) {
        if (x < this.wood){
            this.wood -= x;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } return x;
        } else {
            int tmp = this.wood;
            this.wood = 0;
            return tmp;
        }
    }
}

class Camp{
    private int space;

    Camp(){
        this.space = 350;
    }

    public int getSpace() {
        return space;
    }

    public synchronized boolean spaceAvailable(){
        if (this.space > 0) {
            return true;
        } else return false;
    }

    public synchronized int putWoodToCamp(int x){
        if (this.space > x){
            this.space -= x;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } return x;
        } else {
            int tmp = this.space;
            this.space = 0;
            return tmp;
        }
    }
}


class Lumberjack implements Runnable{
    private String name;
    private int stamina;
    private int wood;
    private Forest forest;
    private Camp camp;
    private Semaphore sem;

    Lumberjack(String name, Forest forest, Camp camp, Semaphore sem){
        this.name = name;
        this.stamina = 25;
        this.wood = 0;
        this.forest = forest;
        this.camp = camp;
        this.sem = sem;
    }


    @Override
    public synchronized void run() {
        Random random = new Random();
        System.out.println(name + ": Ready to go!");
        while (forest.woodAvailable() && camp.spaceAvailable() && stamina > 0){
            System.out.println(name + ": Going to the forest");
            try {
                sem.acquire();
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            wood += forest.getWoodFromForest(random.nextInt(19) + 1);
                System.out.println(name + ": I've got " + wood + " wood in my bag\n"
                        + "I'm coming back!");
                wood -= camp.putWoodToCamp(random.nextInt(19) + 1);
                stamina = stamina - 5;
                System.out.println(name + ": I have finished! My stamina: " +
                        stamina + "\nSpace in store: " + camp.getSpace());
                sem.release();

        }   System.out.println(name + ": I am too tired, can't work. My stamina: "
                + stamina);
        if (camp.getSpace() <= 70){
            System.out.println("Oh yeah, we did it!!!");
        } else System.out.println("Fuck it, we're lost!!!...");
    }
}
