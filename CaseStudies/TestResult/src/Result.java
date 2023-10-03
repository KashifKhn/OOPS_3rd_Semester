import java.util.Scanner;

public class Result {
    private String regNo;
    private String name;
    private int[] marks = new int[3];

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return this.marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter The Student Name: ");
        this.name = sc.nextLine();
        System.out.print("Please Enter The Registration No:  ");
        this.regNo = sc.nextLine();
        System.out.println("Please Enter Marks of Subject");
        for (int i=0; i<this.marks.length; i++) {
            System.out.print("Please Enter Marks of " + i + 1 + "Subject:  ");
            this.marks[i] = sc.nextInt();
        }
    }
    public void showInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Reg No: " + this.regNo);
        System.out.println("Subject Marks: ");
        for (int i=0; i<this.marks.length; i++) {
            System.out.printf("\t\tSubject %d Marks: %d \n", i+1, this.marks[i]);
        }
    }

    public int totalMarks() {
        int totalMarks = 0;
        for (int mark : this.marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    public int avgMarks() {
        int totalMarks = 0;
        for (int mark : this.marks) {
            totalMarks += mark;
        }
        return totalMarks / this.marks.length;
    }
}
