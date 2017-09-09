package lesson19;

import java.io.*;

public class FileInputOutputStreamDemo {
    public static void main(String args[]) {
        try (OutputStream output = new FileOutputStream("src\\lesson19\\file.txt");
             InputStream input = new FileInputStream("src\\lesson19\\file.txt");
        ) {
            char c[] = {'a', 'b', 'c'};
            for (char cc : c) {
                output.write(cc); // Запись каждого символа в текстовый файл
            }
            int size = input.available();
            for (int j = 0; j < size; j++) {
                System.out.print((char) input.read() + " "); // Чтение текстового файла посимвольно
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
