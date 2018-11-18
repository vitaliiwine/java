package methods;

public class Man {
    public static void main(String[] args) {
        Man man1 = new Man();
        man1.dnaCode = 12345;

        Man man2 = new Man();
        man2.dnaCode = 12345;

        System.out.println(man1.equals(man2));
    }

    int dnaCode;
    public boolean equals (Man man){
        return this.dnaCode == man.dnaCode;
    }
}
