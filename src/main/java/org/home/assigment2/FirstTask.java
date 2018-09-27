package org.home.assigment2;

import java.util.Scanner;

public class FirstTask {
    static String firstLine;
    static String title = "Course: Java core";
    static String role = "Student";
    static String flmName;
    static String lastLine;
    static int maxStrLenght;

    public static String getUserData() {
        System.out.println("Enter Your First\\Last name");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        return flmName = a;

    }

    public static int getMaxStrLength() {

        int a = (flmName.length() > title.length()) ? flmName.length() : title.length();
        return maxStrLenght = a + 4;
    }

    public static void drawFrame() {


        int counter = maxStrLenght;
        StringBuilder builderLine = new StringBuilder();
        while (counter > 0) {
            String a = builderLine.insert(0, "*").toString();
            firstLine = a;
            lastLine = a;
            counter = counter - 1;
        }

        System.out.println(firstLine);
        System.out.println(drawBaseLine(title));
        System.out.println(drawBaseLine(role));
        System.out.println(drawBaseLine(flmName));
        System.out.println(lastLine);

    }

    public static String drawBaseLine(String str1) {
        int allSpaces = maxStrLenght - 2 - str1.length();
        int spaceBefore = allSpaces / 2;
        int spaceAfter = allSpaces - spaceBefore;

        String base = "*";

        base += spaceString(spaceBefore) + str1 + spaceString(spaceAfter);

        base += "*";

        return base;
    }

    public static String spaceString(int num) {
        String space = "";
        for (int i = 0; i < num; i++) {
            space += " ";
        }
        return space;
    }

    public static void main(String[] args) {
        getUserData();
        getMaxStrLength();
        drawFrame();


    }

}
