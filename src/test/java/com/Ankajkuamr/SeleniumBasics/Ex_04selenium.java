package com.Ankajkuamr.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex_04selenium {

    public static void main(String[] args) {

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://google.com");

        webDriver.manage().window().maximize();

        webDriver.quit();



    }
}
