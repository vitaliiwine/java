package lesson7;
//Находим максимальный элемент в целочисленном массиве

public class task2 {
    public static void main(String[] args) {
        int [] numbers = {2, 4, 6, 8};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++){
            max = Math.max(max, numbers[i]);
        }

        System.out.println("Max element is "+ max);
    }
}
