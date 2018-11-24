package lesson7;
//Находим среднее арифметическое двумерного массива

public class task21 {
    public static void main(String[] args) {
        int [][] arr = {{3, 4, 3},{4, 5, 4}};
        System.out.println("Average of an array is " + summAndAverage(arr));
    }

    static int summAndAverage(int [][] data){
        int average = 0;
        int summ = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                summ += data[i][j];
            }
        }
        average = summ / data.length;
        return average;
    }
}
