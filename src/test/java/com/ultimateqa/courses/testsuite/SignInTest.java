package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnSignInLink();
        String expectedMsg = "Welcome Back!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMsg, actualMessage, "Login Page not displayed");
        loginPage.enterEmailId("ab@yahoo.com");
        loginPage.enterPassword("Happy123");
        loginPage.clickOnLoginButton();

    }
    @Test
    public void verifyingErrorMsgByInvalidCredentials(){
        homePage.clickOnSignInLink();
        loginPage.enterEmailId("ab1@yahoo.com");
        loginPage.enterPassword("asd1234");
        loginPage.clickOnLoginButton();
        String extectedmsg="Invalid email or password.";
        String actualmsg=loginPage.getErrorMessage();
        Assert.assertEquals(extectedmsg,actualmsg);
    }


}
