package com.learnauto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver ldriver) {

        driver = ldriver;
    }
        @FindBy(xpath = "//span[text()='Log In']")
        WebElement loginLink;

        @FindBy(


}
