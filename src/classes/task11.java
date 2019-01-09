package classes;
//Создать класс “Figure” с тремя вещественными показателями для длины, ширины и высоты фигуры.
//Создать три конструктора, которые принимают от одного до трех указанных выше параметров для
//создания объектов класса, представляющих соответственно прямую, прямоугольник и параллелепипед.
//Добавить в класс функцию для вывода типа фигуры в соответствии с определенными в конструкторе
//параметрами.

public class task11 {
    public static void main(String[] args) {
        Figure figure = new Figure(3.2);
        Figure figure1 = new Figure(2.3, 4,3);
        Figure figure2 = new Figure(1.2, 2, 3.3);

        figure.printFigure();
        figure1.printFigure1();
        figure2.printFigure2();
    }
}

class Figure{
    double length;
    double width;
    double height;

    public Figure(double length) { this.length = length; }

    public Figure(double length, double width) { this.length = length; this.width = width; }

    public Figure(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void printFigure(){
        System.out.println("Line length: " + length);
    }

    public void printFigure1(){
        System.out.println("Rectangle length: " + length + " Rectangle width: " + width);
    }

    public void printFigure2(){
        System.out.println("Parallelepiped length: " + length + " Parallelepiped width: " + width + " Parallelepiped height: " + height);
    }
}
