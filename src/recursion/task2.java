package recursion;
/*
Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от A до B включительно, в
порядке возрастания, если A < B, или в порядке убывания в противном случае.
 */

public class task2 {
    public static void main(String[] args) {
        func(20, 10);
        System.out.println(fuck(4));

    }

    public static void func(int a, int b) {
        if (a < b) {
            func(a, b - 1);
        } else if (a > b) {
            func(a, b + 1);
        }
        System.out.println(b);
    }

    public static int fu(int x) {
        if (x == 1) {
            return x;
        }
        return x * fu(x - 1);
    }


    public static int fuck(int x) {
        if (x > 1)
            return x * fuck(x - 1);
        else return x;
    }
}
