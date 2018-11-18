package arrays1;

import java.util.Arrays;
import java.util.Random;

public class example4 {
    public static void main(String[] args) {
        int[][] array = fillArray(4);
        printArray(array);
        System.out.println();
        sort2dArray(array);
        printArray(array);
    }

    static int[][] fillArray(int n) {
        int[][] array = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(99);

            }
        }
        return array;
    }

    public static void sort2dArray(int [][] array){
        int [] temp = new int [array.length * array[0].length];
        int countOfTemp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
             temp[countOfTemp] = array[i][j];
             countOfTemp++;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length - 1; j++) {
                if (temp[j] < temp[j + 1]) {
                    int tmp = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = tmp;
                }
            }
        }

        countOfTemp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = temp[countOfTemp];
                countOfTemp++;
            }
        }

    }
    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
