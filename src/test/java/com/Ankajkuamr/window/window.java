package com.Ankajkuamr.window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class window {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);

        String parent_id = driver.getWindowHandle();
        System.out.println(parent_id);
        System.out.println(driver);

        WebElement element = driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
        element.click();


        Set<String> windows_hanles_ids = driver.getWindowHandles();
        System.out.println(windows_hanles_ids);


        for(String window:  windows_hanles_ids){
            driver.switchTo().window(window);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test Cases passed!");
            }

        }

        driver.switchTo().window(parent_id);


    }

}
