package lesson19;

import java.io.*;

public class ViewDirectory {
    public static void main(String[] args) {
        viewDir("src");
    }

    public static void viewDir(String s) {
        File f = new File(s);
        if (!f.exists()) {
            System.out.println("\nNot found: " + s);
            return;
        }
        String[] sDirList = f.list();
        int i;
        for (i = 0; i < sDirList.length; i++) {
            File f1 = new File(
                    s + File.separator + sDirList[i]);
            if (f1.isFile())
                System.out.println(sDirList[i]);
            else
                System.out.println(
                        "-dir- " + sDirList[i]);
        }
    }
}
