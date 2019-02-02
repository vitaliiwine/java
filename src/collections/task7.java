package collections;

/*
В средневековом городе живёт король, 10 дворян, 25 рыцарей и 100 обычных крестьян. В
город пришла чума. Каждый день все жители этого города теряют часть своего здоровья.
Определить сколько и каких жителей останется в городе после 5 дней чумы.
Нужно:
Создать 4 класса - король, дворяне, рыцари, крестьяне.
Чем выше сословие, тем более здоровый человек.
Добавить их в ArrayList.
“Каждый день” у жителей отнимается случайное количество здоровья.
*/

import java.util.ArrayList;
import java.util.Random;


public class task7 {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("Before the flu");
        System.out.println();

        King king = new King();
        System.out.println(king);

        for (int i = 0; i < 5; i++) {
            if (king.isAlive()) {
                king.loseHealth(random.nextInt(50) + 5);
                if (!king.isAlive()) {
                    king.isDead();
                }
            }
        }

        ArrayList<LivingCreature> kingdom = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            kingdom.add(new Noble()); }

        for (int i = 0; i < 25; i++) {
            kingdom.add(new Knight()); }

        for (int i = 0; i < 100; i++) {
            kingdom.add(new Peasant()); }

        for (LivingCreature livingCreature : kingdom) {
            System.out.println(livingCreature); }

        for (int i = 0; i < 5; i++) {
            for (LivingCreature livingCreature : kingdom) {
                if (livingCreature.isAlive()) {
                    livingCreature.loseHealth(random.nextInt(20) + 10);
                    if (!livingCreature.isAlive()) {
                        livingCreature.isDead();
                    }
                }
            }
        }

        if (king.isAlive()) {
            System.out.println();
            System.out.println("After the flu");
            System.out.println();
            System.out.println(king);
        }

        for (LivingCreature livingCreature : kingdom) {
            if (livingCreature.isAlive())
                System.out.println(livingCreature.toString());

        }
    }
}


abstract class LivingCreature implements Comparable<LivingCreature> {
    private String name;
    private int hp;

    public LivingCreature(String name) {
        this.name = name;
        this.hp = setHp();
    }

    public abstract int setHp();

    @Override
    public int compareTo(LivingCreature o) {
        return hp - o.hp;
    }

    public void loseHealth(int hp) {
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
                getClass().getSimpleName() + "'s name: " + name + "\n" +
                "Healthpoints: " + hp;
    }
}

class King extends LivingCreature {

    public King() {
        super(Generator.getKingNames());
        setHp();
    }

    @Override
    public int setHp() {
        int hp = 300;
        return hp;
    }

    @Override
    public void isDead() {
        System.out.println("But I am...the king...");
    }
}

class Noble extends LivingCreature {

    public Noble() {
        super(Generator.getNobleNames());
        setHp();
    }

    @Override
    public int setHp() {
        int hp = 150;
        return hp;
    }

    @Override
    public void isDead() {
        System.out.println("I am not a warrior!...");
    }
}

class Knight extends LivingCreature {

    public Knight() {
        super(Generator.getKnightNames());
        setHp();
    }

    @Override
    public int setHp() {
        int hp = 180;
        return hp;
    }

    @Override
    public void isDead() {
        System.out.println("For the king!");
    }
}

class Peasant extends LivingCreature {

    public Peasant() {
        super(Generator.getPeasantNames());
        setHp();
    }

    @Override
    public int setHp() {
        int hp = 80;
        return hp;
    }

    @Override
    public void isDead() {
        System.out.println("Knights! Save us!");
    }
}
