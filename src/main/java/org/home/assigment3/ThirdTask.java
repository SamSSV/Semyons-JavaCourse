package org.home.assigment3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThirdTask {

    private String userName = "";
    private String userPhone = "";
    private String userEmail = "";

    public String getUserName() {
        return userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String setUserName() {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        while (!validateString(org.home.assigment3.Pattern.USER_NAME_REG_EX, a)) {
            System.out.println("Wrong user name format. User name should be great then 1 char and less then 101 chars.");
            System.out.println("Enter your name");
            a = sc.nextLine();
        }

        return userName = a;
    }

    public String setUserPhone() {
        System.out.println("Enter your phone number");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        while (!validateString(org.home.assigment3.Pattern.USER_PHONE_REG_EX, a)) {
            System.out.println("Wrong user phone format. User phone should be following format +380XXXXXXXXX.");
            System.out.println("Enter your phone");
            a = sc.nextLine();
        }

        return userPhone = a;
    }

    public String setUserEmail() {
        System.out.println("Enter your email");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        while (!validateString(org.home.assigment3.Pattern.USER_EMAIL_REG_EX, a)) {
            System.out.println("Wrong user email format.");
            System.out.printf("User email should be following format name letters,%n digits and spec chars \"-_+.\".only one in a row, then @");
            System.out.println("Enter your email");
            a = sc.nextLine();
        }
        return userEmail = a;
    }

    public boolean validateString(org.home.assigment3.Pattern pattern, String data) {
        Pattern pattern1 = Pattern.compile(pattern.getPatternStr());
        Matcher matcher = pattern1.matcher(data);
        return matcher.matches();
    }


    public static void main(String[] args) {
        ThirdTask thirdTask = new ThirdTask();
        thirdTask.setUserName();
        thirdTask.setUserPhone();
        thirdTask.setUserEmail();
        System.out.println("Your data was successfully saved");
    }


}
