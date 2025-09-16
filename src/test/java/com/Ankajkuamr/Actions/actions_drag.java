package com.Ankajkuamr.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_drag {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();


        Actions actions = new Actions(driver);

        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));


        actions.dragAndDrop(from,to).build().perform();


    }
}
