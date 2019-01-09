package revision;

/*
Сумма элементов двумерного массива
 */

public class task16 {
    public static void main(String[] args) {
        int [][] arr = {{2, 4, 8}, {10, 12, 14}};
        sumOfElements(arr);
    }

    static void sumOfElements(int[][] data){
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j];
            }
        }
        System.out.println("Sum is " + sum);
    }
}
