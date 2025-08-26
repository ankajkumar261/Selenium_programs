package com.Ankajkuamr.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ex_02selenium {



@Test
    public void testcase(){

        WebDriver webDriver = new FirefoxDriver();

        webDriver.get("https://google.com");

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    webDriver.quit();


    }

}
