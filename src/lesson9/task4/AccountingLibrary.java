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
            LibraryUser[] user = new LibraryUser[k];
            for (int i = 0; i < k; i++) {
                System.out.println("ФИО пользователя: " + (i + 1));
                Scanner sc1 = new Scanner(System.in);
                String s1 = sc1.nextLine();
                System.out.println("Номер читательского билета ");
                Scanner sc2 = new Scanner(System.in);
                int n = sc2.nextInt();
                System.out.println("Факультет ");
                Scanner sc3 = new Scanner(System.in);
                String s3 = sc1.nextLine();
                System.out.println("Дата рождения ");
                Scanner sc4 = new Scanner(System.in);
                String s4 = sc1.nextLine();
                System.out.println("Телефон ");
                Scanner sc5 = new Scanner(System.in);
                String s5 = sc1.nextLine();
                user[i] = new LibraryUser(s1, n, s3, s4, s5);
            }
            System.out.println("          Список читателей библиотеки:");
            System.out.println("          ФИО                № чит.билета   Факультет    Дата рождения     Телефон");

            for (LibraryUser libraryUser : user) {
                int j = 0;
                System.out.printf("%n%d  %-30s%-10s%-15s%-15s%-15s", ++j, libraryUser.getName(), libraryUser.getTicketNumber(), libraryUser.getFaculty(), libraryUser.getBirthday(), libraryUser.getPhone());
            }
            System.out.printf("%n");
            user[0].takeBook();
            user[0].returnBook();

        } else {
            System.out.println("Вы ввели не целое число");
            return;
        }
    }

    void takeBook(int k) {
        System.out.println(this.toString() + "   взял " + k + "   книг");
    }

    void returnBook(int k) {
        System.out.println(this.toString() + "   вернул" + k + "   книг");
    }
}
