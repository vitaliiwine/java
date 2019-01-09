package exceptions;

/*
Написать программу, которая будет считать
значение функции f(x) = 18*x ^ 2 + (54/x) - 8 на заданном
промежутке ( промежуток вводится с клавиатуры ). Далее
вводится с клавиатуры значение при котором нужно посчитать
функцию. Если значение не входит в заданный промежуток -
бросается исключение. Программа при этом не должна
завершать своей работы
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = 0;
        double bond1 = 0;
        double bond2 = 0;

        try {
            bond1 = Double.parseDouble(reader.readLine());
            bond2 = Double.parseDouble(reader.readLine());
            x = Double.parseDouble(reader.readLine());

            if (x >= bond1 && x <= bond2) {
                throw new Exception("Out of bounds");
            }

            System.out.println(18 * Math.pow(x, 2) + (54 / x) - 8);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
