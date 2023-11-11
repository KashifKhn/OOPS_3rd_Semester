public class Car {
    private String carName;
    private double fuelCapacity;
    private double fuelLevel;
    private double avgConsumption;
    private static double fuelPricePerLiter;

    public Car(String carName, double fuelCapacity, double fuelLevel, double avgConsumption) {
        this.carName = carName;
        this.fuelCapacity = fuelCapacity;
        this.fuelLevel = fuelLevel;
        this.avgConsumption = avgConsumption;
    }

    public static void setPricePerLiter(double price) {
        fuelPricePerLiter = price;
    }

    public void addFuel() {
        double remainingSpace = fuelCapacity - fuelLevel;
        double totalPrice = remainingSpace * fuelPricePerLiter;

        System.out.println("Added " + remainingSpace + " liters of fuel. Total price: $" + totalPrice);

        fuelLevel = fuelCapacity;
    }

    public void addFuel(int liters) {
        if (liters > 0 && liters <= (fuelCapacity - fuelLevel)) {
            double totalPrice = liters * fuelPricePerLiter;

            System.out.println("Added " + liters + " liters of fuel. Total price: $" + totalPrice);

            fuelLevel += liters;
        } else {
            System.out.println("Invalid input. Please enter a valid amount of fuel.");
        }
    }

    public void expectedCoverage() {
        double coverage = fuelLevel / avgConsumption;
        System.out.println("Expected coverage: " + coverage + " miles.");
    }
}
