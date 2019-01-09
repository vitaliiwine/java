package revision;

/*
Проверяем все ли элементы равны
 */

public class task5 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 2};
        if (checkEq(arr))
            System.out.println("Elements are the same");
        else
            System.out.println("Elements aren't the same");

    }

    static boolean checkEq(int[] data) {
        boolean flag = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
