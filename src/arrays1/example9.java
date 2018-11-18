package arrays1;
import java.util.Random;

public class example9 {
    public static void main(String[] args) {
        int [][] arr = new int [7][7];
        fillArray(arr);
        sort2dArray(arr);
        printArray(arr);
    }

    public static void fillArray (int [][] data){
        Random random = new Random();
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[0].length ; j++){
                data [i][j] = random.nextInt(999);
            }
        }
    }

    public static void sort2dArray (int [][] data){
        int tmp = 0;
        for (int i = 0; i < data.length * data[0].length; i++){
            for (int j = 0; j < data.length; j++){
                for (int k = 0; k < data[j].length - 1; k++){
                    if (data[j][k] > data [j][k + 1]){
                        tmp = data [j][k];
                        data [j][k] = data [j][k + 1];
                        data [j][k + 1] = tmp;
                    }
                }

                if (j < data.length - 1 && data[j][data[0].length - 1] > data[j + 1][0]){
                    tmp = data [j][data[0].length - 1];
                    data [j][data[0].length - 1] = data [j + 1][0];
                    data[j + 1][0] = tmp;
                }
            }
        }
    }

    public static void printArray (int [][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr [i][j] + " ");
            }
            System.out.println();
        }
    }
}
