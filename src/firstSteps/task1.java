package firstSteps;
// ;ля заданных функций найдите их максимальное значение и
// x, при котором оно достигается, на указанных интервалах
// c шагом 0.01 с использованием цикла/циклов for:
// e^sin(x) на интервале [-100, 100]

public class task1 {
    public static void main(String[] args) {
        double max = -100;
        double function = Math.pow(Math.E, Math.sin(max));
        for (double x = -100; x <= 100; x += 0.01) {
            if (Math.pow(Math.E, Math.sin(x)) > Math.pow(Math.E, Math.sin(max))) {
                max = x;
                function = Math.pow(Math.E, Math.sin(x));
            }

        }

        System.out.println(max);
            System.out.println(function);
    }
}
