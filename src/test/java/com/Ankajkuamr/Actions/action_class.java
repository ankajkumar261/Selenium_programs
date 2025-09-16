package com.Ankajkuamr.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class action_class {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement firstname = driver.findElement(By.name("firstname"));

        Actions actions = new Actions(driver);

        actions.keyDown(Keys.SHIFT)
                .sendKeys(firstname,"ankaj")
                .keyUp(Keys.SHIFT).build().perform();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();


    }

}
