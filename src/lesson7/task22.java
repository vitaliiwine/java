package lesson7;
//Находим сумму элементов на главной и побочной диагоналях в квадратном двумерном массиве

public class task22 {
    public static void main(String[] args) {
        int [][] arr = {{4, 3,  8},
                        {4, 4,  8},
                        {9, 9, 10}
        };
        System.out.println("Summ of the main diagonal elements is " + summOfMainDiagonalElements(arr));
        System.out.println("Summ of the side diagonal elements is " + summOfSideDiagonalElements(arr));
    }

    static int summOfMainDiagonalElements(int [][] data) {
        int summ = 0;
        for (int i = 0; i < data.length; i++) {
            summ += data[i][i];

        }
        return summ;
    }

    static int summOfSideDiagonalElements(int [][] data){
        int summ = 0;
        for (int i = 0; i < data.length; i++) {
            summ += data[i][data[0].length - 1 - i];

        }
        return  summ;
    }
}
