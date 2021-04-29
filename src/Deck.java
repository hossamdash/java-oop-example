public class Deck {

    public static int numSuits = 4;
    public static int numRanks = 13;
    public static int numCards = numSuits * numRanks;

    private Card[][] cards;

    public Deck() {
        cards = new Card[numSuits][numRanks];
        for (int suit = 0; suit < Card.cardSuits.length; suit++) {
            for (int rank = 0; rank < Card.cardRanks.length; rank++) {
                cards[suit][rank] = new Card(Card.cardRanks[rank], Card.cardSuits[suit]);
            }
        }
    }

    public Card getCard(int suit, int rank) {
        return cards[suit][rank];
    }
}