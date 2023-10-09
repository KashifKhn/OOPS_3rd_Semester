import java.security.SecureRandom;

public class DeckOfCard {
    private static final SecureRandom randomNumber = new SecureRandom();
    private static final int NUMBER_OF_CARDS = 52;

    private Card[] deck = new Card[NUMBER_OF_CARDS];
    private int currentCard = 0;

    public DeckOfCard() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (int i=0; i< deck.length; i++) {
            deck[i] = new Card(faces[i%13], suits[i/13]);
        }
    }

    public void shuffle() {
        currentCard = 0;
        for(int i=0; i<deck.length; i++) {
            int second = randomNumber.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[i];
            deck[i] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard() {
        if(currentCard < deck.length)
            return deck[currentCard++];
        return null;
    }
}
