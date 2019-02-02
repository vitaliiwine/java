package collections;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task8 {
    public static void main(String[] args) throws IOException {
        ArrayList<Unit> unit = new ArrayList<Unit>();
        Army army = new Army();
        army.createArmy(unit);
        Collections.sort(unit);
        for (Unit u : unit) {
            System.out.println(u.toString() + "\n");

        }
    }


}

abstract class Unit implements Comparable<Unit> {
    String name;
    String type;
    int hp;
    int mp;
    int dmg;
    int armor;

    public Unit(String name, String type, int hp, int mp, int dmg, int armor) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.mp = mp;
        this.dmg = dmg;
        this.armor = armor;
    }

    @Override
    public int compareTo(Unit u) {
        if (hp + mp + dmg + armor > u.hp + u.mp + u.dmg + u.armor) {
            return 0;
        } else return 1;
    }

    @Override
    public String toString() {
        return "Unit's type: " + type + "\n" +
                "Name: " + name + "\n" +
                "Healthpoints: " + hp + "\n" +
                "Manapoints: " + mp + "\n" +
                "Damage: " + dmg + "\n" +
                "Armor: " + armor;
    }

    public interface Comparator<Unit> {
        default int compare(Unit a, Unit b) {
            return 0;
        }
    }
}

class Swordman extends Unit {
    public Swordman(String name, String type, int hp, int mp, int dmg, int armor) {
        super(name, type, hp, mp, dmg, armor);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Unit u) {
        return super.compareTo(u);
    }
}

class Archer extends Unit {
    public Archer(String name, String type, int hp, int mp, int dmg, int armor) {
        super(name, type, hp, mp, dmg, armor);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Unit u) {
        return super.compareTo(u);
    }
}

class Druid extends Unit {
    public Druid(String name, String type, int hp, int mp, int dmg, int armor) {
        super(name, type, hp, mp, dmg, armor);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Unit u) {
        return super.compareTo(u);
    }
}

class Army {
    private Random random = new Random();
    private int armySize = 10;

    void createArmy(ArrayList arrayList) throws IOException {
        int switcher;
        for (int i = 0; i < armySize; i++) {
            switcher = random.nextInt(3) + 1;
                switch (switcher) {
                case 1:
                    arrayList.add(new Swordman(Generator.getFileNames(),
                            "Swordman", 450, 225, 25, 5));
                    break;
                case 2:
                    arrayList.add(new Archer(Generator.getFileNames(),
                            "Archer", 290, 145, 19, 3));
                    break;
                case 3:
                    arrayList.add(new Druid(Generator.getFileNames(),
                            "Druid", 335, 450, 36, 2));
                    break;
            }
        }
    }
}