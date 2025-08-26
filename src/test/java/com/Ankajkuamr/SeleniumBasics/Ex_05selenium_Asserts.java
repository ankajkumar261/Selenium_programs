package com.Ankajkuamr.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Ex_05selenium_Asserts {
    public static void main(String[] args) {

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://google.com");


        Assert.assertEquals(webDriver.getCurrentUrl(),"https://www.google.com/");


        webDriver.quit();


    }
}
