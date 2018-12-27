package lesson13;
//Создать три класса (орк, эльф, человек) у каждого из них есть три поля:
// здоровье, урон и броня. Для каждого из них переопределить функцию toString() и hashCode(),
// которая будет считать хеш код на основе здоровья, брони и урона. Создать две дженерик
// функции: одна из которых будет печатать массив любого типа данных, другая будет
// считать среднее значение хеш функций вcего массива и печатать его на экран

import java.util.Objects;

public class task2 {
    public static void main(String[] args) {
        Orcs[] orcs = new Orcs[5];
        for (int i = 0; i < orcs.length; i++) {
            orcs[i] = new Orcs(300, 150, 4);
        }
        System.out.println("132".hashCode());
        print(orcs);
        System.out.println("One orc's hashcode: " + orcs[0].hashCode());
        System.out.println("All of the orcs' hashcodes: " + averageHashCode(orcs));


    }

    public static <T> int averageHashCode(T[] data){
        int avrg = 0;
        for (int i = 0; i < data.length; i++) {
            avrg += data[i].hashCode();
        }
        avrg = avrg / data.length;
        return avrg;
    }

    public static <T> void print(T[] data){
        for (int i = 0; i <data.length ; i++) {
            System.out.println(data[i].toString());
        }

    }
}

class Orcs {
    int health;
    int damage;
    int armor;

    public Orcs(int health, int damage, int armor) {
        this.health = health;
        this.damage = damage;
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Orcs{" +
                "health=" + health +
                ", damage=" + damage +
                ", armor=" + armor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orcs)) return false;
        Orcs orcs = (Orcs) o;
        return health == orcs.health &&
                damage == orcs.damage &&
                armor == orcs.armor;
    }

    @Override
    public int hashCode() {
        return (health + damage + armor) / 3;
    }
}


class Elves{
    int health;
    int damage;
    int armor;

    public Elves(int health, int damage, int armor) {
        this.health = health;
        this.damage = damage;
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Elves{" +
                "health=" + health +
                ", damage=" + damage +
                ", armor=" + armor +
                '}';

    }
}

