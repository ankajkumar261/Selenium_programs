package com.Ankajkuamr.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Ex_11_Xpath {

    public static void main(String[] args) {

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://app.vwo.com/#/login");


        WebElement username = webDriver.findElement(By.xpath("//Input [@id =\"login-username\"]"));
        username.sendKeys("dkjasdjk");

        WebElement password = webDriver.findElement(By.xpath("//Input [@id=\"login-password\"]"));
           password.sendKeys("kjvgujydghbv");



        webDriver.quit();


    }
}
