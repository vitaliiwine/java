package lesson7;
//Находим максимальный элемент в массиве

public class task14 {
    public static void main(String[] args) {
        int [] arr = {4, 6, 9, 33};
        int max = Integer.MIN_VALUE;
        findMax(arr, max);

    }

    static void findMax(int [] data, int max){
        for (int i = 0; i < data.length; i++){
            max = Math.max(max, data[i]);
        }
        System.out.println("Max is " + max);
    }
}
