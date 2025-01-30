// Fixed the "Stale Element Reference Exception" with refind element

package com.mahendhergannarapu.Sel_08012025_Sel_Exception;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaleElementReferenceExceptionFix {

    @Description("Verify Stale Element Reference Exception")
    @Test
    public void test_Method() throws InterruptedException {
        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.get("https://google.com");
            driver.manage().window().maximize();

            WebElement search_inputbox =driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            driver.navigate().refresh();
            // HTML Page (DOM) is not refreshed,
            // Driver will think that, element may or may not available now.
            // I have found the element before refresh.

            // Refresh, Navigate other Page, change in DOM elements (Ajax Calls) - VueJS, AngularJS

            //If you want to fix the stale element exp - refind the element after DOM changes)
            search_inputbox =driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

            search_inputbox.sendKeys("Testing Academy" + Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
