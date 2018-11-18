package arrays1;

import java.util.Random;

public class example10 {
    public static void main(String[] args) {
        int [][] arr = new int [4][4];
        fillArray(arr);
    }

    static void fillArray (int [][] data){
        Random random = new Random();
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[0].length; j++) {
                data[i][j] = random.nextInt();
            }
        }
    }
}
