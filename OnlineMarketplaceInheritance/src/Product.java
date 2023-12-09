public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        setPrice(initialPrice);
        setQuantity(initialQuantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
            return;
        }
        System.out.println("Price cannot be negative or zero.");
        this.price = 1.0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity > 0) {
            this.quantity = quantity;
            return;
        }
        System.out.println("Quantity cannot be negative or zero.");
        this.quantity = 1;
    }

    public void displayInfo() {
        System.out.println("Product: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
    }
}
