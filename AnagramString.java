/**
 Write a java program to check whether the strings are anagram or not
 Anagram strings are those strings which is made up of existing characters of given string. 
 
 Example - str = "School Master" --> newString = "The classroom"
           str = "keep" --> newString = "peek"
*/

import java.util.Scanner;
import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        System.out.print("Enter another string : ");
        String newString = sc.nextLine();

        // checking whether strings are anagram or not - logic

        // removing white space
        str = str.replace(" ", "");
        newString = newString.replace(" ", "");

        // converting to lower case
        str = str.toLowerCase();
        newString = newString.toLowerCase();

        // creating char array of string
        char []arr1 = str.toCharArray();
        char []arr2 = newString.toCharArray();

        // sorting arrays using Arrays.sort() method
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // checking whether the characters are equals or not
        if(Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram String");
        } else {
            System.out.println("Not an Anagram String");
        }

        // closing resource
        sc.close();
    }
}
