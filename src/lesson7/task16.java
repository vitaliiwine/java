package lesson7;
//Определяем количество различных элементов в массиве

public class task16 {
    public static void main(String[] args) {
        int [] arr = {4, 5, 6, 2, 2, 2, 9};
        System.out.println(checkDifferentNums(arr));

    }

    static int checkDifferentNums(int [] data){
        int temp = 1;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]){
                temp++;
            }

        }
        return temp;

    }
}
