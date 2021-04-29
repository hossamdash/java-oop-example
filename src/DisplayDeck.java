public class DisplayDeck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int suit = 0; suit < Card.cardSuits.length; suit++) {
            for (int rank = 0; rank < Card.cardRanks.length; rank++) {
                Card card = deck.getCard(suit, rank);
                System.out.format("%s of %s%n",
                card.getRank(),
                card.getSuit());
            }
        }
    }
}
