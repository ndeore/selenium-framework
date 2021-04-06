package com.learnauto.pages;

import com.learnauto.com.learnauto.utility.BrowserFactory;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.logging.Logger;


public class BaseClass {

    public String baseURL= "https://opensource-demo.orangehrmlive.com/";
    public String username = "Admin";
    public String password ="Admin";
    public static WebDriver driver;
    public static Logger logger;

    @BeforeClass
    public void setup(){


       driver = BrowserFactory.startApplication(driver,"Firefox",baseURL);

       // logger = Logger.getLogger("OrangeHRM");
       // PropertyConfigurator.configure("Log4j2.properties");

    }
    @AfterClass
    public void tearDown(){

        BrowserFactory.quitBrowser(driver);
    }
}
