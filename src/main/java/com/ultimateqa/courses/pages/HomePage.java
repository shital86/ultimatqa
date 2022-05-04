package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By sign_inLink = By.xpath("//li[@class='header__nav-item header__nav-sign-in']//a[contains(text(),'Sign In')]");

    public void clickOnSignInLink(){
        clickOnElement(sign_inLink);
    }
}
