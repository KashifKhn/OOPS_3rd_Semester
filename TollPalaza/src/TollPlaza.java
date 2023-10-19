public class TollPlaza {
    private String location;
    private int totalVehicles;
    private double totalRevenue;

    public TollPlaza(String loc) {
        this.location = loc;
    }

    public TollPlaza(String loc, int initialVehicles, double initialRevenue) {
        this.location = loc;
        this.totalVehicles = initialVehicles;
        this.totalRevenue = initialRevenue;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalVehicles() {
        return totalVehicles;
    }

    public void setTotalVehicles(int totalVehicles) {
        this.totalVehicles = totalVehicles;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
//    Member Function

    public void recordVehicle() {
        this.totalVehicles ++;
    }
    public void collectToll(double amount) {
        this.totalRevenue += amount;
    }

    public void displayStats() {
        System.out.println("---------------------------------------------------------");
        System.out.println("The Location is : " + this.getLocation());
        System.out.println("\tThe total Vehicle is Passed: " + this.getTotalVehicles());
        System.out.println("\tThe total Revenue is Collected: " + this.getTotalRevenue());
        System.out.println("---------------------------------------------------------");
    }

    public void reset() {
        this.totalRevenue = 0;
        this.totalVehicles = 0;
    }

    public void compareTollPlaza(TollPlaza otherToll){
        if(this.totalRevenue == otherToll.totalRevenue) System.out.println("Both are Generated The same Revenue");
        else if(this.totalRevenue > otherToll.totalRevenue) System.out.printf("The %s Revenue is greater Than %s Revenue\n",this.location,otherToll.location);
        else System.out.printf("The %s Revenue is greater Than %s Revenue\n",otherToll.location,this.location);
    }


}
