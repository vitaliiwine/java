package arrays1;
import java.util.Random;
import java.util.Arrays;
public class example6 {
    public static void main(String[] args) {
        int [][] arr = fillArray(5);
        sort2dArray(arr);
        printArr(arr);

    }

    public static int [][] fillArray(int r){
        int [][] arr = new int [r][r];
        Random random = new Random();

        for (int i = 0; i < r; i++){
            for (int j = 0; j < r; j++) {
                arr [i][j] = random.nextInt(199);
            }
        }
        return arr;
    }

    public static void sort2dArray (int [][] arr){
        int [] temparr = new int[arr.length * arr[0].length];
        int countOfTemp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                temparr[countOfTemp] = arr [i][j];
                countOfTemp++;
            }
        }

        for (int i = 0; i < temparr.length ; i++){
            for (int j = 0; j < temparr.length - 1; j++){
                if (temparr[j] < temparr[j + 1]){
                    int tmp = temparr[j];
                    temparr[j] = temparr[j + 1];
                    temparr[j + 1] = tmp;

                }

            }
        }

        countOfTemp = 0;
        for (int i = 0; i < arr.length ; i++){
            for (int j = 0; j < arr.length; j++){
                arr [i][j] = temparr[countOfTemp];
                countOfTemp++;
            }
        }
    }

    public static void printArr(int [][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
