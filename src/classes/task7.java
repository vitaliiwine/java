package classes;
//Создать класс “Fraction” с двумя вещественными переменными для задания значений числителя и
//знаменателя. Добавить в класс перегрузку функций сложения, вычитания, умножения и деления, а также
//функцию для вывода дроби.

public class task7 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 4);
        FractionLogic fl = new FractionLogic();
        Fraction res;
        System.out.println("Multiplying");
        res = FractionLogic.multiply(f1, f2);
        res.print();
        System.out.println("____________________");
        System.out.println("Adding");
        res = FractionLogic.add(f1, f2);
        res.print();


    }
}

class Fraction {
    private int x1;
    private int x2;

    public void print() {
        System.out.println(x1);
        System.out.println("-");
        System.out.println(x2);
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public Fraction() {
        x1 = 0;
        x2 = 0;
    }

    public Fraction(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
}

class FractionLogic {

    public static Fraction add(Fraction first, Fraction second) {
        Fraction res = new Fraction();

        res.setX1(first.getX1() * second.getX2() +
                second.getX1() * first.getX2());
        res.setX2(first.getX2() * second.getX2());

        return res;
    }

    public static Fraction multiply(Fraction first, Fraction second) {
        Fraction res = new Fraction();

        res.setX1(first.getX1() * second.getX1());
        res.setX2(second.getX2() * second.getX2());

        return res;
    }
}


