package exceptions;

/*
Создать абстрактный класс Фигура с абстрактным методом draw.
Отнаследовать от него 5 типов фигур. Для каждого реализовать
отрисовку этой фигуры в консоли
В main создать arraylist фигур. В цикле создать генератор фигур, который
будет случайным образом выдавать фигуру и она будет записываться в
имеющийся arraylist. В конце вывести фигуры на экран.
 */

import java.util.ArrayList;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        ArrayList<Figure> arrayList = new ArrayList<>();
        Random random = new Random();
        int a = 0;
        try {
            for (int i = 0; i < 5; i++) {
                a = random.nextInt(3);
                if (a == 0)
                    arrayList.add(new Square());
                if (a == 1)
                    arrayList.add(new Triangle());
                if (a == 2)
                    arrayList.add(new Rectangle());
            }

            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.get(i).draw();

            }
        } catch (Exception e) {
            System.out.println("Я делаю ошибки просто так, а потом их ловлю");
            e.printStackTrace();
        }
    }
}

abstract class Figure {
    abstract void draw();
}

class Square extends Figure {
    @Override
    void draw() {
        System.out.println("******");
        System.out.println("*" + "     " + "*");
        System.out.println("*" + "     " + "*");
        System.out.println("*" + "     " + "*");
        System.out.println("******");
    }
}

class Triangle extends Figure {
    @Override
    void draw() {
        System.out.println("*");
        System.out.println("*" + " " + "*");
        System.out.println("*" + "  " + "*");
        System.out.println("*" + "   " + "*");
        System.out.println("*" + "    " + "*");
        System.out.println("*" + "     " + "*");
        System.out.println("********");
    }
}

class Rectangle extends Figure{
    @Override
    void draw() {
        System.out.println("*******");
        System.out.println("*" + "     " + "*");
        System.out.println("*" + "     " + "*");
        System.out.println("*" + "     " + "*");
        System.out.println("*" + "     " + "*");
        System.out.println("*******");

    }
}

