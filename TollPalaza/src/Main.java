public class Main {
    public static void main(String[] args) {
        TollPlaza tollPlaza1 = new TollPlaza("abc", 12, 400);
        tollPlaza1.displayStats();
//        TollPlaza tollPlaza2 = new TollPlaza("def", 13, 300);
//        tollPlaza2.displayStats();
        tollPlaza1.collectToll(200);
        tollPlaza1.collectToll(200);
        tollPlaza1.recordVehicle();
        tollPlaza1.recordVehicle();
        tollPlaza1.recordVehicle();
        tollPlaza1.recordVehicle();
//        tollPlaza1.reset();
        tollPlaza1.displayStats();

//        tollPlaza1.compareTollPlaza(tollPlaza2);


    }
}