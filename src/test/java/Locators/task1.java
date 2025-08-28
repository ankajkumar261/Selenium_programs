package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task1 {

    @Test
    public void testcase() {


    WebDriver webDriver = new FirefoxDriver();
    webDriver.get("https://app.vwo.com/#/login");
    webDriver.manage().window().maximize();


    //<a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link Td(n)"
        // data-qa="bericafeqo">Start a free trial</a>

        WebElement startlink= webDriver.findElement(By.linkText("Start a free trial"));
        startlink.click();


       // <input class="W(100%) Py(14px) input-text" placeholder="name@yourcompany.com"
        // type="email"
        // id="page-v1-step1-email"
        // name="email"
        // data-qa="page-su-step1-v1-email" required="">

        WebElement email = webDriver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("jadbj");


        //<input class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)"
        // type="checkbox"
        // name="gdpr_consent_checkbox"
        // id="page-free-trial-step1-cu-gdpr-consent-checkbox"
        // value="true" data-qa="page-free-trial-step1-gdpr-consent-checkbox" data-gtm-form-interact-field-id="0">

        WebElement button1 = webDriver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        button1.click();


        //<button type="submit"
        // class="button W(100%) btn-modal-form-submit"
        // data-qa="page-su-submit"
        // value="">Create a Free Trial Account</button>

        WebElement createButton = webDriver.findElement(By.className("btn-modal-form-submit"));
        createButton.click();

        //<div class="C(--color-red) Fz(--font-size-12) Trsp(--Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
                //The email address you entered is incorrect.</div>

        WebElement message = webDriver.findElement(By.xpath("//div[contains(@class,'invalid-reason') and contains(text(),'The email address you entered is incorrect.')]"));
        System.out.println(message.getText());

        Assert.assertEquals(message.getText(),"The email address you entered is incorrect.");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        webDriver.quit();

    }

}
