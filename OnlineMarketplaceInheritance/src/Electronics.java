import java.security.SecureRandom;

public class Electronics extends Product {
    private String brand;
    private String model;

    public Electronics(String initialName, double initialPrice, int initialQuantity, String brand, String model) {
        super(initialName, initialPrice, initialQuantity);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void displayInfo() {
        System.out.println("-------Electronics Product-------");
        super.displayInfo();
        System.out.println("Brand : " + this.brand);
        System.out.println("Model: " + this.model);
    }
}
