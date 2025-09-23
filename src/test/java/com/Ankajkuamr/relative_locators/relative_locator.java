package com.Ankajkuamr.relative_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class relative_locator {


    @Test

    public void testcase(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();


        WebElement element = driver.findElement(By.xpath("//span[text()=\"Years of Experience\"]"));

        driver.findElement(with(By.id("exp-1")).toRightOf(element)).click();

    }
}
