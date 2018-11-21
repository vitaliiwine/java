package lesson7;
//Находим количество элементов, меньших заданного числа k, в одномерном массиве

public class task18 {
    public static void main(String[] args) {
        int [] arr = {3, 6, 7, 8, 9, 1};
        int k = 5;
        checkNums(arr, k);
    }

    static void checkNums(int [] data, int k){
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < k){
                counter++;
            }
        }
        System.out.println("Elements that are less than k is " + counter);
    }
}
