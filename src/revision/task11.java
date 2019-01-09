package revision;

/*
Находим максимальный элемент в массиве
 */

public class task11 {
    public static void main(String[] args) {
        int[] arr = {100, 200, 450, 1170, 1169};
        int max = Integer.MIN_VALUE;
        findMax(arr, max);
    }

    static void findMax(int[] data, int max){
        for (int i = 0; i < data.length; i++) {
            max = Math.max(data[i], max);
        }
        System.out.println("Max is " + max);
    }
}
