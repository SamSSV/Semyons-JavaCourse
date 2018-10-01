package org.home.practices;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    static Random rd = new Random();
    static String validDigits = "1234567890"; // 1 - 3 chars
    static String validSpecChars = "!@#$%^&*"; // 1 char
    static String validChars = "ABCDabcd"; // < pass.length() но не более 2 символов подряд
    static final int digitsGroup = 0;
    static final int specCharsGroup = 1;
    static final int charsGroup = 2;
    static int userData;


    public static char generateRandomChar(String str1) {
        int randomIndex = rd.nextInt(str1.length());
        return str1.charAt(randomIndex);
    }

    public static int getUserData() {
        System.out.println("Please Enter password length.");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine()); ;
        while (a >= 21 || a <=7) {
            System.out.println("Enter password length. %n Password length should be less then 21 and great then 7");
            a = Integer.parseInt(sc.nextLine());
        }
        return userData = a;


    }

    public static String generatePassword(int size) {
        boolean specCharFlag = false;
        int digitsCounter = 0;
        StringBuilder pass = new StringBuilder();
        char randomChar = '0';
        while (size != pass.length()) {
            int randomGroup = rd.nextInt(3);

            switch (randomGroup) {
                case digitsGroup:
                    if (digitsCounter <= 3) {
                        randomChar = generateRandomChar(validDigits);
                        digitsCounter++;
                        break;
                    }
                case specCharsGroup:
                    if (!specCharFlag) {
                        randomChar = generateRandomChar(validSpecChars);
                        specCharFlag = true;
                    }
                    break;
                case charsGroup:
                    randomChar = generateRandomChar(validChars);
                    break;

            }

            if ((pass.length() == 0) || (pass.charAt(pass.length() - 1) != randomChar)) {
                pass.append(randomChar);
            }
        }
        return pass.toString();
    }

    public static void main(String[] args) {
        System.out.println(generatePassword(getUserData()));
    }
}
