package arrays1;
import java.util.Random;

public class example7 {
    public static void main(String[] args){
        int [][] arr = new int [5][5];
        fillDataRandom(arr);
        sort2dArray(arr);
        System.out.println();
        printArray(arr);


    }

    static void fillDataRandom(int [][] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(10);
            }
        }
    }

    static void sort2dArray (int [][] array){
        for (int i = 0; i < array[0].length; i++){
            for (int j = 0; j < array[0].length - 1; j++){
            if (summElementsInColumn(array, j) > (summElementsInColumn(array, j + 1))){
                changeColumns(array, j, j + 1);
                }
            }
        }
    }

    static int summElementsInColumn(int [][] array, int num){
        int summ = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i][num] % 2 == 0) {
                summ += array[i][num];
            }
        }
        return summ;
    }

    static void changeColumns(int [][] array, int x1, int x2){
        int tmp = 0;
        for (int i = 0; i < array.length; i++){
            tmp = array[i][x1];
            array[i][x1] = array[i][x2];
            array[i][x2] = tmp;
        }
    }

    static void printArray (int [][]arr){
        for (int i = 0; i < arr.length ; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr[0].length; i++){
            System.out.print(summElementsInColumn(arr, i) + " ");

        }
    }
}
