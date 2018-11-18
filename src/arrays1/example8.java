package arrays1;
import java.util.Random;

public class example8 {
    public static void main(String[] args) {
        int [][] arr = new int [7][7];
        fillArray(arr);
        sort2dArray(arr);
        printArray(arr);
    }

    public static void fillArray(int [][] array){
        Random random = new Random();
        for (int i = 0; i <array.length ; i++){
            for (int j = 0; j < array[i].length ; j++){
                array [i][j] = random.nextInt(99);
            }
        }
    }

    static void sort2dArray(int [][] array) {
        int [] temp = new int [array[0].length];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1; j++) {
                if (summElementsInString(array[j]) > summElementsInString(array[j + 1])){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
    }

    static int summElementsInString (int [] array){
        int summ = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                summ += array[i];
            }
        }
        return summ;
    }

    static void printArray (int [][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr [i][j] + "\t");
            }
            System.out.println(" " + summElementsInString(arr[i]));
        }
    }
}
