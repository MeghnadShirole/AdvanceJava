package com.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws UserRegistrationException {

        UserRegistration userRegistration=new UserRegistration();

        userRegistration.firstName(scanner.next());
        userRegistration.lastName(scanner.next());
        userRegistration.emailId(scanner.next());
        userRegistration.phoneNumber(scanner.next());
        userRegistration.password(scanner.next());
    }

        public String firstName(String firstName) throws UserRegistrationException{
            //regex pattern
            String regex = "^[A-Z][a-z]{2,}$";
            try{
                Pattern pattern = Pattern.compile(regex);

                //checking input is empty or not
                if(firstName.isEmpty())
                    throw new UserRegistrationException("Please enter valid First Name!");
                Matcher matcher = pattern.matcher(firstName);
                if(matcher.matches()) {
                    System.out.println("valid Firstname");
                    System.out.println(analyseMood("Happy"));
                    return "Happy";
                }
                else {
                    return "Sad";
                }
            } catch(Exception e) {
                throw new UserRegistrationException("Please enter valid First Name!");
            }
        }

        public String lastName(String lastName) throws UserRegistrationException{
            //regex pattern
            String regex = "^[A-Z][a-z]{2,}$";
            try {
                Pattern pattern = Pattern.compile(regex);

                //checking input is empty or not
                if(lastName.isEmpty())
                    throw new UserRegistrationException("Please enter valid Last Name!");

                Matcher matcher = pattern.matcher(lastName);
                if(matcher.matches()) {
                    System.out.println("valid Lastname");
                    System.out.println(analyseMood("Happy"));
                    return "Happy";
                }
                else {
                    return "Sad";
                }
            } catch(UserRegistrationException e) {
                throw new UserRegistrationException("Please enter valid Last Name!" );
            }
        }

        public String emailId(String emailId) throws UserRegistrationException {
            //regex pattern
            String regex = "^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
            try {
                Pattern pattern = Pattern.compile(regex);

                //checking input is empty or not
                if(emailId.isEmpty())
                    throw new UserRegistrationException("Please enter valid Email ID!");

                Matcher matcher = pattern.matcher(emailId);
                if(matcher.matches()) {
                    System.out.println("valid EmailId");
                    System.out.println(analyseMood("Happy"));
                    return "Happy";
                }
                else {
                    return "Sad";
                }
            } catch(UserRegistrationException e) {
                throw new UserRegistrationException("Please enter valid Email ID!");
            }
        }

        public String phoneNumber(String mobNum) throws UserRegistrationException {
            //regex pattern
            String regex = "^[0-9]{1,3}-[0-9]{10}$";
            try {
                Pattern pattern = Pattern.compile(regex);

                //checking input is empty or not
                if(mobNum.isEmpty())
                    throw new UserRegistrationException("Please enter valid Mobile Number!");

                Matcher matcher = pattern.matcher(mobNum);
                if(matcher.matches()) {
                    System.out.println("valid PhoneNumber ");
                    System.out.println(analyseMood("Happy"));
                    return "Happy";
                }
                else {
                    return "Sad";
                }
            } catch(UserRegistrationException e) {
                throw new UserRegistrationException("Please enter valid Mobile Number!");
            }
        }

        public String password(String password) throws UserRegistrationException {
            //regex pattern
            String regex = "^[a-z](?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$";
            try {
                Pattern pattern = Pattern.compile(regex);

                //checking input is empty or not
                if(password.isEmpty())
                    throw new UserRegistrationException("Please enter valid Password!");

                Matcher matcher = pattern.matcher(password);
                if(matcher.matches()) {
                    System.out.println("valid Password");
                    System.out.println(analyseMood("Happy"));
                    return "Happy";
                }
                else {
                    return "Sad";
                }
            } catch(UserRegistrationException e) {
                throw new UserRegistrationException("Please enter valid Password!");
            }
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