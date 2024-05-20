package SoalUTS2;

import java.util.Arrays;

public class Checker {

    // Method to check anagram
    public static boolean areAnagrams(String word1, String word2) {
        // Remove whitespace and lowercase
        word1 = word1.replaceAll("\\s", "").toLowerCase();
        word2 = word2.replaceAll("\\s", "").toLowerCase();

        // Convert to array then sort
        char[] charArray1 = word1.toCharArray();
        Arrays.sort(charArray1);

        char[] charArray2 = word2.toCharArray();
        Arrays.sort(charArray2);

        // Compare
        return Arrays.equals(charArray1, charArray2);
    }
}