package lesson9.task4;

public class LibraryUser {
    private String name;
    private int ticketNumber;
    private String faculty;
    private String birthday;
    private String phone;

    public LibraryUser(String name, int ticketNumber, String faculty, String birthday, String phone) {
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {

        return phone;
    }

    public void setBirthday(String birthday) {

        this.birthday = birthday;
    }

    public String getBirthday() {

        return birthday;
    }

    public void setFaculty(String faculty) {

        this.faculty = faculty;
    }

    public String getFaculty() {

        return faculty;
    }

    public void setTicketNumber(int ticketNumber) {

        this.ticketNumber = ticketNumber;
    }

    public int getTicketNumber() {

        return ticketNumber;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "name='" + name + '\'' +
                '}';
    }

    public void takeBook() {
      System.out.println(toString() + "взял книги в библиотеке");
    }

    public void returnBook() {System.out.println(toString() + "вернул книги в библиотеку");
   }
}
