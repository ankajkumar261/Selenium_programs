package com.Ankajkuamr.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex_06selenium_naviagte {
    public static void main(String[] args) {

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://google.com");

        webDriver.navigate().to("https://vwo.com/");
        webDriver.navigate().refresh();
        webDriver.navigate().back();

        webDriver.quit();

    }
}
