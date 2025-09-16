package com.Ankajkuamr.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_specie {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();


        WebElement from_input = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));


        Actions actions = new Actions(driver);
        // move to element
        // click
        // sendkeys -BLR


        WebElement destination = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]/div/div/input"));


        actions.moveToElement(from_input).click().sendKeys("BLR").build().perform();
        actions.moveToElement(destination).click().sendKeys("DEL").build().perform();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }


    }

