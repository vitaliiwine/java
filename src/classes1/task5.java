package classes1;
//Создать класс “Monster” со строковой переменной для имени, целочисленной переменной для очков
//здоровья, двумя вещественными переменными для силы атаки и показателя защиты. Добавить в класс
//конструктор с параметрами и функцию для вывода всех параметров, на экран.

import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        Monster gumi = new Monster("Gumi", 300, 12, 4);
        Monster tomi = new Monster("Tomi", 275, 10, 3);
        gumi.printMonster();
        System.out.println();
        tomi.printMonster();
    }
}

class Monster {
    Random rnd = new Random();
    private String name;
    private int health;
    private double strike;
    private double defence;

    public Monster() {
        this.name = "unknown" + rnd.nextInt(99);
        this.health = 500;
        this.strike = 5;
        this.defence = 3;
    }

    public Monster(String name, int health, double strike, double defence) {
        this.name = name;
        this.health = health;
        this.strike = strike;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public double getStrike() {
        return strike;
    }

    public double getDefence() {
        return defence;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrike(double strike) {
        this.strike = strike;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public void printMonster() {
        System.out.println(name + "\nHP: " + health + "\nAttack srength: " + strike + "\nDefence power: " + defence);
    }
}