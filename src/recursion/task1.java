package recursion;

/*
Дано натуральное число n. Выведите все числа от 1 до n
 */

public class task1 {
    public static void main(String[] args) {
        func(5);
    }

    public static void func(int n) {
        if (n > 0) {
            func(n - 1);
            System.out.println(n);
        }
    }
}
