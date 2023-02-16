/**
 Write a java program to reverse a string of multiple words by changing character's position. 
 str = "pwskills java" --> newString = "avaj sllikswp"
 */

public class ReverseStringOfWordsByCharacters {
    public static void main(String[] args) {
        // creating strings
        String words = "Onkar Shengule";
        String reversedString = " ";

        // reversing string - logic
        for(int i = words.length()-1; i >= 0; i--) {
            reversedString += words.charAt(i);
        }

        // printing strings
        System.out.println("Before reversing : " + words);
        System.out.println("After reversing : " + reversedString);
    }
}
