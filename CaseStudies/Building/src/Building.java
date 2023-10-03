public class Building {
    public int floors;
    public int occupants;
    public double area;

    public void areaPerson() {
        double areaPerson = this.area / this.occupants;
        System.out.println(areaPerson);
    }
}
