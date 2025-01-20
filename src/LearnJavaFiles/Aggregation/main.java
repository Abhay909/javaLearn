package LearnJavaFiles.Aggregation;

public class main {

    public static void main(String[] args) {

        // Aggregation = Represents a "has-a" relationship between objects.
        //               One object contains another object as part of its structure,
        //               but the contained object/s can exist independently.

        Book book1 = new Book("The Lord of the rings", 324);
        Book book2 = new Book("Kid Lawyer", 432);
        Book book3 = new Book("Lion King", 212);

        Book[] books = {book1, book2, book3};

        Library library = new Library("LAPL", 1897, books);
        library.displayInfo();





    }

}
