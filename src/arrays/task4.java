package arrays;
//Считаем сумму элементов после 1

public class task4 {
    public static void main(String[] args) {
        int [] numbers = {4, 6, 1, 5, 5};
        int summ = 0;
        int tmp = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == 1){
                tmp = i;
                break;
            }
        }

        for (int j = tmp + 1; j < numbers.length; j++){
            summ += numbers[j];
        }

        System.out.println("Summ after 1 is " + summ);
    }
}
