package revision;

/*
Считаем количество различных элементов
 */

public class task13 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8};
        System.out.println(checkDiffNums(arr));
    }

    static int checkDiffNums(int[] data){
        int tmp = 1;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]){
                tmp++;
            }
        }
        return tmp;
    }
}
