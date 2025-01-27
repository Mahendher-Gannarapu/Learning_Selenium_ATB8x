package com.mahendhergannarapu.Sel_06012025_JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSExecutorExample01 {

    @Test
    public void testMethod() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));
        js.executeScript("arguments[0].scrollIntoView(true);", div_to_scroll);



        Thread.sleep(10000);
        driver.quit();
    }
}
