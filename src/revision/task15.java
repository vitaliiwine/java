package revision;

/*
Нормировать все элементы в одномерном массиве, каждый из
которых больше, либо равен нулю, относительно их суммы
 */

public class task15 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 10, 14, 20};
        System.out.println("Sum is " + sumOfElements(arr));
        printArray(arr);
        System.out.println();
        standardizeElements(arr);
        printArray(arr);

    }

    static int sumOfElements(int[] data){
        int sum = 0;
        for (int i = 0; i <data.length ; i++) {
            sum += data[i];
        }
        return sum;
    }

    static int standardizeElements(int[] data){
        int sum = sumOfElements(data);
        for (int i = 0; i < data.length; i++) {
            data[i] /= sum;
        }
        return sum;
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length -1)
                System.out.print(arr[i] + ", ");
            else
                System.out.print(arr[i] + ".");

        }
    }
}
