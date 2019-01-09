package arrays;
//Циклический сдвиг массива вправо и влево

import java.util.Arrays;

public class task12 {
    public static void main(String[] args) {
        int [] arr = {4, 5, 7, 9, 1, 10};
        moveright(arr);
        moveleft(arr);
    }

    static void moveright(int [] data){
        int tmp = data[data.length - 1];
        for (int i = data.length - 1; i > 0; i--) {
            data[i] = data[i - 1];
        }

        data[0] = tmp;
        System.out.println(Arrays.toString(data));
    }

    static void moveleft(int [] data){
        int tmp = data[0];
        for (int i = 0; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }

        data[data.length - 1] = tmp;
        System.out.println(Arrays.toString(data));
    }
}
