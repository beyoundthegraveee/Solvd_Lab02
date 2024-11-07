public class Library {

    private int amountOfBooks;

    private int amountOfComputers;

    public Library(int amountOfBooks, int amountOfComputers) {
        this.amountOfBooks = amountOfBooks;
        this.amountOfComputers = amountOfComputers;
    }

    public int getAmountOfBooks() {
        return amountOfBooks;
    }

    public void setAmountOfBooks(int amountOfBooks) {
        this.amountOfBooks = amountOfBooks;
    }

    public int getAmountOfComputers() {
        return amountOfComputers;
    }

    public void setAmountOfComputers(int amountOfComputers) {
        this.amountOfComputers = amountOfComputers;
    }
}
