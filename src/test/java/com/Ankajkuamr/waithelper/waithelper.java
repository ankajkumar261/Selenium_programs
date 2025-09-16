package com.Ankajkuamr.waithelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waithelper {


    public  static  void JVM(int time){

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void waitImpliciWait(WebDriver driver , int Time ){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Time));
    }

    public static void checkVisibilty(WebDriver driver , By Locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
    }

    public static void checkVisibilityOfAndTextToBePresentInElement(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.textToBePresentInElement(element, "Your email, password, IP address or location did not match"));

    }
    public static void waitForVisibility(WebDriver driver,int timeInSeconds, String xpath){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

    }

}
