package com.company;


public class jdocnumberstostrings {
    // to generate, type 'psvm' and tab
    public static void main(String[] args) {
       /* float a = (float) 4.5;
        float b = (float) 87.2;


        // do some arithmetic
        System.out.println("a + b = " +
                (a + b));
        System.out.println("a - b = " +
                (a - b));
        System.out.println("a * b = " +
                (a * b));
        System.out.println("a / b = " +
                (a / b));
        System.out.println("a % b = " +
                (a % b)); */


       /* int i = 3;
        //Easy way to convert number to a string
        System.out.println("" + i);


        //Another way would be this
        double g = 7.27;
        System.out.println(Integer.toString(i));
        System.out.println(Double.toString(g)); */

        double d = 858.48;
        String s = Double.toString(d);

        int dot = s.indexOf('.');

        System.out.println(dot + " digits " +
                "before decimal point.");

        //Remember that you need to have -1 because
        //the index is 1 less
        System.out.println( (s.length() - dot - 1) +
                " digits after decimal point.");
    }
    }


