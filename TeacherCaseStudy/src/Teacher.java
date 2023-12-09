public abstract class Teacher implements Payable{
    private String courseName;
    private int totalLecture;

    public Teacher(String courseName, int totalLecture) {
        this.courseName = courseName;
        this.totalLecture = totalLecture;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getTotalLecture() {
        return totalLecture;
    }

    public void setTotalLecture(int totalLecture) {
        this.totalLecture = totalLecture;
    }

    @Override
    public String toString() {
        return String.format("Course name: %s\tTotal Lecture: %d", this.getCourseName(), this.getTotalLecture());
    }
}
