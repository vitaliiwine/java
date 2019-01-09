package enums;
// Создать класс BookOfMeeting. В нём создать массив из 365 дней.
// Заполнить каждый день значением дня недели и месяца и задать часы и минуты встречи равные -1.
// Это означает, что в этот день встречи нет.
// - Добавить в класс функцию добавить встречу в календарь. Она должна проверять введенные даты
// и если в этот день нет встреч, то устанавливать заданное время начала встречи.
// - Добавить в класс функцию показать все имеющиеся встречи, которая выводит на экран все дни со
// временем встреч. Дни в которые встреч нет печатать не нужно.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class task1 {
    public static void main(String[] args) throws IOException {
        BookOfMeeting bookOfMeeting = new BookOfMeeting();
        bookOfMeeting.print();

    }

}

class BookOfMeeting{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    DateOfMeet[] dateOfMeets = new DateOfMeet[365];

    void print(){

        for (int i = 0; i < dateOfMeets.length ; i++) {
            dateOfMeets[i] = new DateOfMeet();
            dateOfMeets[i].show();
        }
    }

    private void fillDates() throws IOException{
        MonthOfTheYear[] months = MonthOfTheYear.values();
        DayOfTheWeek[] days = DayOfTheWeek.values();
        int countOfDoW = 0;
        int countOfDay = 0;
        MonthOfTheYear currentMonth;
        for (int i = 0; i < 12; i++) {
            currentMonth = months[i];
            for (int j = 0; j < currentMonth.days; j++) {
                dateOfMeets[countOfDay] = new DateOfMeet();
                dateOfMeets[countOfDay].setMin(Integer.parseInt(reader.readLine()));
            }
        }
    }
}

class DateOfMeet {
    private DayOfTheWeek day;
    private MonthOfTheYear month;
    private String name;
    private String descr;
    private int hour;
    private int min;
    private int date;
    private Random random;


    public DateOfMeet(DayOfTheWeek day, MonthOfTheYear month, String name,
                      String descr, int hour, int min, int date) {
        this.day = day;
        this.month = month;
        this.name = name;
        this.descr = descr;
        this.hour = hour;
        this.min = min;
        this.date = date;
    }

    public DateOfMeet(){
        DayOfTheWeek[] daysOfTheWeek = DayOfTheWeek.values();
        MonthOfTheYear[] months = MonthOfTheYear.values();
        random = new Random();
        day = daysOfTheWeek[random.nextInt(daysOfTheWeek.length)];
        month = months[random.nextInt(months.length)];
        name = Generator.getShortWord();
        descr = Generator.getLongWord();
        hour = random.nextInt(24);
        min = random.nextInt(60);
        date = random.nextInt(31);
    }

    public void setDay(DayOfTheWeek day) { this.day = day; }

    public void setMonth(MonthOfTheYear month) { this.month = month; }

    public void setName(String name) { this.name = name; }

    public void setDescr(String descr) { this.descr = descr; }

    public void setHour(int hour) { this.hour = hour; }

    public void setMin(int min) { this.min = min; }

    public void setDate(int date) { this.date = date; }

    public void show(){
        System.out.println("Date: " + month + " " + date + " " + day);
        System.out.println("Time: " + hour + " " + min);
        System.out.println("Name: " + name);
        System.out.println("Description " + descr);
    }
}

enum DayOfTheWeek{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

enum MonthOfTheYear{
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(30),
    SEPTEMBER(31),
    OCTOBER(30),
    NOVEMBER(31),
    DECEMBER(30);

    int days;

    MonthOfTheYear(int days) { this.days = days; }
}

    class Generator{
    private static Random random = new Random();
    static  String[] firstWord = {"A chance to get some coffee together", "Only 4 two of you", "Awesome two", "Keep you high", "Never get hungry",
            "Fat Rabbit or Skinny Rat?", "Hot! Hot! Hot!", "Sad story", "Selfish pride never ride"};
    static String[] secondWord = {"French Boulevard", "Smoke Screen", "Puff-Puff", "OG Kush", "D8 4 2",
    "Honey Moon", "Face2Face", "Private Only", "SomeCoffee", "CouplePups"};

    static String getShortWord(){return secondWord[random.nextInt(secondWord.length)];}

    static String getLongWord(){return firstWord[random.nextInt(firstWord.length)];}
}




