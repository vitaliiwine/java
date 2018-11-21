package lesson7;
//Находим кол-во элементов равных нулю

public class task17 {
    public static void main(String[] args) {
        int [] arr = {3, 5, 0, 0, 0, 9};
        System.out.println("Numbers that equal zero " + zeroNums(arr));
    }

    static int zeroNums(int [] data){
        int tmp = 0;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == 0){
                tmp++;
            }
        }
        return tmp;
    }
}
