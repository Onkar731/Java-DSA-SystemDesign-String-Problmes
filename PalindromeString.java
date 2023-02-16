/**
 Write a java program to check whether the string is palindrome or not 
 palindrome strings - "MADAM", "NITIN", "LEVEL", "RADAR"
*/

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting string from the user
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        String newString = "";

        // checking whether string is palindrome or not - logic

        // reversing a string
        for(int i = str.length()-1; i >= 0; i--) {
            newString += str.charAt(i);
        }

        // checking condition for palindrome string
        if(str.equals(newString)) {
            System.out.println("Palindrome Strings");
        } else {
            System.out.println("Non Palindrome Strings");
        }

        // closing resource
        sc.close();
    }    
}
