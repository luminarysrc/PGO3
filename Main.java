public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Silent Horizon", "Elena Marlowe", 352, true);
        Book book2 = new Book("Echoes of Tomorrow", "Daniel Korr", 464, true);
        Book book3 = new Book("Shadows Beneath the Sky", "Liam Ainsworth", 412, false);

        System.out.println("Library Books");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

        System.out.println("Borrowing");
        book1.borrow();
        book2.borrow();
        book3.borrow();

        System.out.println("Returning");
        book1.returnBook();
        book2.returnBook();
        book3.returnBook();

        System.out.println("\n--- Readers ---");
        Reader reader1 = new Reader("John", "Doe", "RD1001", 0);
        Reader reader2 = new Reader("Jane", "Smith", "RD1002", 2);

        reader1.printData();
        reader2.printData();

        reader1.increaseBorrowedCount();
        reader2.decreaseBorrowedCount();

        System.out.println("\nAfter borrowing and returning:");
        reader1.printData();
        reader2.printData();

        System.out.println("\n--- Library ---");
        Library library = new Library(5);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.printAvailableBooks();

        System.out.println("\nAvailable books count: " + library.countAvailableBooks());

        System.out.println("\nFinding book by title 'Echoes of Tomorrow':");
        Book foundBook = library.findBookByTitle("Echoes of Tomorrow");
        if (foundBook != null) {
            foundBook.printInfo();
        } else {
            System.out.println("Book not found.");
        }
    }
}
