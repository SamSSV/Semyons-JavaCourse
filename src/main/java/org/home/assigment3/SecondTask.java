package org.home.assigment3;

import java.util.Scanner;

public class SecondTask {

    private String userData = "";

    public String getUserData() {
        return userData;
    }

    public String setUserData() {
        System.out.println("Enter random string");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        return userData = a;
    }

    public void compareCharsInString(String str) {

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length - 2; i++) {
            int count = 0;
            for (int k = 0; k < arr.length -1; k++) {
               if (arr[i] == arr[k]) count++;
            }
            System.out.println(arr[i] + " meets " + count + " time(s)");
        }

    }

    public static void main(String[] args) {
        SecondTask secondTask = new SecondTask();
        secondTask.setUserData();
        secondTask.compareCharsInString(secondTask.getUserData());
    }

}
