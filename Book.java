public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean available;

    public Book(String title, String author, int pageCount, boolean available) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.available = available;
    }
    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pageCount);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
    public void borrow() {
        if (available) {
            available = false;
            System.out.println("\"" + title + "\" has been borrowed");
        } else {
            System.out.println("\"" + title + "\" is not available right now");
        }
    }
    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("\"" + title + "\" has been returned. Thank you!");
        } else {
            System.out.println("\"" + title + "\" was not borrowed");
        }
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }
}
