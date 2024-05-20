package SoalUTS2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("First word: ");
        String word1 = scanner.nextLine();
        System.out.print("Second word: ");
        String word2 = scanner.nextLine();

        // Call the method
        boolean result = Checker.areAnagrams(word1, word2);

        // Output
        if (result) {
            System.out.println("True, those are anagrams.");
        } else {
            System.out.println("False, those are not anagrams.");
        }

        scanner.close();
    }
}
