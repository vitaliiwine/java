package arrays1;

public class example1 {
    public static void main(String[] args) {
        int[][] myArray = new int [2][2];

        myArray[0][0] = 1;
        myArray[0][1] = 2;
        myArray[1][0] = 3;
        myArray[1][1] = 4;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (myArray[i][j] < min)
                    min = myArray[i][j];
                System.out.print(myArray[i][j] + "\t");

            }
            System.out.println();
            
        }
        System.out.println("Min element in an array is " + min);

        int [][] data = new int [5][7];
    }


}
