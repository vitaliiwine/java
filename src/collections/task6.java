package collections;

/*
Создать класс персонаж с полями количество здоровья, количество брони, количеством
урона и именем. Провести рыцарский турнир и узнать кто победил используя treeSet, по
критериям количество здоровья, количество брони и наносимый урон.
 */

import java.util.Random;
import java.util.TreeSet;

public class task6 {
    public static void main(String[] args) {
        TreeSet<Character> characters = new TreeSet<Character>();

        for (int i = 0; i < 10; i++) {
            characters.add(new Character());
        }


        for (Character character : characters) {
            System.out.println(character);
        }

        System.out.println("The winner is " + "\n" + characters.last());

    }
}

class Character implements Comparable<Character> {
    String name;
    int hp;
    int dmg;
    int armor;
    Random random;

    public Character(String name, int hp, int dmg, int armor) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
        this.armor = armor;
    }

    public Character() {
        random = new Random();
        name = Builder.getNames();
        hp = Builder.getHealthPoints();
        dmg = Builder.getDamages();
        armor = Builder.getArmors();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public int compareTo(Character c) {
        return (hp + armor - c.dmg) - (c.hp + c.armor - dmg);
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Health: " + hp + "\n" +
                "Damage: " + dmg + "\n" +
                "Armor: " + armor;

    }
}

class Builder {
    static Random random = new Random();
    static String[] names = {"Bane", "Chaos Knight", "Phantom Assassin",
            "Abaddon", "Bristleback", "Alchemist", "Sven",
            "Terrorblade", "Spectre", "Night Stalker"};
//    static int[] healthPoints = {670, 790, 550, 460, 580, 660, 700, 650, 690, 600};
//    static int[] damages = {78, 60, 58, 65, 71, 61, 55, 75, 64, 72};
//    static int[] armors = {3, 4, 2, 5, 1};

    static String getNames() {
        return names[random.nextInt(names.length)];
    }

    static int getHealthPoints() {
        return rnd(550,700);
    }

    static int getDamages() {
        return rnd(40, 70);
    }

    static int getArmors() {
        return rnd(1, 5);
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}


