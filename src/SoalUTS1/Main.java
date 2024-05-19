package SoalUTS1;

public class Main {
    public static void main(String[] args) {
        // Create a deck of cards
        Deck deck = new Deck();
        System.out.println(deck);

        // Shuffle the deck
        deck.shuffle();
        System.out.println("Deck shuffled");

        // Create a hand of cards
        Hand hand = new Hand();

        // Draw five cards from the deck
        for (int i = 0; i < 5; i++) {
            Card card = deck.draw();
            if (card != null) {
                hand.addCard(card);
            }
        }
        // Display the hand of cards
        System.out.println(hand);
        System.out.println(deck);
    }
}

// The Main class demonstrates how to use these classes together.
// The program starts by creating a new Deck object, which automatically fills with 52 cards.
// The shuffle method is called to randomize the order of cards.
// An empty Hand object is created to hold the drawn cards.
// Five cards are drawn from the deck and added to the hand.
// The contents of the hand are displayed using the display method, which lists all the cards in the hand.