package com.Ankajkuamr.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Ex_09selenium_projectno1 {


    @Test
    public void testcase(){

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://katalon-demo-cura.herokuapp.com/");

        Assert.assertEquals(webDriver.getTitle(),"CURA Healthcare Service");
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");

        if(webDriver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Testcase is passed");
            Assert.assertTrue(true);
        }
        else {
            System.out.println("Testcase is failed");
            Assert.fail();
        }

        webDriver.quit();


    }
}
