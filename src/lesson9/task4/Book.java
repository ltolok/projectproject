package lesson9.task4;

public class Book {
    private String name;
    private String author;

    public Book(String name,String author) {
        this.name = name;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {

        return author;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }
}
