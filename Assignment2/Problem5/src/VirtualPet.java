public class VirtualPet {
    private String petName;
    private int hunger;
    private int happiness;

    public VirtualPet(String petName, int hunger, int happiness) {
        this.setPetName(petName);
        this.setHunger(hunger);
        this.setHappiness(happiness);
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void feedPet() {
        this.setHunger(this.getHunger() - 1);
    }

    public void playWithPet() {
        this.setHappiness(this.getHappiness() + 1);
    }

    public void displayPetStats() {
        System.out.println("Pet Name: " + this.getPetName());
        System.out.println("Hunger: " + this.getHunger());
        System.out.println("Happiness: " + this.getHappiness());
    }
}
