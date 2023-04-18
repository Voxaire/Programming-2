package inClass.CA5;

class library{
    String [] books;
    int noOfbooks;

    library(){
        this.books = new String[100];
        this.noOfbooks = 0;
    }
    // Method 1 : Add the book as string in to the array
    void addBooks(String book){
        this.books[noOfbooks] = book;
        noOfbooks++;
        System.out.println(book + " has been added");
    }
    // Method 2: Show all avaliable books

    void showAllavaliable(){
        // For each loop -> i = book to till the size of the array
        System.out.println("Avaliable Books are : ");
        for (String book : this.books){
            if (book == null){
                continue; // We will replace it with continue .......
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book){
        for(int i = 0; i < this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued !!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("The book does not exists !!!");
    }

    void returnBook(String book){
        addBooks(book);
    }
}

public class Main {
    public static void main(String[] args) {
        library gswLib = new library(); // Object
        gswLib.addBooks("Think and grow rich");
        gswLib.addBooks("Algorithms");
        gswLib.addBooks("C++");
        gswLib.addBooks("Java");
        gswLib.showAllavaliable();

        gswLib.issueBook("C++");
        gswLib.showAllavaliable();
        gswLib.returnBook("C++");
        gswLib.showAllavaliable();
    }
}
