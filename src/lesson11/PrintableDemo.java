package lesson11;

public class PrintableDemo {

    public static void main(String[] args) {
        Printable[] magazine = new Printable[3];
        magazine[0] = new Book();
        magazine[1] = new Book();
        magazine[2] = new Magazine();

        for (Printable printable : magazine)
            printable.print();

        printMagazines(magazine);
        printBooks(magazine);
    }

    private static void printMagazines(Printable[] magazine) {
        for (Printable printable : magazine) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }

    private static void printBooks(Printable[] magazine) {
        for (Printable printable : magazine) {
            if (printable instanceof Book) {

                printable.print();
            }
        }
    }
}
