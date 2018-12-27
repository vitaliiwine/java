package lesson14;

import lesson14.Squards.Army;

public class task1 {
    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic();
        Army army1 = new Army(10);
        Army army2 = new Army(10);
        gameLogic.fightBetweenSquards(army1, army2);

        System.out.println("*************");
        army1.printArmy();
        System.out.println("*************");
        army2.printArmy();

    }
}
