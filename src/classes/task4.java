package classes;
//Создайте структуру с именем student, содержащую поля: фамилия и инициалы, номер
//группы, успеваемость (массив из пяти элементов). Создать массив из десяти элементов
//такого типа, упорядочить записи по возрастанию среднего балла. Добавить возможность
//вывода фамилий и номеров групп студентов, имеющих оценки, равные только 4 или 5

import java.util.Arrays;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        Construct construct = new Construct();
        construct.sortStudents();
        construct.printStudents();
    }
}

class Generator {
    String[] names = {"John", "Carl", "Dan", "Michael", "Jeffrey", "Connor"};
    String[] lastNames = {"McDonald", "McGregor", "Whiteman", "Brown", "Broke"};
    String[] bookNames = {"Lion Heart", "Graveyard", "Heart Of Steel", "Made By War", "Gone With The Wind"};

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

    public String generateBookName(){
        Random random = new Random();
        return bookNames[random.nextInt(bookNames.length)];
    }

    public int generateYear() {
        Random random = new Random();
        int res = random.nextInt(200) + 1800;
        return res;
    }

    public int generatePages(){
        Random random = new Random();
        int res = random.nextInt(500) + 300;
        return res;
    }

    public int generateGroup() {
        Random random = new Random();
        int res = random.nextInt(2) + 4;
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

class Construct {
    Student[] students;

    Construct() {
        Generator generator = new Generator();
        Random random = new Random();
        students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(
                    generator.generateName(),
                    generator.generateLastName(),
                    generator.generateGroup(),
                    generator.generateMarks()
            );
        }
    }

    public void sortStudents() {
        Student tmp;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].getAverage() > students[j + 1].getAverage()) {
                    tmp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tmp;
                }
            }
        }
    }

    public void printStudents() {
        for (int i = 0; i < students.length; i++) {
            students[i].printStudent();
            System.out.println("___________________________");
        }
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


