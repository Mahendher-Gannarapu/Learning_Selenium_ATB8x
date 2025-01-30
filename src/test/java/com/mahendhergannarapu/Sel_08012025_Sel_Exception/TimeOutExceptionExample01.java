package com.mahendhergannarapu.Sel_08012025_Sel_Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TimeOutExceptionExample01 {

    @Test
    public void test_Method01()
    {
        WebDriver driver =new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Searching element is clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='APjFqb']")));

        WebElement search_inputbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        search_inputbox.sendKeys("the testing academy");

        driver.quit();

    }
}
