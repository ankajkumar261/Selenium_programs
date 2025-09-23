package com.Ankajkuamr.seleniumexpection;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumExpectionfux {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");

        try {
            driver.findElement(By.id("pramod"));
        } catch (NoSuchElementException e) {
            System.out.println("doest not able to find the element");

        }
    }
}
