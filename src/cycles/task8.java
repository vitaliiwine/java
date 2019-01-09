package cycles;
//Для заданных функций найдите их максимальное значение и
//x, при котором оно достигается, на указанных интервалах с
//шагом 0.01 с использованием цикла/циклов for:

//e^x на интервале [-10, 10]
public class task8 {
    public static void main(String[] args) {
        double max = -10;
        double funct = Math.exp(max);
        for (double x = -10; x < 10 ; x += 0.01) {
            if (Math.exp(x) > Math.exp(max)) {
                max = x;
                funct = Math.exp(max);
            }

        }

        System.out.println(max);
        System.out.println(funct);

    }
}
