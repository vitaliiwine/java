package classes;
//Создайте структуру с именем student, содержащую поля: фамилия и инициалы, номер
//группы, успеваемость (массив из пяти элементов). Создать массив из десяти элементов
//такого типа, упорядочить записи по возрастанию среднего балла. Добавить возможность
//вывода фамилий и номеров групп студентов, имеющих оценки, равные только 4 или 5

import java.util.Arrays;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        Generator generator = new Generator();
        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(generator.generateName(),
                    generator.generateLastName(),
                    generator.generateGroup(),
                    generator.generateMarks()
            );
        }

        for (int i = 0; i < students.length; i++) {
            students[i].printStudent();

        }
    }
}

class Generator {
    String[] names = {"John", "Carl", "Dan", "Michael", "Jeffrey", "Connor"};
    String[] lastNames = {"McDonald", "McGregor", "Whiteman", "Brown", "Broke"};

    public String generateName() {
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    public String generateLastName() {
        Random random = new Random();
        String res = "";
        res += lastNames[random.nextInt(lastNames.length)];
        return res;
    }

    public int generateGroup() {
        Random random = new Random();
        int res = random.nextInt(5 + 1);
        return res;
    }

    public int[] generateMarks() {
        int[] tmp = new int[5];
        Random random = new Random();
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = random.nextInt(3) + 2;
        }
        return tmp;
    }
}

class Student {
    String name;
    String lastname;
    int groupnumber;
    int[] study;

    public Student(String name, String lastname, int groupnumber, int[] study) {
        this.name = name;
        this.lastname = lastname;
        this.groupnumber = groupnumber;
        this.study = study;
    }

    public double getAverage() {
        double res = 0;
        for (int i = 0; i < study.length; i++) {
            res += study[i];
        }
        res = res / study.length;
        return res;
    }

    public void printStudent() {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Last name: " + lastname);
        System.out.println("Group number: " + groupnumber);
        System.out.println("Marks: " + Arrays.toString(study));
        System.out.println("Average of marks: " + getAverage());
    }
}


