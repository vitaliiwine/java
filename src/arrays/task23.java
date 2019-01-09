package arrays;
//Нормируем все элементы квадратного двумерного массива относительно макс элемента

public class task23 {
    public static void main(String[] args) {
        double [][] arr = {{3, 4},
                        {5, 5}
        };
        standardize(arr);
        printArray(arr);
    }

    static double max(double [][] data){
        double max = Double.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > max){
                    max = data[i][j];
                }
            }
        }
        return max;
    }

    static double standardize(double [][] data){
        double res = max(data);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] /= res;
            }
        }
        return res;
    }

    static void printArray(double [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
}
