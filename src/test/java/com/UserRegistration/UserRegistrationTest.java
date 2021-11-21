package com.UserRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration=new UserRegistration();

    @Test
    public void givenFirstName_ShouldReturnHappy_IfValid() throws UserRegistrationException {
           boolean actualResult = userRegistration.firstName("Meghnad");
           Assertions.assertTrue(actualResult);
    }

    @Test
    public void givenFirstName_ShouldReturnSad_IfInvalid() throws UserRegistrationException {
            boolean actualResult = userRegistration.firstName("M");
            Assertions.assertTrue(actualResult);
        }

    @Test
    public void givenLastName_ShouldReturnHappy_IfValid() throws UserRegistrationException {
        boolean actualResult = userRegistration.lastName("Shirole");
        Assertions.assertTrue(actualResult);
    }

    @Test
    public void givenLastName_ShouldReturnSad_IfInvalid() throws UserRegistrationException {
            boolean actualResult = userRegistration.lastName("S");
            Assertions.assertTrue(actualResult);
    }

    @Test
    public void givenEmailId_ShouldReturnHappy_IfValid() throws UserRegistrationException {
            boolean actualResult = userRegistration.emailId("shirolemeghnad10@gmail.com");
            Assertions.assertTrue(actualResult);
    }

    @Test
    public void givenEmailId_ShouldReturnSad_IfInvalid() throws UserRegistrationException {
            boolean actualResult = userRegistration.emailId("shirolemeghnad10@gmail.com");
            Assertions.assertTrue(actualResult);
    }

    @Test
    public void givenPhoneNumber_ShouldReturnHappy_IfValid() throws UserRegistrationException {
           boolean actualResult = userRegistration.phoneNumber("919763930211");
           Assertions.assertTrue(actualResult);
    }

    @Test
    public void givenPhoneNumber_ShouldReturnSad_IfInvalid() throws UserRegistrationException {
           boolean actualResult = userRegistration.phoneNumber("956321");
           Assertions.assertTrue(actualResult);
    }

    @Test
    public void givenPassword_ShouldReturnHappy_IfValid() throws UserRegistrationException {
           boolean actualResult =userRegistration.password("Megh@123");
           Assertions.assertTrue(actualResult);
    }

    @Test
    public void givenPassword_ShouldReturnSad_IfInvalid() throws UserRegistrationException {
         boolean actualResult = userRegistration.password("meghnads");
         Assertions.assertTrue(actualResult);
    }
}