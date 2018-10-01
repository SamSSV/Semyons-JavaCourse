package org.home.assigment2;

public class SecondTask {

    static int max = 0;
    static int min = 9;

    private static long defaultNumber = 1072634;


    /*
    Method compares last two digits in loop and defines min and max values
    */
    public static void compareDigits(long num) {

        while (defaultNumber > 0) {

            if (defaultNumber > 9) {
                int percentOfNum = (int)defaultNumber % 10;
                int a = percentOfNum;
                defaultNumber = defaultNumber / 10;
                percentOfNum = (int)defaultNumber % 10;
                int b = percentOfNum;

                int midMax = a > b ? a : b;
                int midMin = a < b ? a : b;

                max = (midMax > max) ? midMax : max;
                min = (midMin < min) ? midMin : min;

            } else {
                int medium = (int) defaultNumber;
                max = max > medium ? max : medium;
                min = min < medium ? min : medium;
                defaultNumber = defaultNumber / 10;
            }

        }
    }

    public static void main(String[] args) {
        compareDigits(defaultNumber);
        System.out.println("max digit is: " + max);
        System.out.println("min digit is: " + min);

    }


}
