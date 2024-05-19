package SoalUTS1;

public class PlayingCard {
    private String suit;
    private String rank;

    // Constructor
    public PlayingCard(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Setter and Getter for suit
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    // Setter and Getter for rank
    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    // Method to display
    public String display() {
        return "Your Card is " + rank + " of " + suit;
    }
}

// The first step is to define a superclass called PlayingCard.
// This class provides the basic attributes and methods that playing card should have.
// It has two attributes, suit and rank.
// Constructor is used to initializes attributes when a new card is created.
// Getters and Setters are used to provide access to the suit and rank attributes.
// Display Method returns a string representation of the card.