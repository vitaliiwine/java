package lesson5;
// Для заданных функций найдите их максимальное значение и
// x, при котором оно достигается, на указанных интервалах с
// шагом 0.01 с использованием цикла/циклов for:

//sin(x) + x^2 на интервале [-10, 10)
public class task3 {
    public static void main(String[] args) {
        double max = 0;
        double funct = func(-10);
        for (double x = -10; x < 10; x += 0.01) {
            if (func(x) > func(max)) {
                max = x;
                funct = func(x);
            }
        }
        System.out.println(max);
        System.out.println(funct);


    }

    public static double func(double x) {

        return Math.sin(x) + Math.pow(x, 2);
    }
}
