package generics;

// Создать функцию, в которую передается либо целочисленное, либо
// вещественное, либо строковое значение, после чего на экран выводится тип
// переданных в функцию данных и само значение.

public class task2<T> {
    public static void main(String[] args) {
        func("Sonya");
    }

    public static <T> void func(T param){
        if (param instanceof Integer || param instanceof  Double
        || param instanceof String)
            System.out.println(param.getClass().getSimpleName() + " " + param);
    }

}
