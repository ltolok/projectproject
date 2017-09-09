package lesson19;

        import java.io.FileInputStream;
        import java.io.FileOutputStream;
        import java.io.IOException;

public class FileCopy {
    public static void main(String args[]) {

        try (FileInputStream fileIn = new FileInputStream("src\\io\\file.txt");
             FileOutputStream fileOut =
                     new FileOutputStream("src\\io\\copied_file.txt")) {
            int a;
            // Копирование содержимого файла file.txt
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a); // Чтение содержимого файла file.txt и запись в файл copied_file.txt
            }
        } catch (IOException e) {
            System.out.println("Файл скопирован");
            //e.printStackTrace();
        }
    }
}