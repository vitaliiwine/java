package revision;

/*
Находим максимальный элемент в целочисленном массиве
 */

public class task2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println("Max element is " + max);
    }
}
