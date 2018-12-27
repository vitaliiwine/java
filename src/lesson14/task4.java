package lesson14;

/*
Создать функцию, в которую передаются два значения, каждое из которых
может являться либо целочисленным, либо вещественным, после чего
определяется тип, и функция возвращает их сумму либо в виде целочисленного,
либо в виде вещественного значения.
 */

import java.io.BufferedReader;

public class task4<T> {
    public static void main(String[] args) {

        System.out.println("Adding: " + funcAdd(5.5, 5.5));
        System.out.println("Multiplying: " + funcMult(1.5, 1.5));

    }

    public static <T> T funcAdd(T param1, T param2) {
        if (param1 instanceof Integer && param2 instanceof Integer) {
            Integer sum = (Integer) param1 + (Integer) param2;
            return (T) sum;
        }

        else if (param1 instanceof Double && param2 instanceof Double) {
            Double sum = (Double) param1 + (Double) param2;
            return (T) sum;
        } else return null;
    }

    public static <T> T funcMult(T param1, T param2) {
        if (param1 instanceof Integer && param2 instanceof Integer) {
            Integer sum = (Integer) param1 * (Integer) param2;
            return (T) sum;
        }

        else if (param1 instanceof Double && param2 instanceof Double) {
            Double sum = (Double) param1 * (Double) param2;
            return (T) sum;
        } else return null;
    }
}