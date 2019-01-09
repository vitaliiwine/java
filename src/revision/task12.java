package revision;

/*
Проверяем если все элементы равны
 */

public class task12 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 4, 1, 8};
        checkNums(arr);
    }

    static void checkNums(int[] data){
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                System.out.println("Aren't the same");
                break;
            }
        }
    }
}
