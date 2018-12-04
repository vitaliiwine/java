package classes1;
//Создать класс “Human” с двумя строковыми переменными для имени и фамилии, вещественной
//переменной для возраста и логической переменной для пола. Добавить в класс конструкторы с
//параметрами и без них.

public class task4 {
    public static void main(String[] args) {

    }
}

class Human{
    private String name;
    private String lastName;
    private int age;
    private char sex;

    public Human(String name, String lastName, int age, char sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Human(){
        this.name = "Victor";
        this.lastName = "Gorovoy";
        this.age = 43;
        this.sex = 'M';

    }
}


