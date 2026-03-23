public class Reader {
    private String firstName;
    private String lastName;
    private String cardNumber;
    private int borrowedCount;

    public Reader(String firstName, String lastName, String cardNumber, int borrowedCount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.borrowedCount = borrowedCount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void printData() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Card number: " + cardNumber);
        System.out.println("Borrowed books: " + borrowedCount);
    }

    public void increaseBorrowedCount() {
        borrowedCount++;
    }

    public void decreaseBorrowedCount() {
        if (borrowedCount > 0) {
            borrowedCount--;
        }
    }
}
