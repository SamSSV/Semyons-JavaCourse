package org.home.assigment2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Array;

public class FourthTask {

    static int num;
    static int powCounter = 0;
    /*@DataProvider
    public static Object[][] testData() {
        return new Object[][]{
                {4},
                {2},
                {7},
                {8},
                {0},
                {128},
                {256},
                {254}
        };
    }

*/
    //@Test(dataProvider = "testData")
    public static void foo(int num) {

        if (num == 0) {
            System.out.println(num + "You entered 0");
        } else if (num == 1) {
            System.out.println(num + " Your number is 2 in the 0 degree");
        } else if (num % 2 != 0) {
            System.out.println(num + " Your number is not a pow of 2");
        } else if (num / 2 != 1) {
            num = num / 2;
            powCounter++;
            foo(num);

        } else {
            powCounter++;
            System.out.printf("Your number is %d in the %d degree", num, powCounter);
        }
    }



    public static void main(String[] args) {
        foo(256);


    }


}
