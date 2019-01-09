package arrays;
//Переворачиваем массив
import java.util.Arrays;

public class task11 {
    public static void main(String[] args) {
        int [] arr = {3, 4, 5, 9};
        backsort(arr);
    }

    static void backsort(int [] data){
        for (int i = 0; i < data.length / 2; i++) {
            int tmp = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(data));
    }
}
