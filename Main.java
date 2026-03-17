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
    }
}
