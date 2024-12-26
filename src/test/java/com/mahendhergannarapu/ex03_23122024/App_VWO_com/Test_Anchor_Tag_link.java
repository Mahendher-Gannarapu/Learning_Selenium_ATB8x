//Verify the anchor tag "Start a free trial"
package com.mahendhergannarapu.ex03_23122024.App_VWO_com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Anchor_Tag_link {

    @Test
    public void test_Method07() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.VWO.com");

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        //<a ->Open a HTML tag
        // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link"
        // data-qa="bericafeqo">Start a free trial
        // </a> ->Close a HTML tag

        //Selenium provide two options to verify anchor tag use anyone
        // Link Text - Full Match
        // Partial Link Text - Partial Match

        // Link Text - Full Match
        WebElement link_free_trail_element = driver.findElement(By.linkText("Start a free trial"));
        link_free_trail_element.click();

        // Partial Link Text - Partial Match
        //WebElement link_free_trail_element = driver.findElement(By.partialLinkText("free trial"));
        //link_free_trail_element.click();

        Thread.sleep(3000);
        driver.quit();
    }
}
