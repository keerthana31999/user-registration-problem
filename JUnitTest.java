package com.unittest.UserValidation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitTest {
        @Test
        void CheckGiven_FirstName_WhileCorrect_Return_Happy_WhileWrong_Return_Sad() {
            UserValidation fName = new UserValidation();
            String res = fName.firstName("KEERTHANA");
            String ress = fName.firstName("KEERTANA");
            Assertions.assertEquals("HAPPY", res);
            Assertions.assertEquals("SAD", ress);
        }

        @Test
        void CheckGiven_LastName_WhileCorrect_Return_Happy_WhileWrong_Return_Sad() {
            UserValidation lName = new UserValidation();
            String  res1 = lName.lastName("JUJJAVARAPU");
            String  res11 = lName.lastName("Jujjavrp");
            Assertions.assertEquals("HAPPY", res1);
            Assertions.assertEquals("SAD", res11);
        }

        @Test
        void CheckGiven_Email_WhileCorrect_Return_Happy_WhileWrong_Return_Sad() {
            UserValidation eMail = new UserValidation();
            String res2 = eMail.email("abc.abc@bl.co.us");
            String res22 = eMail.email("aXc.abc@bl.co.us");
            Assertions.assertEquals("HAPPY", res2);
            Assertions.assertEquals("SAD", res22);
        }

        @Test
        void CheckGiven_PhoneNumber_WhileCorrect_Happy_WhileWrong_Return_Sad() {
            UserValidation phoneNum = new UserValidation();
            String res3 = phoneNum.phoneNumber("91 9490748791");
            String res33 = phoneNum.phoneNumber("90948");
            Assertions.assertEquals("HAPPY", res3);
            Assertions.assertEquals("SAD", res33);
        }

        @Test
        void CheckGiven_Password_WhileCorrect_Happy_WhileWrong_Return_Sad() {
            UserValidation passWord = new UserValidation();
            String res4 = passWord.password("idenTical@11");
            String res44 = passWord.password("idenT11");
            Assertions.assertEquals("HAPPY" ,res4);
            Assertions.assertEquals("SAD" ,res44);
        }

    }
