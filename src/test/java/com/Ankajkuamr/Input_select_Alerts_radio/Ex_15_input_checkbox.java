package com.Ankajkuamr.Input_select_Alerts_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ex_15_input_checkbox {


    @Test
    public void testcase(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.name("firstname"));
        WebElement element1= driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        element1.sendKeys("Ankaj");


        // Radio Button
        WebElement radiobox = driver.findElement(By.id("exp-1"));
        radiobox.click();

        // checkbox
        WebElement checkbox = driver.findElement(By.id("profession-0"));
        checkbox.click();




        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // CHeck Box
        driver.quit();



    }

}
