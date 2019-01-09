package classes;
//Создать класс ”Function” c четырьмя вещественными показателями для коэффициентов при каждом
//члене в формуле x3+x2+x+c, также создать функцию, принимающую на вход показатель x и выводящую
//значение функции в соответствующей x точке. Добавить в класс конструктор с параметрами, функцию для
//вывода формулы с добавленными в нее параметрами.

public class task10 {
    public static void main(String[] args) {

    }
}

class Function{
    private double a;
    private double b;
    private double c;
    private double d;

    public Function(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double calculateFunction(double x){
        return Math.pow(a * x, 3) + Math.pow(b * x, 2) + d * x + c;

    }
}
