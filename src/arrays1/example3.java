package arrays1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
//        int[] data = fillArray();
//        System.out.println(Arrays.toString(data));
//        sort(data);
//        System.out.println(Arrays.toString(data));
        int [][] data1 = new int[5][5];
        fill2d(data1);
    }

    static int[] fillArray(int size) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter all of the array's elements here");
//        int number = sc.nextInt();
        int[] data = new int[size];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(99);
        }
        return data;
    }

    static void sort(int[] data) {

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] < data[j + 1]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
    }

    public static void fill2d(int[][] data){
        for (int i = 0; i < data.length; i++) {
            data[i] = fillArray(data[i].length);
        }
    }


}