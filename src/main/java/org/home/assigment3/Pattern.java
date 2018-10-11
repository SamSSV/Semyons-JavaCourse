package org.home.assigment3;

public enum Pattern {

    USER_NAME_REG_EX("^[a-zA-Z]([a-zA-Z]|(?!\\-\\-)\\-|(?!\\s\\s)\\s){0,98}[a-zA-Z]$"),
    USER_PHONE_REG_EX("^\\+380[1-9][0-9]\\d{7}"),
    USER_EMAIL_REG_EX("^[0-9a-zA-Z\\-\\_\\+\\.]{1,50}\\@[a-z]{1,10}\\.[a-z]{2,4}$");

    String patternStr;


    Pattern(String pttrn) {
        this.patternStr = pttrn;
    }

    public String getPatternStr() {
        return patternStr;
    }
}
