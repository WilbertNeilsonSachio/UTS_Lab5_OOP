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
