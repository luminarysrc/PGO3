public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    public void printAvailableBooks() {
        System.out.println("Available Books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].printInfo();
                System.out.println("---");
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void searchBooksByAuthor(String author) {
        System.out.println("Searching books by author: " + author);
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                books[i].printInfo();
                System.out.println("---");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by " + author);
        }
    }

    public int countAvailableBooks() {
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                count++;
            }
        }
        return count;
    }

    public void borrowBook(String title, Reader reader) {
        Book book = findBookByTitle(title);
        if (book != null && book.isAvailable()) {
            book.borrow();
            reader.increaseBorrowedCount();
            System.out.println(reader.getFirstName() + " " + reader.getLastName() + " successfully borrowed " + title);
        } else {
            System.out.println("Book '" + title + "' is not available or does not exist.");
        }
    }

    public void returnBook(String title, Reader reader) {
        Book book = findBookByTitle(title);
        if (book != null && !book.isAvailable()) {
            book.returnBook();
            reader.decreaseBorrowedCount();
            System.out.println(reader.getFirstName() + " " + reader.getLastName() + " successfully returned " + title);
        } else {
            System.out.println("Book '" + title + "' was not borrowed or does not exist.");
        }
    }
}
