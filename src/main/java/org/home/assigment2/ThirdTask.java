package org.home.assigment2;

public class ThirdTask {

    public static int fib(int num) {
        int fibSum;

        return fibSum = (num == 0) ? 0 : (num == 1) ? 1 : fib(num -1) + fib (num -2);
    }

    public static void main(String[] args) {
        System.out.println(fib(11));
    }
}
