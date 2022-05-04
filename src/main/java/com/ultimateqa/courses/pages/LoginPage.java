package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By welcomebackText = By.xpath("//h1[@class='page__heading']");
    By emailField = By.xpath("//input[@id='user[email]']");
    By passwordField = By.xpath("//input[@id='user[password]']");
    By loginButton = By.xpath("//input[@type='submit']");
    By errormessage = By.xpath("//li[@class='form-error__list-item']");

    public String getWelcomeText() {
        return getTextFromElement(welcomebackText);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errormessage);


    }

}
