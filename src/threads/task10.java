package threads;


import java.util.Date;

public class task10 {
    public static void main(String[] args) throws Exception{
        Date yearsStartTime = new Date();
        yearsStartTime.setHours(0);
        yearsStartTime.setMinutes(0);
        yearsStartTime.setSeconds(0);

        yearsStartTime.setDate(1);
        yearsStartTime.setMonth(0);

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearsStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int) (msTimeDistance/msDay);
        System.out.println("Days after the year started: " + dayCount);


    }
}
