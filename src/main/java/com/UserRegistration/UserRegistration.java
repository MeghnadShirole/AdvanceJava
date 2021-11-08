package com.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        firstName("Meghnad");
        lastName("Shirole");
        emailId("shirolemeghnad10@gmail.com");
        phoneNumber("919890964596");
        /*
        *User need to  follow pre-defined  Password rules.
        *Rule4 – minimum 8 Characters and at least 1 special character
        */
        password("passW@rd3");
        testForValidEmails();
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
    public static void lastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher match = pattern.matcher(lastName);
        if(match.find() && match.group().equals(lastName)) {
            System.out.println("valid LastName");
        }
        else {
            System.out.println("invalid lastName");
        }
    }
    public static void emailId(String emailId) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]*[a-zA-Z0-9]?@[a-zA-Z0-9]+.([.][a-zA-Z]+)+$");
        Matcher match = pattern.matcher(emailId);
        if(match.find() && match.group().equals(emailId)) {
            System.out.println("valid Email");
        }
        else {
            System.out.println("invalid Email");
        }
    }
    public static void phoneNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile("^(\\d{1,2}?)[- .]?\\d{9,10}$");
        Matcher match = pattern.matcher(mobileNumber);
        if(match.find() && match.group().equals(mobileNumber)) {
            System.out.println("valid phoneNumber");
        }
        else {
            System.out.println("invalid phoneNumber");
        }
    }
    public static void password(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$");
        Matcher match = pattern.matcher(password);
        if(match.find() && match.group().equals(password)) {
            System.out.println("valid password");
        }
        else {
            System.out.println("invalid password");
        }
        System.out.println("==================");
    }
    static String[] validEmails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
            "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
            "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "abc",
            "abc@.com.my","abc123@gmail.a", "abc123@.com",
            "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
            "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
            "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

    public static void testForValidEmails() {
        System.out.println("EmailId Check\n");
        for (int i = 0; i < validEmails.length; i++) {
            Pattern pattern = Pattern.compile("^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$");
            Matcher match = pattern.matcher(validEmails[i]);
            if(match.matches())
            {
                System.out.println(validEmails[i]+" --> Is Valid");
            } else {
                System.out.println(validEmails[i]+" --> Is Invalid");
            }
        }
    }
}
