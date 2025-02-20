package com.mahendhergannarapu.Sel_08012025_ActionsAdvance;

import io.qameta.allure.Description;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scrolling_Page_Example {

    @Description("Verify the scrolling")
    @Test
    public void test_Actions() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://thetestingacademy.com/");
        driver.manage().window().maximize();

        Actions actions= new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
        System.out.println("Scroll down");

        Thread.sleep(3000);
        driver.quit();
    }
}
