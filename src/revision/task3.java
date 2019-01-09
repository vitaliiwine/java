package revision;

/*
Считаем сумму элементов после 1
 */

public class task3 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 8, 10};
        int summ = 0;
        boolean temp = false;

        for (int i = 0; i < arr.length; i++) {
            if (!temp && arr[i] == 1) {
                temp = true;
                continue;
            }
            else if (temp)
                summ += arr[i];
        }
        System.out.println("Summ after 1 is " + summ);
    }
}
