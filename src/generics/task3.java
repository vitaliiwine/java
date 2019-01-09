package generics;

// Создать функцию, в которую передается логическое, либо целочисленное
// значение, после чего распознается тип переданных данных. Если было передано
// логическое значение false, либо целочисленное значение 0, функция возвращает
// строку “Верно”, во всех остальных случаях возвращается строка “Неверно”.

public class task3<T> {
    public static void main(String[] args) {
        System.out.println(func(true));

    }

    public static <T> String func(T param) {
        if (param instanceof Integer && (Integer) param == 0 || param instanceof Boolean && param.equals(false))
            return "Верно";
        else
            return "Неверно";
    }
}

