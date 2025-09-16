package com.Ankajkuamr.fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class file_upload {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement upload = driver.findElement(By.id("fileToUpload"));
        String dir = System.getProperty("user.dir");

        //String path = dir + "src/test/java/com/Ankajkuamr/fileupload/testdata.txt";
        String path1 = "/home/kpit/IdeaProjects/Selenium_programs/src/test/java/com/Ankajkuamr/fileupload/testdata";
        upload.sendKeys(path1);
        driver.findElement(By.name("submit")).click();


    }
}
