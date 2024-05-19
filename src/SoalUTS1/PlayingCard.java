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
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    // Setter and Getter for rank
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    // Method to display card details
    public String display() {
        return rank + " of " + suit;
    }
}
