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

        public boolean firstName(String firstName) throws UserRegistrationException{
            try {
                UserValidate<String> obj = (fn) -> {
                    String regex = "^[A-Z][a-z]{2,}$";
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(fn);
                    return matcher.matches();
                };
                return obj.validate(firstName);
            } catch (NullPointerException exception) {
                throw new UserRegistrationException("Invalid input");
            }
        }

        public boolean lastName(String lastName) throws UserRegistrationException{
            try {
                UserValidate<String> obj = (ln) -> {
                    String regex = "^[a-zA-Z]*$";
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(ln);
                    return matcher.matches();
                };
                return obj.validate(lastName);

            } catch (NullPointerException exception) {
                throw new UserRegistrationException("Invalid input");
            }
        }

        public boolean emailId(String emailId) throws UserRegistrationException {
            try {
                UserValidate<String> obj = (em) -> {
                    String regex = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z0-9]+.(com|net)(.[a-z]{2,3})?$";
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(em);
                    return matcher.matches();
                };
                return obj.validate(emailId);
            } catch (NullPointerException exception) {
                throw new UserRegistrationException("Invalid input");
            }
        }

        public boolean phoneNumber(String mobNum) throws UserRegistrationException {
            try {
                UserValidate<String> obj = (pn) -> {
                    String regex = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(pn);
                    return matcher.matches();
                };
                return obj.validate(mobNum);
            } catch (NullPointerException exception) {
                throw new UserRegistrationException("Invalid input");
            }
        }

        public boolean password(String password) throws UserRegistrationException {
            try {
                UserValidate<String> obj = (ps) -> {
                    String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(ps);
                    return matcher.matches();
                };
                return obj.validate(password);
            } catch (NullPointerException exception) {
                throw new UserRegistrationException("Invalid input");
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