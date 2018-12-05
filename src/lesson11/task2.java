package lesson11;
//Создать абстрактный класс “Rodent” с переменными для пола, веса, цвета шкуры
//и скорости бега, содержащий также абстрактные методы Run, Jump и Eat. Наследовать
//от него 3 обычных класса “Hamster”, “Chinchilla” и “Rat”, для каждого из которых
//переопределить метод Run, чтобы он выводил название класса и скорость бега грызуна
//на экран.

public class task2 {
    public static void main(String[] args) {
        Hamster hamster = new Hamster("Hamster","Male", 2, "brown", 2);
        hamster.Info();
        hamster.Run();
        hamster.Jump();
        hamster.Eat();
        Chinchilla chinchilla = new Chinchilla("Chinchilla","Female", 3, "white", 3);
        chinchilla.Info();
        chinchilla.Run();
        chinchilla.Jump();
        chinchilla.Eat();
        Rat rat = new Rat("Rat","Female", 2, "grey", 4);
        rat.Info();
        rat.Run();
        rat.Jump();
        rat.Eat();
    }
}

abstract class Rodent{
    String type;
    String sex;
    int weight;
    String colour;
    int speed;

    public Rodent(String type, String sex, int weight, String colour, int speed) {
        this.type = type;
        this.sex = sex;
        this.weight = weight;
        this.colour = colour;
        this.speed = speed;
    }

    abstract void Run();
    abstract void Jump();
    abstract void Eat();
    abstract void Info();
}

class Hamster extends Rodent{
    public Hamster(String type, String sex, int weight, String colour, int speed) {
        super(type, sex, weight, colour, speed);
    }

    public void Info(){
        System.out.println("Type: " + type);
        System.out.println("Sex: " + sex);
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }

    public void Run(){
        System.out.println("Hamster" + " " + "speed: " + speed);
    }

    public void Jump(){
        System.out.println("Jumping");
    }

    public void Eat(){
        System.out.println("Eating");
    }
}

class Chinchilla extends Rodent{
    public Chinchilla(String type, String sex, int weight, String colour, int speed) {
        super(type, sex, weight, colour, speed);
    }

    public void Info(){
        System.out.println("Type: " + type);
        System.out.println("Sex: " + sex);
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }

    public void Run(){
        System.out.println("Chinchilla"  + " " + "speed: " + speed);
    }

    public void Jump(){
        System.out.println("Jumping");
    }

    public void Eat(){
        System.out.println("Eating");
    }
}

class Rat extends Rodent{
    public Rat(String type, String sex, int weight, String colour, int speed) {
        super(type, sex, weight, colour, speed);
    }

    public void Info(){
        System.out.println("Type: " + type);
        System.out.println("Sex: " + sex);
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }

    public void Run(){
        System.out.println("Rat" + " " + "speed: " +  speed);
    }

    public void Jump(){
        System.out.println("Jumping");
    }

    public void Eat(){
        System.out.println("Eating");
    }
}