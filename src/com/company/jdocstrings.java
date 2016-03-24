package com.company;

/* Strings are immutable, which means they cannot be changed*/
public class jdocstrings {
    //Created a string, a size of the array and created 2 empty arrays.
    public static void main(String[] args) {


        String palindrome = "Dit saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        //Putting original string in an array of characters

        for (int i = 0; i < len; i++) {
            tempCharArray[i]=palindrome.charAt(i);
        }
        System.out.println("This a print of the tempCharArray");
        System.out.println(tempCharArray);

        for (int j = 0; j < len; j++){
            charArray[j] = tempCharArray[len-1-j];
            /*The reason len-1-j works is that
            our total positions are 1 less than
            the length of the array. Subtracting
            j will increment 1 position from the back
            each time.
             */
        }

        System.out.println("This is a print of the charArray");
        System.out.println(charArray);

        //If we try to concate the two, we will get an error
        //do this if you want to convert the array back to a string.

        String reversePalindrome = new String(charArray);
        System.out.println("This is a print of charArray when converted to a String\n" +
        reversePalindrome);
    }


}