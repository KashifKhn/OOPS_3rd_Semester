public class VisitingTeacher extends Teacher {
    private String teacherName;
    private double lecturePerSalary;

    public VisitingTeacher(String courseName, int totalLecture, String teacherName, double lecturePerSalary) {
        super(courseName, totalLecture);
        this.teacherName = teacherName;
        this.lecturePerSalary = lecturePerSalary;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public double getLecturePerSalary() {
        return lecturePerSalary;
    }

    public void setLecturePerSalary(double lecturePerSalary) {
        this.lecturePerSalary = lecturePerSalary;
    }

    @Override
    public double computeSalary() {
        return this.getTotalLecture() * this.getLecturePerSalary();
    }

    @Override
    public String toString() {
        return String.format("Visiting Teacher\tTeacher Name: %s\t %s\tMonthly Salary: %f",this.getTeacherName(), super.toString(), this.computeSalary());

    }
}
