public class Main {
    public static void main(String[] args) {
        DeckOfCard card = new DeckOfCard();
        card.shuffle();
        card.shuffle();
        card.shuffle();

        for (int i = 1; i < 52; i++) {
            System.out.printf("%-19s", card.dealCard());
            if (i % 4 == 0)
                System.out.println();
        }
    }
}