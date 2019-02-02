package revision;

/*
Пусть программа определит сколько можно купить быков, коров и телят,
платя за быка 10 рублей, за корову - 5 рублей, а за теленка - 50 копеек, если на 100 рублей надо
купить 100 голов скота?
 */

public class task19 {
    public static void main(String[] args) {

        for (int a = 0; a <= 100; a++) {
            for (int b = 0; b <= 100; b++) {
                for (int c = 0; c <= 100; c++) {
                    if ((((a * 10) + (b * 5) + (c * 0.5)) == 100) &&
                    (a + b + c) == 100){
                        System.out.println("Cows: " + a + "\n"
                                        + "Oxes: " + b + "\n"
                                        + "Calves: " + c);

                    }
                }
            }
        }
    }
}
