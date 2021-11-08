package com.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        firstName("Meghnad");
    }
    public static void firstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher match = pattern.matcher(firstName);
        if(match.find() && match.group().equals(firstName)) {
            System.out.println("valid FirstName");
        }
        else {
            System.out.println("invalid FirstName");
        }
    }
}
