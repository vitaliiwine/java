package lesson7;
//Находим минимальный элемент в одномерном массиве

public class task13 {
    public static void main(String[] args) {
        int [] arr = {3, 4, 5, 8, 9};
        int min = Integer.MAX_VALUE;
        findMin(arr, min);
    }

    static void findMin(int [] data, int min){
        for (int i = 0; i < data.length; i++) {
            min = Math.min(min, data[i]);
        }
        System.out.println("Min is " + min);
    }
}
