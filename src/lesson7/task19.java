package lesson7;
//Нормировать все элементы в одномерном массиве, каждый из
//которых больше, либо равен нулю, относительно их суммы
public class task19 {
    public static void main(String[] args) {
        int [] arr = {4, 5, 6, 7, 8, 9, 10};
        int summ = 0;
        System.out.println("Sum is " + summOfElements(arr, summ));
        standardizeElements(arr);

    }

    static int summOfElements(int [] data, int summ){
        for (int i = 0; i < data.length; i++) {
            summ += data[i];
        }
        return summ;
    }

    static int[] standardizeElements(int [] data){
        int summ = data[0];
        int summ2 = 0;
        for (int i = 0; i < data.length - 1; i++) {
            data[i] = data[i] / summ;
            summ2 = data[i];
        }
        System.out.println("Standardizing " + summ2);
        return data;
    }
}
