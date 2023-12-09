import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal[] animalsArray = new Animal[100];
        Random random = new Random();
        for (int i = 0; i < animalsArray.length; i++) {
            int randomNumber = random.nextInt(4);
            if (randomNumber == 0) animalsArray[i] = new Fish();
            else if (randomNumber == 1) animalsArray[i] = new Bird();
            else if (randomNumber == 2) animalsArray[i] = new Frog();
            else animalsArray[i] = new Snake();
        }

        for (Animal animal : animalsArray) animal.move();

        int birdCount = 0;
        int fishCount = 0;
        int frogCount = 0;
        int snakeCount = 0;

        for (Animal animal : animalsArray) {
            if (animal instanceof Bird) birdCount++;
            else if (animal instanceof Fish) fishCount++;
            else if (animal instanceof Frog) frogCount++;
            else if (animal instanceof Snake) snakeCount++;
        }

        System.out.println("Bird Count: " + birdCount);
        System.out.println("Fish Count: " + fishCount);
        System.out.println("Frog Count: " + frogCount);
        System.out.println("Snake Count: " + snakeCount);
    }
}