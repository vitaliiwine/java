package streams;

/*
Считываем из файла и закидываем в другой тектовый файл
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class task3 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("C:\\Users\\wine\\Documents\\notes.txt");
             FileOutputStream fos = new FileOutputStream("C:\\Users\\wine\\Documents\\new notes.txt")) {
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer, 0, buffer.length);

            for (int i = 0; i < buffer.length; i++) {
                buffer[i] =+ 1; }
            fos.write(buffer, 0, buffer.length);


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Text has been successfully rewritten");
    }
}
