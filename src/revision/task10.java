package revision;

/*
Находим минимальный элемент в одномерном массиве
 */

public class task10 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 10, 2};
        int min = Integer.MAX_VALUE;
        findMin(arr, min);

    }

    static void findMin(int[] data, int min){
        for (int i = 0; i < data.length; i++) {
            min = Math.min(min, data[i]);
        }
        System.out.println("Min is " + min);
    }
}
