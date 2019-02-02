package revision;

/*
Создайте структуру с именем student, содержащую поля: фамилия и инициалы, номер
группы, успеваемость (массив из пяти элементов). Создать массив из десяти элементов
такого типа. Добавить возможность вывода фамилий и номеров групп студентов c оценкамик
 */

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class task18 {
    public static void main(String[] args) {
        Construct construct = new Construct();
        construct.printStudents();

    }
}

class Student {
    String name;
    String lastname;
    int groupnum;
    int[] study;

    public Student(String name, String lastname, int groupnum, int[] study) {
        this.name = name;
        this.lastname = lastname;
        this.groupnum = groupnum;
        this.study = study;
    }

    public void printStudent(){
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Lastname: " + lastname);
        System.out.println("Group number: " + groupnum);
        System.out.println("Marks: " + Arrays.toString(study));
        System.out.println();
    }
}

class Construct {
    Student[] students;

    Construct(){
        Generator generator = new Generator();
        Random random = new Random();
        students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(
                    generator.generateName(),
                    generator.generateLastname(),
                    generator.generateGroup(),
                    generator.generateMarks()
            );
        }
    }

    public void printStudents(){
        for (int i = 0; i < students.length; i++) {
            students[i].printStudent();
            System.out.println("********************");
        }
    }
}

class Generator{
    String[] names = {"Michael", "Bob", "Jeffrey", "George", "Ben", "Bill", "Kate",
    "Samuel", "Vicky", "Jennifer", "Stacy", "Michelle", "Rachel", "Marie"};
    String[] lastnames = {"Dawson", "Sierra", "Black", "White", "Smith", "Lee",
    "Brown", "Hoffman", "Wolfson", "McGregor", "Stray", "Stone", "Small"};

    public String generateName(){
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    public String generateLastname(){
        Random random = new Random();
        return lastnames[random.nextInt(lastnames.length)];
    }

    public int generateGroup(){
        Random random = new Random();
        return random.nextInt(4) + 2;
    }

    public int[] generateMarks(){
        int[] tmp = new int[5];
        Random random = new Random();
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = random.nextInt(3) + 2;
        }

        return tmp;

    }
}
