package lesson5;
// Для заданных функций найдите их максимальное значение и
// x, при котором оно достигается, на указанных интервалах с
// шагом 0.01 с использованием цикла/циклов for:

//cos(x) + x^2 на интервале [-10, 10)
public class task4 {
    public static void main(String[] args) {
        double max = -10;
        double fnct = func(-10);

        for (double x = -10; x < 10; x += 0.01) {
            if (func(x) > func(max)) {
                max = x;
                fnct = func(x);
            }
        }

        System.out.println("Самое большое значение функции на интервале [-10, 10) = " + fnct + ", оно достигается при Х равном " + max);

    }

    public static double func(double y) {
        double res = Math.cos(y) + Math.pow(y, 2);
        return res;

    }
}


