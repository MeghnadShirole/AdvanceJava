package com.UserRegistration;

@FunctionalInterface
public interface UserValidate<T> {
    boolean validate(T param);
}