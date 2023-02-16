/**
 Write a java program to reverse a string by words without changing its character's position. 
 str = "pwskills java" --> newString = "java pwskills"
 */

public class ReverseStringByWords {
    public static void main(String[] args) {
        // creating a string of multi words
        String words = "Onkar Shengule";
        String reversedString = " ";

        // reversing string by words - logic

        // spliting the given string on basis of space (" ") by using split() method
        // creating a string array reference to refer a string array given by split() method
        String[] stringArr = words.split(" ");

        // traversing on string array
        for(int i = stringArr.length-1; i >= 0; i--) {
            reversedString += stringArr[i] + " ";
        }

        // printing strings
        System.out.println("Before reversing : " + words);
        System.out.println("After reversing : " + reversedString);
    }
}
