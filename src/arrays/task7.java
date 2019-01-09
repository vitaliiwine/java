package arrays;
//Проверяем, что все элементы равны
public class task7 {
    public static void main(String[] args) {
        int [] arr = {4, 4, 4, 4};
        System.out.println(checkEq(arr));
    }

    static boolean checkEq(int[] data){

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]){
                    return false;
            }
        }
        return true;
    }
}
