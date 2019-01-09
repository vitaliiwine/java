package arrays;
//Находим три максимальные значения в массиве

public class task10 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 2, 7, 9};
        sort(arr);
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

    }

    static void sort(int[] data) {
        int temp = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] < data[j + 1]) {
                    temp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
}
