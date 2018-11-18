package arrays;

public class example2 {
    public static void main(String[] args) {
        int [] smallarray = {1, -13, 2, -9, 99};
        int closetozero = smallarray[0];
        boolean resclose = true;
        for (int i = 0; i < smallarray.length; i++) {
            if (smallarray[i] == 0 || Math.abs(smallarray[i]) <= Math.abs(closetozero)){
                if (closetozero == -smallarray[i])
                    resclose = false;
                closetozero = smallarray[i];
            }



        }
        if (!resclose)
        System.out.println("Closest to zero is " + closetozero + " or " + -closetozero);
        else System.out.println("Closest to zero is " + closetozero);
    }
}
