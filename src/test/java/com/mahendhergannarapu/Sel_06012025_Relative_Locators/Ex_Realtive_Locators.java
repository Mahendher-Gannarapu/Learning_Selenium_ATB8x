package com.mahendhergannarapu.Sel_06012025_Relative_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Ex_Realtive_Locators {

    @Test
    public void testMethod() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        WebElement span_element = driver.findElement(By.xpath("//span[text() ='Years of Experience']"));
        driver.findElement(with(By.id("exp-2")).toRightOf(span_element)).click();
        //Please find by element of this- with(By.id("exp-2"))
        // which is present right of this element - toRightOf(span_element)).click();


        Thread.sleep(10000);
        driver.quit();
    }
}
