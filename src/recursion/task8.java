package recursion;

/*
Дано слово, состоящее только из строчных латинских букв. Проверьте, является ли это слово
палиндромом. Выведите YES или NO.
При решении этой задачи нельзя пользоваться циклами
 */

public class task8 {
    public static void main(String[] args) {
        String string = "HeeH";
        func(string);
    }

    public static void func(String str) {
        if (str.charAt(0) == str.charAt(str.length() - 1) &&
                str.length() > 2) {
            func(str.substring(1, str.length() - 1));
        } else if (str.charAt(0) == str.charAt(str.length() - 1) &&
                str.length() <= 2) {
            System.out.println("OH YEEAAH");
        } else
            System.out.println("FUCK NO");
    }
}
