package com.UserRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration=new UserRegistration();

    @Test
    public void givenFirstName_ShouldReturnHappy_IfValid() throws UserRegistrationException {
           String expectedVal = "Happy";
           String actualResult = userRegistration.firstName("Meghnad");
           Assertions.assertEquals(expectedVal, actualResult);
    }

    @Test
    public void givenFirstName_ShouldReturnSad_IfInvalid() throws UserRegistrationException {
            String expectedVal = "Sad";
            String actualResult = userRegistration.firstName("M");
            Assertions.assertEquals(expectedVal, actualResult);
        }

    @Test
    public void givenLastName_ShouldReturnHappy_IfValid() throws UserRegistrationException {
        String expectedVal = "Happy";
        String actualResult = userRegistration.lastName("Shirole");
        Assertions.assertEquals(expectedVal, actualResult);
    }

    @Test
    public void givenLastName_ShouldReturnSad_IfInvalid() throws UserRegistrationException {
            String expectedVal = "Sad";
            String actualResult = userRegistration.lastName("S");
            Assertions.assertEquals(expectedVal, actualResult);
    }

    @Test
    public void givenEmailId_ShouldReturnHappy_IfValid() throws UserRegistrationException {
            String expectedVal = "Happy";
            String actualResult = userRegistration.emailId("shirolemeghnad10@gmail.com");
            Assertions.assertEquals(expectedVal, actualResult);
    }

    @Test
    public void givenEmailId_ShouldReturnSad_IfInvalid() throws UserRegistrationException {
            String expectedVal = "Sad";
            String actualResult = userRegistration.emailId("shirolemeghnad10@gmail.com");
            Assertions.assertEquals(expectedVal, actualResult);
    }

    @Test
    public void givenPhoneNumber_ShouldReturnHappy_IfValid() throws UserRegistrationException {
           String expectedVal = "Happy";
           String actualResult = userRegistration.phoneNumber("919763930211");
           Assertions.assertEquals(expectedVal, actualResult);
    }

    @Test
    public void givenPhoneNumber_ShouldReturnSad_IfInvalid() throws UserRegistrationException {
           String expectedVal = "Sad";
           String actualResult = userRegistration.phoneNumber("956321");
           Assertions.assertEquals(expectedVal, actualResult);
    }

    @Test
    public void givenPassword_ShouldReturnHappy_IfValid() throws UserRegistrationException {
           String expectedVal = "Happy";
           String actualResult =userRegistration.password("Megh@123");
           Assertions.assertEquals(expectedVal, actualResult);
    }

    @Test
    public void givenPassword_ShouldReturnSad_IfInvalid() throws UserRegistrationException {
         String expectedVal = "Sad";
         String actualResult = userRegistration.password("meghnads");
         Assertions.assertEquals(expectedVal, actualResult);
    }
}


