public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", 50.0, 20.0, 25.0);
        Car.setPricePerLiter(2.5);

        myCar.addFuel();

        myCar.addFuel(15);

        myCar.addFuel(40);

        myCar.expectedCoverage();
    }
}