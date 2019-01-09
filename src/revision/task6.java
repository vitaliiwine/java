package revision;

/*
Находим сумму положительных чисел
 */

public class task6 {
    public static void main(String[] args) {
        int[] arr = {3, 4, - 2, 5, 6};
        System.out.println(sum(arr));
    }

    public static int sum(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= 0){
                sum += data[i];
            }
        }
        return sum;
    }
}