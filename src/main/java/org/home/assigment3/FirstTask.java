package org.home.assigment3;

import org.testng.annotations.Test;

import java.util.Scanner;

public class FirstTask {

    private static final String OPTION_A = "A. Text to uppercase";
    private static final String OPTION_B = "B. Text to lowerrcase";
    private static final String OPTION_C = "C. Each word starts with capital letter";
    private static final String OPTION_D = "D. Each word starts with letter in lowercase";
    private static final String OPTION_E = "E. First word of entered text  starts with a letter in uppercase";
    private static final String OPTION_F = "F. Exit";

    private String userData = "";

    public String getUserData() {
        return userData;
    }

    public String setUserData() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        return userData = a;
    }

    public static String convertFirstLettersToCapital(String text) {
        String[] foo = text.split(" ");
        String newString = "";
        for (String el : foo) {
            el = el.toLowerCase();
            if (el.length() > 1) {
                el = el.substring(0, 1).toUpperCase() + el.substring(1);
            } else {
                el = el.substring(0, 1).toUpperCase();
            }
            newString = newString + el + " ";
        }
        return newString.trim();
    }

    public static String convertFirstLettersToLower(String text) {
        String[] foo = text.split(" ");
        String newString = "";
        for (String el : foo) {
            el = el.toUpperCase();
            if (el.length() > 1) {
                el = el.substring(0, 1).toLowerCase() + el.substring(1);
            } else {
                el = el.substring(0, 1).toLowerCase();
            }
            newString = newString + el + " ";
        }
        return newString.trim();
    }

    public static String convertFirstLetterToCapital(String text) {
        String el = text;
        el = el.toLowerCase();
        return el.substring(0, 1).toUpperCase() + el.substring(1);
    }

    public String getUserOption() {
        boolean flag = true;
        String option = "";
        System.out.printf("%nYou can pick one of suggested options:%n%s%n%s%n%s%n%s%n%s%n%s%n", OPTION_A, OPTION_B, OPTION_C, OPTION_D, OPTION_E, OPTION_F);
        Scanner sc = new Scanner(System.in);


        while (flag) {
            String a = sc.nextLine();
            //a = a.toUpperCase();
            char b = a.toCharArray()[0];
            int num = b;

            if (a.length() == 1) {
                switch (num) {
                    case 65:
                        option = getUserData().toUpperCase();
                        flag = true;
                        System.out.println(option);
                        break;
                    case 66:
                        option = getUserData().toLowerCase();
                        flag = true;
                        System.out.println(option);
                        break;
                    case 67:
                        option = convertFirstLettersToCapital(getUserData());
                        flag = true;
                        System.out.println(option);
                        break;
                    case 68:
                        option = convertFirstLettersToLower(getUserData());
                        System.out.println(option);
                        flag = true;
                        break;
                    case 69:
                        option = convertFirstLetterToCapital(getUserData());
                        flag = true;
                        System.out.println(option);
                        break;
                    case 70:
                        option = "Program has been terminated";
                        flag = false;
                        break;
                    default:
                        System.out.println("You can pick only one of suggested options");
                        flag = true;
                }
            } else {
                System.out.println("You can pick only one of suggested options");
                flag = true;
            }
        }


        return option;
    }

    public static void main(String[] args) {
        FirstTask firstTask = new FirstTask();
        System.out.println("Enter some text");
        firstTask.setUserData();
        System.out.println(firstTask.getUserOption());
    }
}

