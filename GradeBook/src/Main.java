public class Main {
    public static void main(String[] args) {
        int[][] gradesArray = {
                {87, 96, 70},
                {78, 87, 90},
                {94, 100, 90},
                {100, 81, 82},
                {83, 55, 85},
                {78, 87, 65},
                {85, 75, 83},
                {91, 94, 100},
                {76, 72, 84},
                {87, 93, 73}
        };

        GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming", gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}