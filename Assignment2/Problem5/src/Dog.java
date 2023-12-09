public class Dog extends VirtualPet {
    private int barkLevel;
    private int energy;

    public Dog(String petName, int hunger, int happiness, int barkLevel, int energy) {
        super(petName, hunger, happiness);
        this.setBarkLevel(barkLevel);
        this.setEnergy(energy);
    }

    public int getBarkLevel() {
        return barkLevel;
    }

    public void setBarkLevel(int barkLevel) {
        this.barkLevel = barkLevel;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void bark() {
        this.setBarkLevel(this.getBarkLevel() + 1);
        super.setHappiness(super.getHappiness() - 1);
    }

    public void sleep() {
        this.setEnergy(this.getEnergy() + 1);
    }

    @Override
    public void displayPetStats() {
        System.out.println("-------Dog Stats-------");
        super.displayPetStats();
        System.out.println("Bark Level: " + this.getBarkLevel());
        System.out.println("Energy: " + this.getEnergy());
    }
}
