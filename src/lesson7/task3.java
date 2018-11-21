package lesson7;
//Находим минимальное значение в целочисленном массиве

public class task3 {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 60, 80, 40, 30, 50, 70};
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++){
            min = Math.min(min, numbers[i]);
        }

        System.out.println("Min element is " + min);
    }
}
