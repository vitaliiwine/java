package arrays;
//Находим сумму положительных чисел

public class task8 {
    public static void main(String[] args) {
        int [] arr = {4, 4, 4, 4};
        printarray(arr, summ(arr));

    }

    static int summ(int [] data){
        int sumelements = 0;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] % 2 == 0){
                sumelements += data[i];
            }
        }
        return sumelements;
    }

    static void printarray (int [] arr, int sumelements){
        System.out.println("Sum of the positive elements is " + sumelements);
    }
}
