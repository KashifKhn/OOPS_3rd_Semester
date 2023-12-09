
public class ActionMovie extends Movie {

    public ActionMovie(String MPAARating, String idNumber, String movieTitle) {
        super(MPAARating, idNumber, movieTitle);
        super.setLateFee(3.0);
    }

    @Override
    public double calcLateFees(int lateDays) {
        return super.getLateFee() * lateDays;
    }

    @Override
    public String toString() {
        return String.format("%sLate Fee: $%.2f\n", super.toString(), super.getLateFee());
    }
}
