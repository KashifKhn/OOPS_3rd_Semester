public abstract class Person implements Award {
    private String personName;

    public Person() {
        setPersonName("Unknown");
    }
    public Person(String personName) {
        setPersonName(personName);
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void getData() {

    }


} 
