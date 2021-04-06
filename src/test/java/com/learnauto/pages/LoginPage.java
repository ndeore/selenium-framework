package com.learnauto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

   // WebDriver driver;

    public LoginPage(WebDriver ldriver) {

        driver = ldriver;
        PageFactory.initElements(driver,this);

    }
        @FindBy(id ="txtUsername")
        WebElement usernametxt;

        @FindBy(name = "txtPassword")
        WebElement passwordtxt;

        @FindBy(xpath = "//input[@id='btnLogin']")
        WebElement loginbtn;


        public void setUsername(String uname){

            usernametxt.sendKeys(uname);
        }

        public void setPassword(String pwd){
            passwordtxt.sendKeys(pwd);
        }

        public void clickSubmit(){

            loginbtn.click();
        }
}
