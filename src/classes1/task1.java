package classes1;
//Создать класс “Point” с двумя вещественными переменными для определения координат точки по x и y
//Добавить в класс конструктор с параметрами, две функции для возвращения значений координат x и y
//соответственно, а также функцию, в которую передаются координаты другой точки, после чего в ней
//рассчитывается расстояние до нее и выводится на экран.

import java.text.DecimalFormat;

public class task1 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Point pointA = new Point(0, 3);
        Point pointB = new Point(3, 1);
        PointLogic logic = new PointLogic(pointA, pointB);
        System.out.println("Расстояние между точкой A(" + pointA.getX() + "; " + pointA.getY() + ") и точкой B(" + pointB.getX() + "; " + pointB.getY() + ") равняется: " + df.format(logic.length()).replace(",", "."));
    }
}

class Point {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int returnX() {
        return x;
    }

    public int returnY() {
        return y;
    }

    public void printPoint() {
        System.out.println("X: " + this.getX() + "\nY: " + this.getY());

    }
}


class PointLogic {
    Point A;
    Point B;

    public PointLogic(Point a, Point b) {
        A = a;
        B = b;
    }

    public double length() {
        return Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
    }

}