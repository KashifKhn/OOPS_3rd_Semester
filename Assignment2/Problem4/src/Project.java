public class Project {
    private String projectName;
    private int projectCurrentProgress;

    public Project(String projectName, int projectCurrentProgress) {
        this.setProjectName(projectName);
        this.setProjectCurrentProgress(projectCurrentProgress);
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getProjectCurrentProgress() {
        return projectCurrentProgress;
    }

    public void setProjectCurrentProgress(int projectCurrentProgress) {
        this.projectCurrentProgress = projectCurrentProgress;
    }

    @Override
    public String toString() {
        return String.format("Project name: %s\nProject current progress: %d\n", this.getProjectName(), this.getProjectCurrentProgress());
    }
}
