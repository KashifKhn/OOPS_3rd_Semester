public class Clothing extends Product{
    private String size;
    private String material;

    public Clothing(String initialName, double initialPrice, int initialQuantity, String size, String material) {
        super(initialName, initialPrice, initialQuantity);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void displayInfo() {
        System.out.println("-------Clothing Product-------");
        super.displayInfo();
        System.out.println("Brand : " + this.size);
        System.out.println("Model: " + this.material);
    }
}
