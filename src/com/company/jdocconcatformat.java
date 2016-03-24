package com.company;



public class jdocconcatformat {
    public static void main(String[] args){

        /*String string1 = "This is an";
        String string2 = " example of concating a string.";

        System.out.println(string1.concat(string2));

        System.out.println("this is another" + " example " + "of concating a string" );

        System.out.println("This is the last" + string2);*/


        float floatVar = (float) 0.234;
        int intVar = 3;
        String stringVar = "Java";

        System.out.printf("The value of the float " +
                        "variable is %f, while " +
                        "the value of the " +
                        "integer variable is %d, " +
                        "and the string is %s",
                floatVar, intVar, stringVar);
    }
}
