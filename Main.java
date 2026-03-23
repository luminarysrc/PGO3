public class Main {
    public static void main(String[] args) {
        System.out.println("=== Library Scenario ===");
        
        Library library = new Library(10);
        
        Book book1 = new Book("The Silent Horizon", "Elena Marlowe", 352, true);
        Book book2 = new Book("Echoes of Tomorrow", "Daniel Korr", 464, true);
        Book book3 = new Book("Shadows Beneath the Sky", "Liam Ainsworth", 412, true);
        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        
        Reader reader1 = new Reader("John", "Doe", "RD1001", 0);
        
        System.out.println("\n--- Step 1: Initial state of Library ---");
        library.printAvailableBooks();
        
        System.out.println("\n--- Step 2: Borrowing a book ---");
        library.borrowBook("Echoes of Tomorrow", reader1);
        
        System.out.println("\n--- Step 3: Library state after borrowing ---");
        library.printAvailableBooks();
        
        System.out.println("\n--- Step 4: Optional Extension - Search by Author ---");
        library.searchBooksByAuthor("Elena Marlowe");
        
        System.out.println("\n--- Step 5: Returning the book ---");
        library.returnBook("Echoes of Tomorrow", reader1);
        
        System.out.println("\n--- Step 6: Final state of Reader and Book ---");
        reader1.printData();
        book2.printInfo();
    }
}
