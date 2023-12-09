public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Product product = new Product("Product 1", 10.0, 10);
        product.displayInfo();
        Electronics electronics = new Electronics("Electronics 1", 20.0, 20, "Brand 1", "Model 1");
        electronics.displayInfo();
        Clothing clothing = new Clothing("Clothing 1", 30.0, 30, "Brand 1", "Model 1");
        clothing.displayInfo();
        Books books = new Books("Books 1", 40.0, 40, "Brand 1", 100);
        books.displayInfo();

    }
}