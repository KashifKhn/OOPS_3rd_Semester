public class Worker {
    private String name;
    private int workingHours;

    public Worker(String name, int workingHours) {
        this.setName(name);
        this.setWorkingHours(workingHours);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nWorking hours: %d\n", this.getName(), this.getWorkingHours());
    }
}
