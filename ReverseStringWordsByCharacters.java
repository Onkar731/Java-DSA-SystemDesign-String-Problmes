/** 
 Write a java program to reverse a string by characters of words only.
 str = "pwskills java" --> newString = "sllikswp avaj" 
*/

public class ReverseStringWordsByCharacters {
    public static void main(String[] args) {
        // creating strings
        String str = "Onkar Shengule";
        String newString = " ";

        // reversing a string - logic

        // spliting the given string on basis of space (" ") by using split() method
        // creating a string array reference to refer a string array given by split() method
        String[] stringArr = str.split(" ");

        // traversing string array
        for(int i = 0; i < stringArr.length; i++) {
            for(int j = stringArr[i].length()-1; j >= 0; j--) {
                 newString += stringArr[i].charAt(j);
            }
           
            newString += " ";
        }

        // printing strings
        System.out.println("Before reversing : " + str);
        System.out.println("After reversing : " + newString);
    }
}
