package com.Ankajkuamr.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex_07selenium_close_quit {
    public static void main(String[] args) {

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://google.com");

        // Wait
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        webDriver.close();
        // Close - will close the current tab, not the session (not the all tabs)
//        // session id != null



//        driver.quit();
        // It will close all the tabs. - session id == null



    }
}
