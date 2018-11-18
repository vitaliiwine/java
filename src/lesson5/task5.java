package lesson5;
//Для заданных функций найдите их максимальное значение и
//x, при котором оно достигается, на указанных интервалах с
//шагом 0.01 с использованием цикла/циклов for:

//x^3 на интервале [-50, 50]
public class task5 {
    public static void main(String[] args) {
            double max = 0;
            double funct = Math.pow(max, 3);
        for (double x = -50; x < 50 ; x += 0.01) {
            if (Math.pow(x, 3) > Math.pow(max, 3)) {
                max = x;
                funct = Math.pow(x, 3);
            }

        }

        System.out.println(max);
        System.out.println(funct);
    }
}
