package arrays;
//Заполняем трехмерный массив единицами '1'


public class task6 {
    public static void main(String[] args) {
        int [][][] array = new int [5][5][5];
        fillarray(array);
    }

    public static void fillarray(int [][][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                for (int k = 0; k < array[j].length; k++){
                    array[i][j][k] = 1;
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();

            }
            System.out.println();

        }
    }
}
