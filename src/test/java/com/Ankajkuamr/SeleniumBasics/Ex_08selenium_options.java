package com.Ankajkuamr.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Ex_08selenium_options {
    public static void main(String[] args) {


        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("-private");

        WebDriver webDriver = new FirefoxDriver(firefoxOptions);
        webDriver.get("https://google.com");

       webDriver.quit();
    }
}
