package lesson11;

public class PrintableDemo {

    public static void main(String[] args) {
        Printable[] bookshop = new Printable[3];
        bookshop[0] = new Book();
        bookshop[1] = new Book();
        bookshop[2] = new Magazine();

        for (Printable printable : bookshop)
            printable.print();

        printMagazines(bookshop);
        printBooks(bookshop);
    }

    private static void printMagazines(Printable[] bookshop) {
        for (Printable printable : bookshop) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }

    private static void printBooks(Printable[] bookshop) {
        for (Printable printable : bookshop) {
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }
}
