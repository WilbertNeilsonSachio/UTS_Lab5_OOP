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
        return getRank() + " of " + getSuit();
    }
}
// Card class is a class that extends from PlayingCard class.
// It has two constructors. One that initializes both suit and rank and an overloaded one.
// Overrides the display method to provide a different string representation.
// toString Method calls the overridden display method for consistent output.