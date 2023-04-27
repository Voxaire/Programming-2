package AS6;

import java.util.ArrayList;

class Book {
    String author;
    String subject;

    public Book(String author, String subject) {
        this.author = author;
        this.subject = subject;
    }
    public String getAuthor() {
        return author;
    }
    public String getSubject() {
        return subject;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
}

public class Q4 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();

        Book book1 = new Book("Zed A. Shaw", "Python");
        Book book2 = new Book("Herbert Schildt", "Java");
        Book book3 = new Book("David Powers", "PHP");

        books.add(book1);
        books.add(book2);
        books.add(book3);

        for (Book book : books) {
            System.out.println("Author: " + book.getAuthor() + ", Subject: " + book.getSubject());
        }
    }
}
