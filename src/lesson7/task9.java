package lesson7;
//Проверяем, если все элементы расположены по возрастанию

public class task9 {
    public static void main(String[] args) {
        int [] arr = {4, 6, 7, 8, 9};
        System.out.println(checkNumbers(arr));
    }

    static boolean checkNumbers (int [] data){
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] > data[i + 1]){
                return false;
            }
        }
        return true;
    }
}
