package classes;
//Создать класс “allInOne” с двумя строковыми переменными для имени и фамилии, вещественной
//переменной для возраста и логической переменной для пола. Добавить в класс конструкторы с
//параметрами и без них.

public class task8 {
    public static void main(String[] args) {

    }
}

class HumanHuman{
    private String name;
    private String lastName;
    private int age;
    private char sex;

    public HumanHuman(String name, String lastName, int age, char sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public HumanHuman(){
        this.name = "Victor";
        this.lastName = "Gorovoy";
        this.age = 43;
        this.sex = 'M';

    }
}


