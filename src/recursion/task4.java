package recursion;

/*
Сумма цифр числа
Дано натуральное число N. Вычислите сумму его цифр.
При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
 */

public class task4 {
    public static void main(String[] args) {
        System.out.println(summ(555));

    }

    public static int summ(int x){
        if (x < 10){
            return x;
        }
        return x % 10 + summ(x / 10);
    }
}
