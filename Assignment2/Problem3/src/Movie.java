import java.util.Scanner;

public abstract class Movie {
    private String MPAARating;
    private String idNumber;
    private String movieTitle;

    private double lateFee;

    public Movie(String MPAARating, String idNumber, String movieTitle) {
        setMPAARating(MPAARating);
        setIdNumber(idNumber);
        setMovieTitle(movieTitle);
        setLateFee(2.0);
    }

    public String getMPAARating() {
        return MPAARating;
    }

    public void setMPAARating(String MPAARating) {
        this.MPAARating = MPAARating;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    @Override
    public String toString() {
        return String.format("Movie Title: %s\nID Number: %s\nMPAA Rating: %s\n",
                getMovieTitle(), getIdNumber(), getMPAARating());
    }

    public abstract double calcLateFees(int lateDays);

}
