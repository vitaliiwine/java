package arrays;

import java.util.Random;

public class allInOne {
    public static void main(String[] args) {
        double[] data = new double[15];
        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(3) + 1;
        }

        //1) Найти минимальный элемент в одномерном массиве из n элементов
        double min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min)
                min = data[i];
        }
        System.out.println("Min element is " + min);

        //2) Найти максимальный элемент в одномерном массиве из n элементов
        double max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max)
                max = data[i];
        }
        System.out.println("Max element is " + max);

        //3) Найти сумму элементов одномерного массива из n элементов
        int[] singlearray = {1, 2, 3};
        double sum = singlearray[0];
        for (int i = 0; i < singlearray.length; i++) {
            sum += singlearray[i];
        }
        System.out.println("Sum of the elements is " + sum);

        //4) Найти среднее арифметическое одномерного массива из n элементов
        double average = data[0];
        double mid = 0;
        for (int i = 0; i < data.length; i++) {
            mid += data[i];
            average = mid / data.length;
        }
        System.out.println("Average of the numerals is " + average);

        //5) Найти произведение элементов одномерного массива, состоящего из n
        //элементов
        double product = 1;
        for (int i = 0; i < data.length; i++) {
            product *= data[i];

        }
        System.out.println("Product of numbers is " + product);

        //6) Найти сумму элементов одномерного массива с нечетными номерами,
        //состоящего из n элементов

        double sumodd = 0;
        for (int i = 0; i < data.length; i++) {
            if (i % 2 != 0)
                sumodd += data[i];
        }
        System.out.println("Sum of odd numbers " + sumodd);

        //7) Найти сумму элементов одномерного массива с четными номерами, состоящего
        //из n элементов
        double sumeven = 0;
        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0)
                sumeven += data[i];

        }
        System.out.println("Sum of even numbers is " + sumeven);

        //8) Найти произведение элементов одномерного массива с нечетными номерами,
        //состоящего из n элементов
        double productodd = 1;
        for (int i = 0; i < data.length; i++) {
            if (i % 2 != 0)
                productodd *= data[i];

        }
        System.out.println("Product of odd numbers is " + productodd);

        //9) Найти произведение элементов одномерного массива с четными номерами,
        //состоящего из n элементов
        double producteven = 1;
        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0)
                producteven *= data[1];

        }
        System.out.println("Product of even numbers is " + producteven);

        //10) Найти количество элементов, равных нулю, в одномерном массиве, состоящем
        //из n элементов
        double num0 = 1;
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) {
                counter++;

            }
        }
        System.out.println("Quantity of numbers that equal zero is " + counter);

        //11) Найти количество нечетных элементов в одномерном массиве, состоящем из n
        //элементов
        double numodd = 1;
        int counter1 = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                counter1++;
            }

        }
        System.out.println("Quantity of odd numbers is " + counter1);

        //12) Найти количество четных элементов в одномерном массиве, состоящем из n
        //элементов
        double numeven = 1;
        int counter2 = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                counter2++;

            }

        }
        System.out.println("Quantity of even numbers is " + counter2);

        //13) Найдите количество элементов, превышающих заданное число k, в
        //одномерном массиве, состоящем из n элементов
        int k = 16;
        int counter3 = 0;
        for (double l : data) {
            if (l > k)
                counter3++;

        }
        System.out.println("Quantity of numbers which are higher than K is " + counter3);

        //14) Найти количество элементов, не превышающих заданное число k, в
        //одномерном массиве, состоящем из n элементов
        int k1 = 25;
        int counter4 = 0;
        for (double l : data) {
            if (l < k1)
                counter4++;

        }
        System.out.println("Quantity of numbers that are less than K is " + counter4);

        //16) Найти ближайший к нулю или равный ему элемент в одномерном массиве из n
        //элементов

        int[] smallarray = {1, -34, 2, -9, 7};
        int closetozero = smallarray[0];
        for (int i = 0; i < smallarray.length; i++) {
            if (smallarray[i] == 0 || Math.abs(smallarray[i]) < Math.abs(closetozero)) ;
            closetozero = smallarray[i];

        }
        System.out.println("Closest to zero is " + closetozero);

        //17) Нормировать все элементы в одномерном массиве из n элементов
        //относительно максимального элемента
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(99) + 1;
        }
        //нахождение максимума
        double max1 = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max1) {
                max1 = data[i];
            }
        }
        //нормирование относительно максимума
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] / max1;
        }
        //вывод на экран
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        //18) Найти минимальный элемент в двумерном массиве из n элементов
        int[][] newArray = {{1, 2}, {3, 4}};
        int min1 = Integer.MAX_VALUE;
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                if (newArray[i][j] < min1)
                    min1 = newArray[i][j];
                System.out.print(newArray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Min element in an array is " + min1);

        //19) Найти максимальный элемент в двумерном массиве из n элементов
        int[][] newArray1 = {{1, 2}, {3, 4}};
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < newArray1.length; i++) {
            for (int j = 0; j < newArray1[i].length; j++) {
                if (newArray1[i][j] > max2)
                    max2 = newArray1[i][j];
                System.out.println(newArray1[i][j] + "\t");
            }
            System.out.println("Max element in an array is " + max2);
        }

        //20) Найти сумму элементов двумерного массива из n элементов
        int[][] dArray = {{0, 1, 2}, {3, 4, 5}};
        int dsum = 0;
        for (int i = 0; i < dArray.length; i++) {
            for (int j = 0; j < dArray[i].length; j++) {
                dsum += dArray[i][j];

            }
        }
        System.out.println("Sum of the two-dimensional array elements is " + dsum);

        //21) Найти среднее арифметическое двумерного массива из n элементов
        int[][] dArray1 = new int[10][10];
        for (int i = 0; i < dArray1.length; i++) {
            for (int j = 0; j < dArray1.length; j++) {
                dArray1[i][j] = random.nextInt();
            }
        }

        int sum1 = 0;
        int daverage = 0;
        int count = dArray1.length * dArray1[0].length;
        for (int i = 0; i < dArray1.length; i++) {
            for (int j = 0; j < dArray1[i].length; j++) {
                sum1 += dArray1[i][j];
            }


        }
        daverage = sum1 / count;
        System.out.println("Average of the two-dimensional array is " + daverage);

        //22) Найти сумму элементов на главной диагонали в квадратном двумерном
        //массиве из n элементов
        int[][] dArray2 = {
                {3, 3, 6},
                {4, 4, 7},
                {5, 5, 8}
        };
        int sum3 = 0;
        for (int i = 0; i < dArray2.length; i++) {
            sum3 += dArray2[i][i];
        }
        System.out.println("Sum of the main diagonal elements is " + sum3);

        //23) Найти сумму элементов на побочной диагонали в квадратном двумерном
        //массиве из n элементов
        int[][] dArray3 = {
                {3, 3, 6},
                {4, 4, 7},
                {5, 5, 8}
        };
        int sum4 = 0;
        for (int i = 0; i < dArray3.length; i++) {
            sum4 += dArray3[i][dArray3[0].length - i - 1];
        }

        //24) Найти определитель квадратного двумерного массива из n элементов



    }


}


