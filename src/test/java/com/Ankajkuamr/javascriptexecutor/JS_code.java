package com.Ankajkuamr.javascriptexecutor;

import com.Ankajkuamr.utils.commantoall;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JS_code extends commantoall {

    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        js.executeScript("window.location = 'https://www.google.com'");

        driver.get("https://selectorshub.com/xpath-practice-page/");
        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));

        js.executeScript("window.scrollBy(0, 500);");
        js.executeScript("window.scrollBy(0, 500);");

        String url = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();

        System.out.println(url);
        System.out.println(title);


        closeBrowser(driver);



    }
}
