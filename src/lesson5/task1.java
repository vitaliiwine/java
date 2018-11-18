package lesson5;
// Для заданных функций найдите их максимальное значение и
// x, при котором оно достигается, на указанных интервалах
// с шагом 0.01 с использованием цикла/циклов for:

//x^2 на интервале [0, 10]
public class task1 {
    public static void main(String[] args) {
        double max = 0;
        double funct = Math.pow(max, 2);
        for (double x = 0; x <= 10; x += 0.01 ) {
            if(Math.pow(x, 2) > Math.pow(max, 2)) {
                max = x;
                funct = Math.pow(x, 2);
            }
        }

        System.out.println(max);
            System.out.println(funct);
    }
}
