package classes;
//Написать класс калькулятора, хранящего вещественное число x и понимающего следующие команды:
//прибавить к этому числу значение параметра, вычесть из него, домножить его и разделить, а также извлечь из этого числа
//квадратный корень и взять тригонометрическую функцию. Написать еще один класс, кроме перечисленного
//имеющий одну ячейку памяти и понимающий команды записать в память, извлечь из памяти, добавить x к содержимому памяти

public class task12 {
    public static void main(String[] args) {

    }
}

class Calculator{
    double x;

    public double add(double y){
     return x + y;
    }

    public double subtract(double y){
        return x - y;
    }

    public double multiply(double y){
        return x * y;
    }

    public double divide(double y){
        return x / y;
    }

    public double square(double y){
        return Math.sqrt(y);
    }

    public double function(double y){
        return Math.sin(y);
    }


}

class getSet extends Calculator{
    double y;

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double add(){
        return x + y;
    }
}