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
//        testForValidEmails();
    }
    public static String firstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher match = pattern.matcher(firstName);
        if(match.find() && match.group().equals(firstName)) {
            System.out.println("valid FirstName");
            System.out.println(analyseMood("Happy"));
            System.out.println("==================");
            return "Happy";
        }
        else {
            System.out.println("invalid FirstName");
            System.out.println(analyseMood("Sad"));
            System.out.println("==================");
        }
        return "Sad";
    }

    public static String lastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher match = pattern.matcher(lastName);
        if(match.find() && match.group().equals(lastName)) {
            System.out.println("valid LastName");
            System.out.println(analyseMood("Happy"));
            System.out.println("==================");
            return "Happy";
        }
        else {
            System.out.println("invalid LastName");
            System.out.println(analyseMood("Sad"));
            System.out.println("==================");
        }
        return "Sad";
    }
    public static String emailId(String emailId) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]*[a-zA-Z0-9]?@[a-zA-Z0-9]+.([.][a-zA-Z]+)+$");
        Matcher match = pattern.matcher(emailId);
        if(match.find() && match.group().equals(emailId)) {
            System.out.println("valid Email");
            System.out.println(analyseMood("Happy"));
            System.out.println("==================");
            return "Happy";
        }
        else {
            System.out.println("invalid Email");
            System.out.println(analyseMood("Sad"));
            System.out.println("==================");
        }
        return "Sad";
    }
    public static String phoneNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile("^(\\d{1,2}?)[- .]?\\d{9,10}$");
        Matcher match = pattern.matcher(mobileNumber);
        if(match.find() && match.group().equals(mobileNumber)) {
            System.out.println("valid phoneNumber");
            System.out.println(analyseMood("Happy"));
            System.out.println("==================");
            return "Happy";
        }
        else {
            System.out.println("invalid phoneNumber");
            System.out.println(analyseMood("Sad"));
            System.out.println("==================");
        }
        return "Sad";
    }
    public static String password(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$");
        Matcher match = pattern.matcher(password);
        if(match.find() && match.group().equals(password)) {
            System.out.println("valid password");
            System.out.println(analyseMood("Happy"));
            System.out.println("==================");
            return "Happy";
        }
        else {
            System.out.println("invalid password");
            System.out.println(analyseMood("Sad"));
            System.out.println("==================");
        }
        return "Sad";
    }
    static String[] validEmails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
            "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
            "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "abc",
            "abc@.com.my","abc123@gmail.a", "abc123@.com",
            "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
            "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
            "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

    public static boolean testForValidEmails(String emailIds) {
        System.out.println("==================");
        System.out.println("EmailId Check\n");
        for (String validEmail : validEmails) {
            Pattern pattern = Pattern.compile("^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$");
            Matcher match = pattern.matcher(validEmail);
            if (match.matches()) {
                System.out.println(validEmail + " --> Is Valid");
            return true;
            }
            else {
                System.out.println(validEmail + " --> Is Invalid");
            }
        }
        return false;
    }
    /*
     *Mood Analyser For Valid and Invalid Entries
    */
    public static String analyseMood(String message) {
        if(message.contains("Happy")) {
            return "Entry Successful";
        }
        else {
            return "Entry Failed";
        }
    }
}