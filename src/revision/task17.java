package revision;

/*
Пифагоровы числа. Три натуральных числа a, b и c образуют пифагорову тройку, если
c2=a2+b2. Пифагорова тройка называется основной, если наибольший общий делитель ее чисел
равен единице. Например, 3, 4, 5 - основная тройка, 6, 8, 10 - производная тройка. Найдите все
основные пифагоровы тройки, числа в которых не превышают данное число max
 */

public class task17 {
    public static void main(String[] args) {

        int max = 100;


        for (int c = 1; c < max; c++) {
            for (int b = 1; b < max; b++) {
                for (int a = b; a < max; a++) {
                    if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
                        if (func(a, b) == 1 && func(a, c) == 1 && func(b, c) == 1) {
                            System.out.println(a + " " + b + " " + c);
                        }
                    }
                }
            }
        }
    }

    static int func(int a, int b) {
        if (b == 0)
            return a;
        return func(b, a % b);
    }
}


