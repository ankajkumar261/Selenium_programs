package com.Ankajkuamr.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex_03selenuim {
    public static void main(String[] args) {


        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://google.com");

        System.out.println(webDriver.getTitle());
        System.out.println(webDriver.getPageSource());
        System.out.println(webDriver.getCurrentUrl());


        webDriver.quit();
    }

}