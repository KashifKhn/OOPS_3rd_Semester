public class Course {
    private String courseName;
    private double[] quizScores = new double[3];
    private double midTermScore;
    private double finalTermScore;

    private static double

    public Course(String courseName, double[] quizScores, double midTermScore, double finalTermScore) {
        this.courseName = courseName;
        this.quizScores = quizScores;
        this.midTermScore = midTermScore;
        this.finalTermScore = finalTermScore;
    }
}
