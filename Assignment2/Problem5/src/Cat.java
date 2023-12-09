public class Cat extends VirtualPet {
    private int meowLevel;
    private int restlessness;

    public Cat(String petName, int hunger, int happiness, int meowLevel, int restlessness) {
        super(petName, hunger, happiness);
        this.setMeowLevel(meowLevel);
        this.setRestlessness(restlessness);
    }

    public int getMeowLevel() {
        return meowLevel;
    }

    public void setMeowLevel(int meowLevel) {
        this.meowLevel = meowLevel;
    }

    public int getRestlessness() {
        return restlessness;
    }

    public void setRestlessness(int restlessness) {
        this.restlessness = restlessness;
    }

    public void meow() {
        this.setMeowLevel(this.getMeowLevel() + 1);
        super.setHappiness(super.getHappiness() - 1);
    }

    public void playWithToy() {
        this.setRestlessness(this.getRestlessness() - 1);
    }

    @Override
    public void displayPetStats() {
        System.out.println("-------Cat Stats-------");
        super.displayPetStats();
        System.out.println("Meow Level: " + this.getMeowLevel());
        System.out.println("Restlessness: " + this.getRestlessness());
    }
}
