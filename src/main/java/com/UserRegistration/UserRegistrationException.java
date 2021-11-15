package com.UserRegistration;

public class UserRegistrationException extends Exception{
    public UserRegistrationException(String message) {
        super(message);
        System.out.println(message);
    }
}