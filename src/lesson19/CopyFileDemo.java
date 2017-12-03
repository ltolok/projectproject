package lesson19;

import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src\\file.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\buffWriter.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


