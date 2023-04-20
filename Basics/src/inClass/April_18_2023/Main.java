package inClass.April_18_2023;

import java.util.ArrayList;

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    Book(int id,String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<Book>();
        Book b1 = new Book(1, "Let Him Cook", "Father Time", "Abstract Concept", 9);
        Book b2 = new Book(2, "Do Indians Really Deserve Rights?", "Mother Nature", "Abstract Concept", 5);
        Book b3 = new Book(3,"Fornite is a Decent Game", "Voxaire", "Broke Men", 9001);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        for(Book b:list) {
            System.out.println(b.id+" "+ b.name+" "+ b.author+" "+b.publisher+" "+b.quantity);
        }
    }

}
