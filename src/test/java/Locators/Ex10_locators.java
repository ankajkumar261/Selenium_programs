package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex10_locators {


    @Test
    public void testcase (){

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://app.vwo.com/#/login");
        webDriver.manage().window().maximize();


        //<input type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi">

        WebElement username = webDriver.findElement(By.id("login-username"));
        username.sendKeys("admin@123.com");


       // <input type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe">

        WebElement password = webDriver.findElement(By.id("login-password"));
        password.sendKeys("1331");


        // <button
        // type="submit"
        // id="js-login-btn"
        // class="btn btn--positive btn--inverted W(80%) H(48px) Fz(16px)"
        // onclick="login.login(event)"
        // data-qa="sibequkica"
        // >

       WebElement button = webDriver.findElement(By.id("js-login-btn"));
       button.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Step 5 - Verify the message error message.
        // <div
        // class="notification-box-description"
        // data-qa="rixawilomi">
        // Your email, password, IP address or location did not match</div>

        WebElement message = webDriver.findElement(By.className("notification-box-description"));
        System.out.println(message.getText());

        Assert.assertEquals(message.getText(),"Your email, password, IP address or location did not match");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        webDriver.quit();

    }

}
