package lesson7;
//Проверяем все ли элементы в массиве различны. Выводим “true” или “false”


public class task15 {
    public static void main(String[] args) {
        int [] arr = {4, 4, 4, 4};
        System.out.println(checkNums(arr));
    }

    static boolean checkNums(int [] data){
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]){
                return false;
            }
        }
        return true;
    }
}
