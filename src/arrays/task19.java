package arrays;

//Нормировать все элементы в одномерном массиве, каждый из
//которых больше, либо равен нулю, относительно их суммы
public class task19 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, 10};
        System.out.println("Sum is " + summOfElements(arr));
        printArray(arr);
        System.out.println();
        standardizeElements(arr);
        printArray(arr);

    }

    static int summOfElements(int[] data) {
        int summ = 0;
        for (int i = 0; i < data.length; i++) {
            summ += data[i];
        }
        return summ;
    }

    static void standardizeElements(int[] data) {
        int summ = summOfElements(data);
        for (int i = 0; i < data.length; i++) {
            data[i] /= summ;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1)
                System.out.print(arr[i] + ", ");
            else
                System.out.print(arr[i] + ".");
        }
    }
}
