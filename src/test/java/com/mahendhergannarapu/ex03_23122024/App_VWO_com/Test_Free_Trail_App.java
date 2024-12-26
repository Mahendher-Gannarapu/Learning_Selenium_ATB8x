// Verify the free tail account
package com.mahendhergannarapu.ex03_23122024.App_VWO_com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Test_Free_Trail_App {

    @Test
    public void test_Method08() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://vwo.com/free-trial");

        Assert.assertEquals(driver.getTitle(),"Get Started with Free Trial | VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://vwo.com/free-trial");

        //<input class="W(100%) Py(14px) input-text"
        // placeholder="name@yourcompany.com" type="email"
        // id="page-v1-step1-email"
        // name="email"
        // data-qa="page-su-step1-v1-email"
        // required="">
        WebElement business_Email = driver.findElement(By.id("page-v1-step1-email"));
        business_Email.sendKeys("123456fdgfdsg");

        //<input
        // class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)"
        // type="checkbox"
        // name="gdpr_consent_checkbox"
        // id="page-331cu-gdpr-consent-checkbox"
        // value="true" data-qa="page-gdpr-consent-checkbox"
        // data-gtm-form-interact-field-id="1">
        WebElement check_Policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        check_Policy.click();

        //<button
        // type="submit"
        // class="button W(100%) btn-modal-form-submit button--disabled-primary"
        // data-qa="page-su-submit"
        // disabled="disabled">
        // Create a Free Trial Account
        // </button>

        //Here no id, class name so TagName as "button" using
        List<WebElement> button_list = driver.findElements(By.tagName("button"));
        button_list.get(0).click();

        //<div
        // class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
        // The email address you entered is incorrect.
        // </div>
        WebElement error_Message = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_Message.getText(),"The email address you entered is incorrect.");

        Thread.sleep(5000);


        driver.quit();

    }

}
