package cycles;
//Для заданных функций найдите их максимальное значение и
//x, при котором оно достигается, на указанных интервалах с
//шагом 0.01 с использованием цикла/циклов for:

//1/ x^3 + x^3 на интервалах [-10, -1] и [1, 10]
public class task7 {
    public static void main(String[] args) {
        double max = -10;
        double funct = 1 / Math.pow(max, 3) + Math.pow(max, 3);
        for (double x = -10; x < 10; x += 0.01) {
            if (!(x > -1 && x < 1)) {
                double temp = Math.pow(x, 3) + Math.pow(x, 3);
                if (temp > max){
                    max = x;
                    funct = 1 / temp;
                }

            }

        }

        System.out.println(max);
        System.out.println(funct);



    }
}
