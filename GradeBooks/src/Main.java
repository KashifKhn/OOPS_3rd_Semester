public class Main {
    public static void main(String[] args) {
        GradeBook OOPGradeBook = new GradeBook("Object Oriented Programming", "CSC 221", "Dr.", new Student[] {
            new Student("John Doe", "CSC/2013/001", 70.0),
            new Student("Kha", "CSC/2013/002", 80.0),
            new Student("James Doe", "CSC/2013/003", 90.0),
            new Student("Janet Doe", "CSC/2013/004", 100.0),
            new Student("Jude Doe", "CSC/2013/005", 60.0),
            new Student("Jade Doe", "CSC/2013/006", 50.0),
            new Student("Jade Doe", "CSC/2013/007", 40.0),
            new Student("Jade Doe", "CSC/2013/008", 30.0),
            new Student("Jade Doe", "CSC/2013/009", 20.0),
            new Student("Jade Doe", "CSC/2013/010", 10.0),
        });
        OOPGradeBook.processGrades();
    }
}