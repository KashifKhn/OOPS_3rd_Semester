
public class Main {
    public static void main(String[] args) {

        CommissionEmpolyee commissionEmpolyee = new CommissionEmpolyee("123", "John", 0.1, 1000);
        System.out.println(commissionEmpolyee);

        CommissionPlusBaseEmpolyee commissionPlusBaseEmpolyee = new CommissionPlusBaseEmpolyee("123", "John", 0.1, 1000, 1000);
        System.out.println(commissionPlusBaseEmpolyee);


    }


}