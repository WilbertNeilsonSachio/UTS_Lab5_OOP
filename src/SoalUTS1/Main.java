package SoalUTS1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a deck of cards
        Deck deck = new Deck();
        System.out.println(deck);

        // Shuffle the deck
        deck.shuffle();
        System.out.println("Deck shuffled");

        // Input the number of cards
        System.out.print("How many cards do you want to draw fellow human? ");
        int numCards = scanner.nextInt();

        // Create a hand of cards
        Hand hand = new Hand();

        // Draw five cards from the deck
        for (int i = 0; i < numCards; i++) {
            Card card = deck.draw();
            if (card != null) {
                hand.addCard(card);
            } else {
                System.out.println("That is too much card. We don't have " + numCards + " cards.");
                break;
            }
        }
        // Display the hand of cards
        System.out.println(hand);
        System.out.println(deck);

        scanner.close();
    }
}

// The Main class demonstrates how to use these classes together.
// The program starts by creating a new Deck object, which automatically fills with 52 cards.
// The shuffle method is called to randomize the order of cards.
// User need to input the amount of cards they want to draw.
// An empty Hand object is created to hold the drawn cards.
// Cards are drawn from the deck and added to the hand.
// The contents of the hand are displayed using the display method, which lists all the cards in the hand.