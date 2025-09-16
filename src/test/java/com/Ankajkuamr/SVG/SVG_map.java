package com.Ankajkuamr.SVG;

import com.Ankajkuamr.waithelper.waithelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SVG_map {

    @Test
    public  static void testcase(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com/search");


        WebElement search_input = driver.findElement(By.name("q"));
        search_input.sendKeys("macmini");

        List<WebElement> svgElements = driver.findElements(By.xpath("//*[name()='svg']"));
        svgElements.get(0).click();
        List<WebElement> titlesResults = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));

        for (WebElement title : titlesResults) {
            System.out.println(title.getText());
        }



        // until Next button is visible, for loop
        WebElement next_button = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
        while(next_button.isDisplayed()){

            WebElement next_button_page2 = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
            next_button_page2.click();

            waithelper.waitForVisibility(driver, 5, "//div[contains(@data-id,'CPU')]/div/a[2]");


            List<WebElement> titlesResults2 = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));

            for (WebElement title :  titlesResults2){
                if(title.getText()!= null){
                    System.out.println(title.getText());
                }

            }
        }



    }
}
