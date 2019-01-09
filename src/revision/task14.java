package revision;

/*
Находим кол-во элементов равных нулю
 */

public class task14 {
    public static void main(String[] args) {
        int[] arr = {4, 0, 10, 0, 20, 50, 0};
        System.out.println("Zero numbers: " + zeroNums(arr));

    }

    static int zeroNums(int[] data){
        int tmp = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0){
                tmp++;
            }
        }
        return tmp;
    }
}
