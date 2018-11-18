package arrays1;

import java.sql.SQLOutput;

public class example {
    public static void main(String[] args) {
        //Вывод длины массива myArray
        double [] myArray = {2.4, 3.8, 11.2, 9.8, 1.18};
        System.out.println("Element quantity in an array is " + myArray.length);

        //Вывод максимального элемента
        double max = Double.MIN_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            max = Math.max(max, myArray[i]);
        }
        System.out.println("Max element in an array is " + max);

        //Вывод минимального элемента
        double min = Double.MAX_VALUE;
        for (int i = 0; i < myArray.length ; i++) {
            min = Math.min(min, myArray[i]);
        }
        System.out.println("Min element in an array is " + min);

        // Вывод суммы массива
        double sum = 0;
        for (int i = 0; i < myArray.length; i++) {
        sum += myArray[i];
        }
        System.out.println("Sum of an array elements is " + sum);

        //Вывод четных элементов
        int[] myArray1 = {4,5,6,1,9,8,4};
        System.out.print("Even numbers are ");
        for (int i = 0; i < myArray1.length; i++) {
            if (myArray1[i] % 2 == 0){
                System.out.print(myArray1[i] + " ");
            }
        }

        //Вывод элементов с нечетным индексом
        System.out.print("\nEven index numbers are ");
        for (int i = 0; i < myArray1.length; i++) {
            if (i % 2 != 0) {
                System.out.print(i + myArray1[i] + " ");
            }

        }



    }

}
