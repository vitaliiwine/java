package arrays;
//Найти сумму элементов двумерного массива

public class task20 {
    public static void main(String[] args) {
        int [][] arr = {{5, 6}, {7, 8,}};
        summOfElements(arr);

    }

    static void summOfElements(int [][] data){
        int summ = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                summ += data[i][j];
            }
        }
        System.out.println("Sum is " + summ);
    }
}
