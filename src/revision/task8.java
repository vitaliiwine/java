package revision;

/*
Выводим три максимальных числа из массива
 */

public class task8 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 10, 2, 12, 46};
        sort(arr);
        System.out.println("The highests: " + arr[0] + " "
                + arr[1] + " " + arr[2]);
    }

    static void sort(int[] data) {
        int temp;
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
