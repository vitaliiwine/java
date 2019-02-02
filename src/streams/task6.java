package streams;

import java.io.Serializable;

public class task6 {
    public static void main(String[] args) {



    }
}

class Person implements Serializable {
    private String name;
    private int age;
    private double height;
    private boolean married;

    public Person(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    public double getHeight() { return height; }

    public boolean getMarried() { return married; }

}
