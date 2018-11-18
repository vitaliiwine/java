package arrays1;

public class example5 {
    public static void main(String[] args) {
        double [] myArray = {22, 33, 44, 55, 66};
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double total = 0;
        for (int i = 0; i < myArray.length; i++) {
            max = Math.max(max, myArray[i]);
        }
        for (int i = 0; i < myArray.length ; i++) {
            min = Math.min(min, myArray[i]);
        }
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];

        }
        System.out.println("Max element in an array is " + max);
        System.out.println("Min element of an array is " + min);
        System.out.println("Total of elements is " + total);
        System.out.print("Printing array elements: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
    }




}
