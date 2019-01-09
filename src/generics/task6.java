package generics;

/*
Создать функцию, в которую передается массив логических,
целочисленных, либо вещественных значений, после чего распознается тип
данных в массиве и уже в пределах функции создается массив с полученным
типом, в который записываются переданные в функцию значения.
 */

public class task6 {
    public static void main(String[] args) {
        Integer[] data = {1, 2, 3, 1, 4, 5, 3, 7, 8, 1, 5};
        System.out.println((func(data)).getClass().getSimpleName());

    }

    public static <T> T[] func(T[] data) {

        if (data instanceof Integer[]) {
            Integer[] temp = (Integer[]) data;
            for (int i = 0; i < temp.length; i++) {
                temp[i]++;
            }
            return (T[]) temp;
        } else if (data instanceof Boolean[]) {
            Boolean[] temp = (Boolean[]) data;
            return (T[]) temp;
        } else return null;
    }
}
