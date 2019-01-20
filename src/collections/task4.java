package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class task4 {
    public static void main(String[] args) {

        Comparator<Human> hcomparator = new HumanNameComparator().thenComparing(new HumanAgeComparator());
        TreeSet<Human> humans = new TreeSet(hcomparator);
        humans.add(new Human("Bob", 34));
        humans.add(new Human("Nick", 23));
        humans.add(new Human("Jeff", 19));
        for (Human h: humans) {
            System.out.println("Name: " + h.getName() + "\n" +
                                "Age: " + h.getAge());
        }
    }
}

class Human implements Comparable<Human> {

    private String name;
    private int age;

    public Human(String s, int i) {
        name = s;
        age = i;
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    @Override
    public int compareTo(Human h) {
        return name.compareTo(h.getName());
    }
}

class HumanNameComparator implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        return h1.getName().compareTo(h2.getName());
    }
}

class HumanAgeComparator implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        if (h1.getAge() > h2.getAge())
            return 1;
        else if (h1.getAge() < h2.getAge())
            return -1;
        else
            return 0;
    }
}
