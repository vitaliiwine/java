package revision;

/*
Находим минимальный элемент на главной диагонали квадратной матрицы
 */

public class task4 {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}
        };

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i][i]);
        }
        System.out.println("Min element in main diagonal is " + min);
    }
}
