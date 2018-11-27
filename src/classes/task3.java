package classes;
//Создать класс с двумя переменными. Добавить функцию вывода на экран и функцию
//изменения этих переменных. Добавить функцию, которая находит сумму значений этих
//переменных, и функцию которая находит наибольшее значение из этих двух переменных

public class task3 {
    public static void main(String[] args) {

        Ints newInts = new Ints();
        newInts.maxOfInts(28, 66);
        newInts.sumOfInts(28, 66);
        newInts.printInts(28, 66);
        newInts.showIntsbefore();
        newInts.change(4,3);
        newInts.showIntsafter();
    }

}

class Ints{
    int weight = 82;
    int age = 27;

    public void showIntsbefore(){
        System.out.println("Weight before change " + weight);
        System.out.println("Age before change " + age);
    }

    public void showIntsafter(){
        System.out.println("Weight after change " + weight);
        System.out.println("Age after change " + age);
    }

    public void change(int a, int b){
        weight += a;
        age += b;
    }

    public void printInts(int weight, int age){
        System.out.println("Sum of the variables is " + sumOfInts(weight, age));
        System.out.println("Max of the variables is " + maxOfInts(weight, age));
    }

    public int sumOfInts(int weight, int age){
        int res = weight + age;
        return res;
    }

    public int maxOfInts(int weight, int age){
        int max = 0;
        if (weight > age){
            max = weight;
        }
        if (weight < age){
            max = age;
        }
        return max;
    }
}
