package SoalUTS1;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    // Constructor
    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};

        // Nested loop to make the deck
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    // Shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Draw a card from the deck
    public Card draw() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(cards.size() - 1);
    }

    @Override
    public String toString() {
        return "Deck of " + cards.size() + " cards";
    }
}

// Deck class represents a deck of playing cards which manages the collection of Card objects.
// It has an ArrayList attribute to hold Card objects as an array.
// Constructor initializes the deck with 52 cards, one for each combination of suits and ranks.
// Shuffles the cards randomly using Collections.shuffle.
// Draws a card from the top of the deck and removes it from the ArrayList.
// toString Method provides a textual representation of the deck's current state.