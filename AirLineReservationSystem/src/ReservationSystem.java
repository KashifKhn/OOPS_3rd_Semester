import java.util.Scanner;

public class ReservationSystem {
    private int [] seats = new int[10];
    private boolean [] isReserved = new boolean[10];

    public ReservationSystem(int[] seats, boolean[] isReserved) {
        this.seats = seats;
        this.isReserved = isReserved;
    }

    public int[] getSeats() {
        return seats;
    }

    public boolean[] getIsReserved() {
        return isReserved;
    }

    public int displayMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter\n 1 for FirstClass\n 2 for Economy .................");
        return  sc.nextInt();
    }
    public void  assignSeat() {
        int choice = displayMenu();
        if(choice == 1) {

        }
    }
}
