package lesson9.task4;

import java.util.Scanner;

public class AccountingLibrary extends LibraryUser {
    private int numberTook;
    private int numberReturn;

    public AccountingLibrary(String name, int ticketNumber, String faculty, String birthday, String phone, int numberTook, int numberReturn) {
        super(name, ticketNumber, faculty, birthday, phone);
        this.numberTook = numberTook;
        this.numberTook = numberReturn;
    }

    public void setNumberReturn(int numberReturn) {
        this.numberReturn = numberReturn;
    }

    public int getNumberReturn() {

        return numberReturn;
    }

    public void setNumberTook(int numberTook) {

        this.numberTook = numberTook;
    }

    public int getNumberTook() {

        return numberTook;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество пользователей библиотеки: ");
        if (sc.hasNextInt()) {
            int k = sc.nextInt();
            AccountingLibrary[] user = new AccountingLibrary[k];
            for (int i = 0; i < k; i++) {
                System.out.println("ФИО пользователя: " + (i + 1));
                String s1 = new Scanner(System.in).nextLine();
                System.out.println("Номер читательского билета ");
                int n = new Scanner(System.in).nextInt();
                System.out.println("Факультет ");
                String s3 = new Scanner(System.in).nextLine();
                System.out.println("Дата рождения ");
                String s4 = new Scanner(System.in).nextLine();
                System.out.println("Телефон ");
                String s5 = new Scanner(System.in).nextLine();
                user[i] = new AccountingLibrary(s1, n, s3, s4, s5, 0, 0);
            }
            System.out.println("          Список читателей библиотеки:");
            System.out.println("          ФИО                № чит.билета   Факультет    Дата рождения     Телефон");
            int j = 0;
            for (AccountingLibrary libraryUser : user) {
                System.out.printf("%n%d  %-30s%-10s%-15s%-15s%-15s", ++j, libraryUser.getName(), libraryUser.getTicketNumber(), libraryUser.getFaculty(), libraryUser.getBirthday(), libraryUser.getPhone());
            }
            System.out.printf("%n");
            user[0].takeBook(3);
            user[0].takeBook("История Древнего мира", "История средних веков", "История Украины");
            user[1].takeBook(new Book("Математический анализ", "Александров А.А."), new Book("Функциональный анализ", "Иванов А.А."));
            user[0].returnBook(user[0].getNumberTook());
            user[0].returnBook("История Древнего мира", "История средних веков", "История Украины");
            user[1].returnBook(new Book("Математический анализ", "Александров А.А."), new Book("Функциональный анализ", "Иванов А.А."));
        } else {
            System.out.println("Вы ввели не целое число");
            return;
        }
    }

    public void takeBook(int k) {
        this.setNumberTook(k);
        System.out.println(this.getName() + "   взял " + k + "   книг");
    }

    public void takeBook(String... book) {
        System.out.println(this.getName() + " взял следующие книги:  ");
        for (int i = 0; i < book.length; i++) {
            System.out.println(i + 1 + ".  " + book[i]);
        }
        this.setNumberReturn(book.length);
        System.out.println("Всего:  " + this.getNumberReturn());
    }

    public void takeBook(Book... books) {
        System.out.println(this.getName() + " взял следующие книги:  ");
        for (int i = 0; i < books.length; i++) {
            System.out.println(i + 1 + ".  " + books[i].toString());
        }
        this.setNumberTook(books.length);
        System.out.println("Всего:  " + books.length);
    }

    public void returnBook(int k) {
        this.setNumberReturn(k);
        System.out.println(
                this.getName() + "   вернул " + k + "   книг");
    }

    public void returnBook(String... book) {
        System.out.println(this.getName() + " вернул следующие книги:  ");
        for (int i = 0; i < book.length; i++) {
            System.out.println(i + 1 + ".  " + book[i]);
        }
        this.setNumberReturn(book.length);
        System.out.println("Всего:  " + this.getNumberReturn());
    }

    public void returnBook(Book... books) {
        System.out.println(this.getName() + " вернул следующие книги:  ");
        for (int i = 0; i < books.length; i++) {
            System.out.println(i + 1 + ".  " + books[i]);
        }
        this.setNumberReturn(books.length);
        System.out.println("Всего:  " + this.getNumberReturn());
    }
}
