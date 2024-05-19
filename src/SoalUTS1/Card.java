package SoalUTS1;

public class Card extends PlayingCard  {
    private String suit;
    private String rank;

    // Overloaded Constructor
    public Card() {
        super("Spade", "Ace");
    }

    // Constructor
    public Card(String suit, String rank) {
        super(suit, rank);
    }

    //  Overriding display method from the superclass
    @Override
    public String display() {
        return "Card: " + getRank() + " of " + getSuit();
    }
}
