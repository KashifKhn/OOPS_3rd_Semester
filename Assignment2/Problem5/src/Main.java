import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VirtualPet cat = new Cat("Persian", 10, 8, 3, 2);
        VirtualPet dog = new Dog("husky", 5, 5, 5, 5);

        System.out.println("Welcome To Virtual Pet Simulator");
        System.out.println("--------------------------------");
        String continuePlaying = "y";
        do {
            System.out.println("With which pet would you like to play?");
            System.out.println("1. Cat");
            System.out.println("2. Dog");
            System.out.println("0. Exit");
            int userChoice = sc.nextInt();
            sc.nextLine();
            if (userChoice == 1) {
                System.out.println("You have chosen to play with the cat.");
                String catContinuePlaying = "y";
                do {
                    System.out.println("What would you like to do?");
                    System.out.println("1. Feed the cat");
                    System.out.println("2. Play with the cat");
                    System.out.println("3. Make the cat meow");
                    System.out.println("4. Play with the cat's toy");
                    System.out.println("5. Display cat stats");
                    System.out.println("0. Exit");
                    int catChoice = sc.nextInt();
                    sc.nextLine();
                    if (catChoice == 1) {
                        cat.feedPet();
                        System.out.println("You fed the cat.");
                    } else if (catChoice == 2) {
                        cat.playWithPet();
                        System.out.println("You played with the cat.");
                    } else if (catChoice == 3) {
                        ((Cat) cat).meow();
                        System.out.println("You made the cat meow.");
                    } else if (catChoice == 4) {
                        ((Cat) cat).playWithToy();
                        System.out.println("You played with the cat's toy.");
                    } else if (catChoice == 5) {
                        cat.displayPetStats();
                    } else if (catChoice == 0) {
                        System.out.println("You have chosen to exit.");
                        catContinuePlaying = "n";
                    } else {
                        System.out.println("Invalid choice.");
                    }
                } while (!catContinuePlaying.equalsIgnoreCase("n"));
            } else if (userChoice == 2) {
                System.out.println("You have chosen to play with the dog.");
                String dogContinuePlaying = "y";
                do {
                    System.out.println("What would you like to do?");
                    System.out.println("1. Feed the dog");
                    System.out.println("2. Play with the dog");
                    System.out.println("3. Make the dog bark");
                    System.out.println("4. Make the dog sleep");
                    System.out.println("5. Display dog stats");
                    System.out.println("0. Exit");
                    int dogChoice = sc.nextInt();
                    sc.nextLine();
                    if (dogChoice == 1) {
                        dog.feedPet();
                        System.out.println("You fed the dog.");
                    } else if (dogChoice == 2) {
                        dog.playWithPet();
                        System.out.println("You played with the dog.");
                    } else if (dogChoice == 3) {
                        ((Dog) dog).bark();
                        System.out.println("You made the dog bark.");
                    } else if (dogChoice == 4) {
                        ((Dog) dog).sleep();
                        System.out.println("You made the dog sleep.");
                    } else if (dogChoice == 5) {
                        dog.displayPetStats();
                    } else if (dogChoice == 0) {
                        System.out.println("You have chosen to exit.");
                        dogContinuePlaying = "n";
                    } else {
                        System.out.println("Invalid choice.");
                    }
                } while (!dogContinuePlaying.equalsIgnoreCase("n"));
            } else if (userChoice == 0) {
                System.out.println("You have chosen to exit.");
                continuePlaying = "n";
            } else {
                System.out.println("Invalid choice.");
            }
        } while (!continuePlaying.equalsIgnoreCase("n"));

    }

}