import java.util.Arrays;

public class Card {
    private final String suit;
    private final String rank;

    // ranks
    public final static String[] cardRanks = {"Ace", "Deuce", "Three", "Four", "Five" , "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    
    // suits
    public final static String[] cardSuits = {"Diamonds", "Clubs", "Hearts", "Spades"};

    public Card(String rank, String suit) {
        assert isValidRank(rank);
        assert isValidSuit(suit);
        this.rank = rank;
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    // we have to run the compiled java class with options '-ea' in order to enable assertions and be able to throw exceptions on invalid parame. example: 'java -ea Card'

    public static boolean isValidRank(String rank) {
        return Arrays.stream(cardRanks).anyMatch(rank::equals);
    }

    public static boolean isValidSuit(String suit) {
        return Arrays.stream(cardSuits).anyMatch(suit::equals);
    }

    public static void main(String[] args) {
        System.out.println(isValidSuit("Diamond"));
        // wrong card suit
        Card c1 = new Card("Ace", "Diamond");
        System.out.println(c1);
    }
}

