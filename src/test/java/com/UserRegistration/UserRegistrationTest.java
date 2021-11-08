package com.UserRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_ShouldReturnHappy_IfValid() {
        String expectedVal = "Happy";
        String actualResult = UserRegistration.firstName("Meghnad");
        Assertions.assertEquals(expectedVal, actualResult);
    }

    @Test
    public void givenFirstName_ShouldReturnSad_IfInvalid() {
        String expectedVal = "Sad";
        String actualResult = UserRegistration.firstName("M");
        Assertions.assertEquals(expectedVal, actualResult);
    }

    @Test
    public void givenLastName_ShouldReturnHappy_IfValid() {
        String expectedVal = "Happy";
        String actualResult = UserRegistration.lastName("Shirole");
        Assertions.assertEquals(expectedVal, actualResult);
    }

    @Test
    public void givenLastName_ShouldReturnSad_IfInvalid() {
        String expectedVal = "Sad";
        String actualResult = UserRegistration.lastName("S");
        Assertions.assertEquals(expectedVal, actualResult);
    }

    @Test
    public void givenEmailId_ShouldReturnHappy_IfValid() {
        String expectedVal = "Happy";
        String actualResult = UserRegistration.emailId("shirolemeghnad10@gmail.com");
        Assertions.assertEquals(expectedVal, actualResult);
    }

    @Test
    public void givenEmailId_ShouldReturnSad_IfInvalid() {
        String expectedVal = "Sad";
        String actualResult = UserRegistration.emailId("abc");
        Assertions.assertEquals(expectedVal, actualResult);
    }

    @Test
    public void givenPhoneNumber_ShouldReturnHappy_IfValid() {
        String expectedVal = "Happy";
        String actualResult = UserRegistration.phoneNumber("919763930211");
        Assertions.assertEquals(expectedVal, actualResult);
    }

    @Test
    public void givenPhoneNumber_ShouldReturnSad_IfInvalid() {
        String expectedVal = "Sad";
        String actualResult = UserRegistration.phoneNumber("956321");
        Assertions.assertEquals(expectedVal, actualResult);
    }

    @Test
    public void givenPassword_ShouldReturnHappy_IfValid() {
        String expectedVal = "Happy";
        String actualResult = UserRegistration.password("Megh@123");
        Assertions.assertEquals(expectedVal, actualResult);
    }

    @Test
    public void givenPassword_ShouldReturnSad_IfInvalid() {
        String expectedVal = "Sad";
        String actualResult = UserRegistration.password("meghnads");
        Assertions.assertEquals(expectedVal, actualResult);
    }
}
