package org.home.assigment2;

public class ThirdTask {

    public static int foo(int num) {
        System.out.println(num);
        if (num <= 1) {
            System.out.println(num);
            return num;
        }
        else {
            return foo(num - 1) + foo(num - 2);
        }


    }

    public static void main(String[] args) {
        foo(3);
    }


}
