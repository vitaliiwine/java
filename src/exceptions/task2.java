package exceptions;

/*
Написать программу, которая будет считать значение функции f(x) = 12*x + 44 на
промежутке [-71; 14]. Значение при котором нужно посчитать значение функции вводится с
клавиатуры. Если оно не входит в заданный промежуток - бросается исключение. Программа при
этом не должна завершать своей работы
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = 0;
        try {
            x = Double.parseDouble(reader.readLine());
            if (x <= - 71 || x >= 14){
                throw new Exception("Out of bounds");
            }

            System.out.println(12 * x + 44);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("You are out of bounds");
        }


    }
}
