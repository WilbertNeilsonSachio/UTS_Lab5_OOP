package SoalUTS1;

public class Card {
    private String suit;
    private String rank;

    // Constructor
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Overloaded Constructor
    public Card(String suit) {
        this(suit, "Ace");
    }

//  Suit Setter and Getter
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public String getSuit() {
        return suit;
    }


//  Rank Setter and Getter
    public void setRank(String rank) {
        this.rank = rank;
    }
    public String getRank() {
        return rank;
    }
//  Method that will be overridden
    public String Display() {
        return rank + " of " + suit;
    }
}
