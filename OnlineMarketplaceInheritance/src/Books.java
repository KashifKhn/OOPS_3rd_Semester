public class Books extends Product{
    private String author;
    private int pages;
    public Books(String initialName, double initialPrice, int initialQuantity, String author, int pages) {
        super(initialName, initialPrice, initialQuantity);
        this.author = author;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("-------Books Product-------");
        super.displayInfo();
        System.out.println("Brand : " + this.author);
        System.out.println("Model: " + this.pages);
    }
}
