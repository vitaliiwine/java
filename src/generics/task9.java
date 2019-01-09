package generics;

import java.util.Random;

public class task9 {
    public static void main(String[] args) {
//        allInOne human1 = new Mage(Generator.getNameMage());
//        allInOne human2 = new Warrior(Generator.getNameWarrior());
//        human1.Say();
//        human2.Say();
//        fight(human1, human2);
        Human[] humans1 = new Human[10];
        Random random = new Random();
        int type1;
        for (int i = 0; i < humans1.length; i++) {
            type1 = random.nextInt(3) + 1;
            if (type1 == 1){ humans1[i] = new Mage(Generator.getNameMage());}
            if (type1 == 2){ humans1[i] = new Bowman(Generator.getNameBowMan());}
            if (type1 == 3){ humans1[i] = new Warrior(Generator.getNameWarrior());}
        }
        print(humans1);

        Human[] humans2 = new Human[10];
        int type2;
        for (int i = 0; i < humans2.length; i++) {
            type2 = random.nextInt(3) + 1;
            if (type2 == 1){ humans2[i] = new Mage(Generator.getNameMage());}
            if (type2 == 2){ humans2[i] = new Bowman(Generator.getNameBowMan());}
            if (type2 == 3){ humans2[i] = new Warrior(Generator.getNameWarrior());}
        }
    }

    public static <T> void print(T[] data){
        System.out.println("\r\n" + data.getClass().getSimpleName()+ ": ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].toString());

        }
    }

    public static void battle(Human[] h1, Human[] h2){
        for (int i = 0; i < h1.length; i++) {
            for (int j = 0; j < h2.length; j++) {
                while (h1[i].hp > 0 && h2[i].hp > 0){
                    h1[i].hp -= (h2[i].dmg - h1[i].armor);
                    h2[i].hp -= (h1[i].dmg - h2[i].armor);
                }
            }
        }
    }

    public static void fight(Human h1, Human h2){
        while (h1.hp > 0 && h2.hp > 0){
            h1.hp -= (h2.dmg - h1.armor);
            h2.hp -= (h1.dmg - h2.armor);
        }
        if (h1.hp > h2.hp){
            System.out.println("Mage wins!");
        }
        if (h1.hp < h2.hp){
            System.out.println("Warrior wins!");
        }
    }
}

abstract class Human{
     String name;
     int hp;
     int dmg;
     int armor;

    public Human(String name, int hp, int dmg, int armor) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
        this.armor = armor;
    }

    abstract public void Say();

    @Override
    public String toString() {
        return
                this.getClass().getSimpleName()+"'s name: " + name + "\n" +
                        "Healthpoints: " + hp + "\n" + "Damage: " + dmg +
                        "\n" + "Armor: " + armor;
    }
}

class Mage extends Human{
    public Mage(String name) {
        super(name, 350, 15, 4);
    }

    String name = Generator.getNameBowMan();

    @Override
    public void Say() {
        System.out.println("Magic is everything!");

    }
}

class Bowman extends Human{
    public Bowman(String name) {
        super(name, 400, 8, 3);
    }

    String name = Generator.getNameBowMan();

    @Override
    public void Say() {
        System.out.println("Draaaaaw! Loooose!");
    }
}

class Warrior extends Human{
    public Warrior(String name) {
        super(name, 600, 6, 8);
    }

    String name = Generator.getNameWarrior();

    @Override
    public void Say() {
        System.out.println("Kill you!");
    }
}

class Generator{
    private static Random random = new Random();
    static String[] nameMage = {"Victor", "Jenya", "Pasha", "Gosha"};
    static String[] nameBowMan = {"Kolya", "Sasha", "Seva"};
    static String[] nameWarrior = {"Kostya", "Valera", "Igor"};

    static String getNameMage(){return nameMage[random.nextInt(nameMage.length)];}
    static String getNameBowMan(){return nameBowMan[random.nextInt(nameBowMan.length)];}
    static String getNameWarrior(){return nameWarrior[random.nextInt(nameWarrior.length)];}

}
