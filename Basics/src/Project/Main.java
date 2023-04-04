package Project;
class library {
    String [] books;
    int noOfbooks;
    library() {
        this.books = new String[100];
        this.noOfbooks = 0;
    }
    //Method 1: Add the Book as string into the Array
    void addBooks(String book){
        this.books[noOfbooks] = book;
        noOfbooks++;
        System.out.println(book + " has been added");

    }
    //Method 2: Show all available books
    void showAllavailable(){
        System.out.println("The available books are: ");
        for (String book: this.books) {
            if (book == null) {
                break;
            }
                System.out.println("* ");
        }
    }
    void issueBook(String book){
        for(int i = 0; i < this.books.length; i++) {
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("The book does not exist.");
    }
    void returnBook(String book){
        addBooks(book);

    }
}
public class Main {
    public static void main(String[] args) {
        library gswLib = new library();
        gswLib.addBooks("Think and grow rich");
        gswLib.addBooks("Algorithms");
        gswLib.addBooks("C++");
        gswLib.addBooks("Java");
        gswLib.showAllavailable();
        gswLib.issueBook("C++");
        gswLib.showAllavailable();
        gswLib.returnBook("C++");
        gswLib.showAllavailable();
    }

}
