package com.Ankajkuamr.shadowDOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.Ankajkuamr.utils.commantoall.closeBrowser;

public class dom {



        @Test
        public void test_js() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://selectorshub.com/xpath-practice-page/");
            driver.manage().window().maximize();


//        driver.findElement(By.id("pizza")).sendKeys("farmhouse");

            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector('div#app2').shadowRoot.querySelector('#pizza');");
            inputboxPizza.sendKeys("farmhouse");

            closeBrowser(driver);





        }
    }

