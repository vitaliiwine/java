package exceptions;

/*
Написать программу, которая будет считать значение функции f(x) = 1 / x при заданных
значениях. Программа может принимать на вход любые значения отличные от нуля. Поймать в ней
случай деления на ноль с помощью exeption’ов так, чтобы программа не завершала свою работу
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = 0;
        System.out.println("Enter a numeral u'd like to divide");
        try {
            x = Double.parseDouble(reader.readLine());
            if (x == 0) {
                throw new Exception("Can't divide by 0");
            }
            System.out.println(1.0 / x);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("U can not divide by zero");
        }


    }
}
