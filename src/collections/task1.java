package collections;

import java.util.HashSet;
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();

        System.out.println(hashSet.add(1));
        System.out.println(hashSet.add(2));
        System.out.println(hashSet.add(3));
        System.out.println(hashSet.add(4));
        System.out.println("Size = " + hashSet.size());
        for (Integer t : hashSet) {
            System.out.println(t);
        }
        hashSet.remove(3);
        System.out.println("Size = " + hashSet.size());
        for (Integer t : hashSet) {
            System.out.println(t);
        }

        LinkedList<String> countries = new LinkedList<String>();
        countries.add("Germany");
        countries.add("France");
        countries.addLast("Great Britain");
        countries.addFirst("Spain");
        countries.add(1, "Italy");

        System.out.printf("List has %d elements", countries.size());
        System.out.println("\n" + countries.get(1));
        countries.set(1, "Israel");

        for (String country : countries) {
            System.out.println(country);
        }

        if (countries.contains("Italy")) {
            System.out.println("List contains Italy");
        }

        countries.remove("Germany");
        countries.removeFirst();
        countries.removeLast();

        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Greg"));
        people.remove(1);
        for (Person p : people) {
            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        System.out.println(first.getName());

    }


}

class Person {
    private String name;

    public Person(String value) {
        name = value;
    }

    String getName() {
        return name;
    }
}