package lesson7;
//Находим минимальный элемент на главной диагонали квадратной матрицы

public class task5 {
    public static void main(String[] args) {
        int [][] array = {
                {8, 6, 7},
                {4, 9, 9},
                {1, 8, 2}
        };
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++){
            min = Math.min(min, array[i][i]);
        }
        System.out.println("Min element in main diagonal " + min);
    }
}
