package abstracts;
//Написать игру “камень, ножницы, бумага”. Создать интерфейс класс Player с методами:
//● getName возвращает имя игрока
//● getMove возвращает решение игрока на текущий ход
//● addPoint добавляет одно очко игроку, когда он выигрывает
//● getPoints возвращает количество очков игрока
//Создать двух игроков-наследников allInOne и Computer
//Имя человеческого игрока allInOne должно запрашиваться с клавиатуры
//Имя компьютерного игрока можно вернуть любое
//Решение игрока должно запрашиваться с клавиатуры
//Решение компьютера должно выбираться случайно (см. Math.random)
//Создать класс Game, принимающий в конструкторе двух игроков имеющий метод play
//Метод play описывает процесс игры:
//1. Запросить имена игроков
//2. Получить решения игроков и сравнить
//3. Победившему игроку добавляется одно очко
//4. Напечатать результат игры - количество очков у каждого игрока
//5. Спросить у пользователя, хочет ли он продолжить игру
//6. Если да - Перейти к шагу 2. Если нет, к шагу 7
//7. Выйти

import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Human human = new Human("");
    }
}

 interface Player {
    String getName();
    int getMove();
    void addPoint();
    int getPoints();
}
class Human implements Player{
    private String name;
    private int points;
    private Scanner scanner;

    public Human(String name) {
        this.name = name;
        this.points = 0;
        scanner = new Scanner(System.in);
    }

    @Override
    public String getName(){ return name; }


    @Override
    public int getMove() {
        System.out.println("Please enter your move");
        System.out.println("1 - Rock");
        System.out.println("2 - Scissors");
        System.out.println("3 - Paper");
        int action = 0;
        do {
            action = scanner.nextInt();
        } while (action < 1 || action > 3);
        return action;
    }

    @Override
    public void addPoint() {
        points++;
    }

    @Override
    public int getPoints() {
        return points;
    }

}

class Computer implements Player{
    private String name;
    private int points;
    private Random random;

    public Computer() {
        name = "Skynet";
        this.points = 0;
        random = new Random();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMove() {
        int tmp = random.nextInt(101);
        if(tmp > 50){return 1;}
        if(tmp < 34){return 2;}
        return 3;
    }

    @Override
    public void addPoint() { points++; }

    @Override
    public int getPoints() { return points; }
}

class Game{
    Human human;
    Computer computer;
    private Scanner scanner;

    Game(String name){
        human = new Human(name);
        computer = new Computer();
        scanner = new Scanner(System.in);
    }

    void play(){
        int playerAction;
        int computerAction;
        int gameAction;
        while (true){
            playerAction = human.getMove();
            computerAction = computer.getMove();
        if (playerAction == 1 && computerAction == 2){
            System.out.println(human.getName() + " wins party");
            human.addPoint();
            }
            if (playerAction == 1 && computerAction == 3){
                System.out.println(human.getName() + " loses party");
                computer.addPoint();
            }
            if (playerAction == computerAction){
                System.out.println("Draw");
            }
            if (playerAction == 2 && computerAction == 1){
                System.out.println(human.getName() + " loses party");
                computer.addPoint();
            }
            if (playerAction == 2 && computerAction == 3){
                System.out.println(human.getName() + " wins party");
                human.addPoint();
            }
            if (playerAction == 3 && computerAction == 2){
                System.out.println(human.getName() + " loses party");
                computer.addPoint();
            }
            if (playerAction == 3 && computerAction == 1){
                System.out.println(human.getName() + " wins party");
            }

            System.out.println(human.getName() + " : " + human.getPoints());
            System.out.println(computer.getName() + " : " + computer.getPoints());
            System.out.println("One more time?");
            System.out.println("Press 1 to confirm");
            System.out.println("Press 2 to decline");
            gameAction = scanner.nextInt();
            if (gameAction == 2){
                break;
            }
        }
    }
}