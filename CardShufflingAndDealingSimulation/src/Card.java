public class Card {
    private final String face;
    private final String suit;

    public Card(String cardFace, String CardSuit) {
        this.face = cardFace;
        this.suit = CardSuit;
    }

    public String toString() {
        return this.face + " of " + this.suit;
    }
}
