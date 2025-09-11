package com.Ankajkuamr.Waits;

import com.Ankajkuamr.utils.commantoall;
import com.Ankajkuamr.waithelper.waithelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class modal extends commantoall {

    @Test
    public void test() {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.makemytrip.com/");

        new waithelper().waitForVisibility(driver,5,"//span[@class =\"commonModal__close\"]");

        WebElement element = driver.findElement(By.xpath("//span[@class =\"commonModal__close\"]"));
        element.click();

        closeBrowser(driver);





    }
}
