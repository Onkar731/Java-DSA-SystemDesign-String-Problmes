/**
 Write a java program to reverse a string by characters 
 str = "pwskills" --> newString = "sllikspw"
*/

public class ReverseStringByCharacters {
    public static void main(String[] args) {
        // creating a string 
        String str1 = "Onkar";
        String reversedString = " ";

        // reversing string - logic
        for(int i = str1.length()-1; i >= 0; i--) {
            reversedString += str1.charAt(i);
        }

        // printing strings
        System.out.println("Before Reversing : " + str1);
        System.out.println("After Reversing : " + reversedString);
        
    }
}