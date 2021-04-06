package com.learnauto.testcases;

import com.learnauto.com.learnauto.utility.BrowserFactory;
import com.learnauto.com.learnauto.utility.ExcelDataProvider;
import com.learnauto.pages.BaseClass;
import com.learnauto.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {


    @Test
    public void loginApp(){

       // driver = BrowserFactory.startApplication(driver,"Firefox","https://opensource-demo.orangehrmlive.com/");

        ExcelDataProvider excel = new ExcelDataProvider();

       // logger.info("URL is opened");
        System.out.println(driver.getTitle());

        LoginPage lp =new LoginPage(driver);
        lp.setUsername(excel.getStringData("Login",0,0));
        lp.setPassword(excel.getStringData("Login",0,1));
        lp.clickSubmit();

        if(driver.getTitle().equals("OrangeHRM")){
            Assert.assertTrue((true));
        }
        else
        {
            Assert.assertTrue(false);
        }

    }
}
