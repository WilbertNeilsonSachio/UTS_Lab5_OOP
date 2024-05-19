package SoalUTS1;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;

    // Constructor
    public Hand() {
        hand = new ArrayList<>();
    }

    // Add a card to the hand
    public void addCard(Card card) {
        hand.add(card);
    }

    // Get a specific card from the hand
    public Card getCard(int index) {
        if (index >= 0 && index < hand.size()) {
            return hand.get(index);
        }
        return null;
    }

    // Display all cards in the hand
    public String display() {
        StringBuilder display = new StringBuilder("Your Hand:\n");
        for (Card card : hand) {
            display.append(card.display()).append("\n");
        }
        return display.toString();
    }

    @Override
    public String toString() {
        return display();
    }
}

