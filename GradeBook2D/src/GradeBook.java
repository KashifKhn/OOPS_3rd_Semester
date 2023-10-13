public class GradeBook {
    private final int[][] grades;
    private String courseName;

    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void processGrades() {
        outPutGrades();
        System.out.printf("%n%s %d%n%s %d%n%n", "Lowest grade in the grade book is", getMinimumAndMaximum()[0], "Highest grade in the grade book is", getMinimumAndMaximum()[1]);

        outPutBarChart();
    }

    private void outPutBarChart() {
        System.out.println("Overall grade distribution:");
        int[] frequency = new int[11];
        for (int[] studentGrades : grades)
            for (int grade : studentGrades)
                ++frequency[grade / 10];
        for (int i = 0; i < frequency.length; i++) {
//            for range of Marks
            if (i == 10) System.out.printf("%5d: ", 100);
            else System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
//            for Star in bar
            for (int j = 0; j < frequency[i]; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    private int[] getMinimumAndMaximum() {
        int lowGrade = grades[0][0];
        int highGrade = grades[0][0];
        for (int[] studentGrade : grades) {
            for (int grade : studentGrade) {
                if (grade < lowGrade) lowGrade = grade;
                if (grade > highGrade) highGrade = grade;
            }
        }
        return new int[]{lowGrade, highGrade};
    }

    public void outPutGrades() {
        System.out.printf("The Grades are %n%n");
        System.out.print("            ");

        for (int i = 0; i < grades[0].length; i++) {
            System.out.printf("Test %d   ", i + 1);
        }
        System.out.println("Average");
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Students %02d", i + 1);
            for (int test : grades[i]) {
                System.out.printf("%8d", test);
            }
            double average = getAverage(grades[i]);
            System.out.printf("%9.2f%n", average);
        }

    }

    private double getAverage(int[] grades) {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.length;
    }
}
