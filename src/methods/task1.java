package methods;

public class task1 {
    public static void main(String[] args) {
        //Calculator
        System.out.println("Sum of the numbers is " + Summ(66,6));
        System.out.println("Remainder of the numbers is " + Minus(55, 5));
        System.out.println("Product of the numbers is " + Multiply(6, 6));


    }

    static int Summ(int x1, int x2){
        int res = x1 + x2;
                return res;
        }

        static int Minus(int x1, int x2) {
        int res = x1 - x2;
                return res;
        }

            static int Multiply(int x1, int x2){
            int res = x1 * x2;
                    return res;
            }

}



