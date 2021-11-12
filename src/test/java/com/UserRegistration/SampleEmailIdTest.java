package com.UserRegistration;

import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class SampleEmailIdTest {
    private final String emailIds;
     private final boolean expectedResult;

     SampleEmailIdTest(String emailId,boolean result){
         this.emailIds=emailId;
         this.expectedResult=result;
     }

    @Parameterized.Parameters
    public static Collection mailIdsExpectedResult() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false},
        });
    }

    @Test
    public void sampleEmails_shouldReturnTrue_ifValid() {
        boolean result = UserRegistration.testForValidEmails(this.emailIds);
        Assertions.assertEquals(this.expectedResult, result);
    }
}