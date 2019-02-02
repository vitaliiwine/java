package streams;

/*
В средневековом городе живёт король, 10 дворян, 25 рыцарей и 100 обычных крестьян. В
город пришла чума. Каждый день все жители этого города теряют часть своего здоровья.
Определить сколько и каких жителей останется в городе после 5 дней чумы.
Нужно:
Создать 4 класса - король, дворяне, рыцари, крестьяне.
Чем выше сословие, тем более здоровый человек.
Добавить их в ArrayList.
“Каждый день” у жителей отнимается случайное количество здоровья.
Имена рыцарей, воинов, магов, королей и проч. брать из файлов и выдавать каждому из них
случайным образом.
*/

import collections.Generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class task4 {
    public static void main(String[] args) throws IOException{
        Random random = new Random();
        King king = new King();
        System.out.println("Before the spanish flu" + "\n" + king);

        for (int i = 0; i < 5; i++) {
            if (king.isAlive()){
                king.loseHp(random.nextInt(55) + 5);
            } if (!king.isAlive()){
                king.isDead();
            }
        }

        if (king.isAlive()) {
            System.out.println();
            System.out.println(king);
            System.out.println();
        }

        ArrayList<Creature> kingdom = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            kingdom.add(new Noble());
        }



        for (int i = 0; i < 5; i++) {
            for (Creature creature : kingdom) {
                if (creature.isAlive()){
                    creature.loseHp(random.nextInt(55) + 10);
                } if (!creature.isAlive()){
                    creature.isDead();
                }
            }
        }

        for (Creature creature : kingdom) {
            if (creature.isAlive())
                System.out.println(creature.toString());
        }

    }
}

abstract class Creature {
    private String name;
    private int hp;

    public Creature(String name) {
        this.name = name;
        this.hp = setHp();
    }

    public abstract int setHp();

    public void loseHp(int hp) {
        this.hp -= hp;
    }

    public boolean isAlive() {
        if (hp > 0)
            return true;
        else
            return false;
    }

    public abstract void isDead();

    @Override
    public String toString() {
        return "Unit: " + getClass().getSimpleName() + "\n" +
                "Name: " + name + "\n" + "Health: " + hp;
    }
}

class King extends Creature {
    public King() throws IOException {
        super(Generator.getFileNames());
        setHp();
    }

    @Override
    public int setHp() {
        int hp = 300;
        return hp;
    }

    @Override
    public void isDead() {
        System.out.println("The king can not die like this!");
    }
}

class Noble extends Creature{
    public Noble() throws IOException {
        super(Generator.getFileNames());
    }

    @Override
    public int setHp() {
        int hp = 200;
        return hp;
    }

    @Override
    public void isDead() {
        System.out.println("I can pay, I can pay! ");
    }
}


