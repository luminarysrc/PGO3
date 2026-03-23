public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean available;
    private int timesBorrowed;

    public Book(String title, String author, int pageCount, boolean available) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.available = available;
        this.timesBorrowed = 0;
    }

    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pageCount);
        System.out.println("Available: " + (available ? "Yes" : "No"));
        System.out.println("Times Borrowed: " + timesBorrowed);
    }

    public void borrow() {
        if (available) {
            available = false;
            timesBorrowed++;
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

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getTimesBorrowed() {
        return timesBorrowed;
    }
}
