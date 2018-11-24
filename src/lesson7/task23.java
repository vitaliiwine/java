package lesson7;
//Нормировать все элементы квадратного двумерного массива относительно макс элемента

public class task23 {
    public static void main(String[] args) {
        int [][] arr = {{3, 4},
                        {5, 5}
        };
        standardize(arr);
        printArray(arr);
    }

    static int max(int [][] data){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > max){
                    max = data[i][j];
                }
            }
        }
        return max;
    }

    static int standardize(int [][] data){
        int res = max(data);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] /= res;
            }
        }
        return res;
    }

    static void printArray(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
}
