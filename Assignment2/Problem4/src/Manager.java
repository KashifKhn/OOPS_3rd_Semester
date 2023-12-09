public class Manager extends Worker {
    private int numberOfManagedEmployees;
    private int onGoingProjects;

    public Manager(String name, int workingHours, int numberOfManagedEmployees, int onGoingProjects) {
        super(name, workingHours);
        this.setNumberOfManagedEmployees(numberOfManagedEmployees);
        this.setOnGoingProjects(onGoingProjects);
    }

    public int getNumberOfManagedEmployees() {
        return numberOfManagedEmployees;
    }

    public void setNumberOfManagedEmployees(int numberOfManagedEmployees) {
        this.numberOfManagedEmployees = numberOfManagedEmployees;
    }

    public int getOnGoingProjects() {
        return onGoingProjects;
    }

    public void setOnGoingProjects(int onGoingProjects) {
        this.onGoingProjects = onGoingProjects;
    }

    @Override
    public String toString() {
        return String.format("%sNumber of managed employees: %d\nOn going projects: %d\n", super.toString(), this.getNumberOfManagedEmployees(), this.getOnGoingProjects());
    }
}
