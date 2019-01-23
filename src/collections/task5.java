package collections;

/*
Создать класс воин с полями количество здоровье, количество урона и имя. Написать
компаратор для сравнения этих двух воинов по количеству наносимого урона. Найти самого
слабого и самого сильного рыцаря из списка 10 рыцарей используя treeSet
 */

import java.util.Random;
import java.util.TreeSet;

public class task5 {
    public static void main(String[] args) {

        Random random = new Random();
        TreeSet<Warrior> warriors = new TreeSet<Warrior>();

        for (int i = 0; i < 10; i++) {
            warriors.add(new Warrior());

        }
        for (Warrior warrior : warriors) {
            System.out.println(warrior);

        }
    }
}

class Warrior implements Comparable<Warrior> {
    String name;
    int hp;
    int dmg;
    Random random;

    public Warrior(String name, int hp, int dmg, Random random) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
        this.random = random;
    }

    public Warrior() {
        random = new Random();
        name = Generator.getWarriorNames();
        hp = random.nextInt(50) + 150;
        dmg = random.nextInt(30) + 5;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getHp() { return hp; }

    public void setHp(int hp) { this.hp = hp; }

    public int getDmg() { return dmg; }

    public void setDmg(int dmg) { this.dmg = dmg; }

    @Override
    public int compareTo(Warrior w) {
        return hp - w.hp;
    }

    @Override
    public String toString() {
        return "Warrior's name: " + name + "\n" +
                "Health: " + hp + "\n" +
                "Damage: " + dmg;
    }
}

class Generator {
    static Random random = new Random();
    private static String[] warriorNames = {"warrior0", "warrior1", "warrior2", "warrior3",
            "warrior4", "warrior5", "warrior6", "warrior7",
            "warrior8", "warrior9" };

    public static String getWarriorNames() {
        return warriorNames[random.nextInt(warriorNames.length)];
    }

    public static String[] kingNames = {"Fridrich", "Alonso", "Arthur"};

    public static String getKingNames(){
        return kingNames[random.nextInt(kingNames.length)];
    }

    public static String[] nobleNames = {"Dart", "Shwart", "Greg", "Tom", "John", "Puss", "Calvin", "Frank"};

    public static String getNobleNames(){
        return nobleNames[random.nextInt(nobleNames.length)];
    }

    public static String[] knightNames = {"Brock", "Stan", "Lee", "Chen", "Austin", "Sven", "Gil", "Friez"};

    public static String getKnightNames(){
        return knightNames[random.nextInt(knightNames.length)];
    }

    public static String[] peasantNames = {"Bob", "Trev", "Igua", "Stain", "Bill", "Franc", "Jeff", "Clark"};

    public static String getPeasantNames (){
        return peasantNames[random.nextInt(peasantNames.length)];
    }
}

