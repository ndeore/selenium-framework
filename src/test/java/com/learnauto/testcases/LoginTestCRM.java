package com.learnauto.testcases;

import com.learnauto.com.learnauto.utility.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTestCRM {

    WebDriver driver;
    @Test
    public void loginApp(){

        driver = BrowserFactory.startApplication(driver,"Firefox","https://freecrm.com/");

            System.out.println(driver.getTitle());

    }
}
