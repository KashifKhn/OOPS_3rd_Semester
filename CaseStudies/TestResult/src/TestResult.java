public class TestResult {
    public static void main(String[] args) {
        Result r1 = new Result();
        r1.userInput();
        r1.showInfo();
        System.out.println(r1.totalMarks());
        System.out.println(r1.avgMarks());
    }
}