public class Course {
    private String courseCode;
    private String courseTitle;
    private int courseCreditHours;

    public Course() {
    }

    public Course(String courseCode, String courseTitle, int courseCreditHours) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        setCourseCreditHours(courseCreditHours);
    }

    public void setCourseCreditHours(int courseCreditHours) {
        if(courseCreditHours <= 4) {
            this.courseCreditHours = courseCreditHours;
            return;
        }
        this.courseCreditHours = 3;
        System.out.println("Exceed Credit Hours");
    }

    public int getCourseCreditHours() {
        return this.courseCreditHours;
    }

    public String getCourseCode() {
        return courseCode;
    }

    @Override
    public String toString() {
        return String.format("%S\t%S\t%d\n", this.courseCode, this.courseTitle, this.courseCreditHours);
    }
}
