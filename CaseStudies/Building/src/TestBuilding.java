public class TestBuilding {
    public static void main(String[] args) {
        Building home = new Building();
        home.floors = 1;
        home.occupants = 10;
        home.area = 454292;
        home.areaPerson();
        Building office = new Building();
        office.floors = 1;
        office.occupants = 9630;
        office.area = 454292;
        office.areaPerson();
    }
}