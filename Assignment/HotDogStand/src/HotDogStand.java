public class HotDogStand {
    private int standID;
    private int hotDogsSold;

    //    Constructors
    public HotDogStand(int standID, int hotDogsSold) {
        this.standID = standID;
        this.hotDogsSold = hotDogsSold;
    }

    //    Getters and Setters
    public int getStandID() {
        return standID;
    }

    public void setStandID(int standID) {
        this.standID = standID;
    }

    public int getHotDogsSold() {
        return hotDogsSold;
    }

    public void setHotDogsSold(int hotDogsSold) {
        this.hotDogsSold = hotDogsSold;
    }

    //    Methods

    public void displayHotDogStandInfo() {
        System.out.println("Stand ID: " + this.standID);
        System.out.println("Hot dogs sold: " + this.hotDogsSold);
    }

    public void justSold() {
        this.hotDogsSold++;
    }
}
