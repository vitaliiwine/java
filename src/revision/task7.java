package revision;

/*
Проверяем, если все элементы расположены по возрастанию
 */
public class task7 {
    public static void main(String[] args) {
        int [] arr = {2, 5, 6, 8, 2, 12};
        System.out.println(check(arr));
    }

    static boolean check(int[] data){
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] > data[i + 1]){
                return false;
            }
        }
        return true;
    }
}
