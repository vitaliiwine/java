package streams;

/*
Считать строку из текстового файла
 */


import java.io.FileInputStream;
import java.io.IOException;

public class task2 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("C:\\Users\\wine\\Documents\\notes.txt")) {
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer, 0, fin.available());

            System.out.printf("File size: %d bytes \n", fin.available());
            System.out.println("File data: ");
            for (int i = 0; i < buffer.length; i++) {
                System.out.println((char) buffer[i]);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
