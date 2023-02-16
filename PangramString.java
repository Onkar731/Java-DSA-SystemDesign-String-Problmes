/**
Write a java program to check whether the given string is pangram or not.
Pangram string - which contains all the alphabets.
*/

import java.util.Scanner;

public class PangramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        System.out.println("Enter a string :");
        String str = sc.nextLine();

        // removing spaces
        str = str.replace(" ", "");
        
        // converting string to lower case
        str = str.toLowerCase();

        // storing string in char array
        char []arr = str.toCharArray();

        // creating an array of alphabets of 26 size
        int []alphabets = new int[26];

        // traversing through char array arr
        for(int i = 0; i < arr.length; i++) {
            alphabets[arr[i] - 97]++;
        }

        boolean pangram = true;

        // traversing through int array alphabets
        for(int element : alphabets) {
            if(element == 0) {
                System.out.println("Not a pangram string");
                pangram = false;
                break;
            }
        }

        if(pangram) {
            System.out.println("Pangram string");
        }
        
        // closing resource
        sc.close();
    }
}