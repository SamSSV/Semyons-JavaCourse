package org.home.assigment2;

public class SecondTask {

    static int max;
    static int min;

    private static long defaultNumber = 10454;

    public static void compareDigits(long num) {
        while (defaultNumber > 0) {

            if (defaultNumber > 10) {

                int a = (defaultNumber % 10 == 0) ? 0 : (int) defaultNumber % 10;
                defaultNumber = defaultNumber / 10;
                int b = (defaultNumber % 10 == 0) ? 0 : (int) defaultNumber % 10;

                int midMax = a > b ? a : b;
                int midMin = a < b ? a : b;

                max = midMax > max ? midMax : max;
                min = midMin > min ? midMin : min;
                
            } else {
                int medium = (int) defaultNumber;
                max = max > medium ? max : medium;
                min = min < medium ? min : medium;
            }

        }
    }

    public static void main(String[] args) {
        compareDigits(defaultNumber);
        System.out.println("max digit is: " + max);
        System.out.println("min digit is: " + min);

    }


}
