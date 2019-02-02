package streams;

/*
Записать строку в текстовый файл
 */

import java.io.FileOutputStream;
import java.io.IOException;

public class task1 {
    public static void main(String[] args) {
        String text = "Hello World!";
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\wine\\Documents\\notes.txt")) {
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("The file has been written");

    }

}
