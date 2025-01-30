package com.mahendhergannarapu.Sel_08012025_Sel_Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TimeOutExceptionExample {

    @Test
    public void test_Method01()
    {
        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.get("https://google.com");
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            //Searching a visibility of element
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='abc']")));
            // searching a element is not visible show the TimeoutException

            WebElement search_inputbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            search_inputbox.sendKeys("the testing academy");
        } catch (TimeoutException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End of the program");

        driver.quit();

    }
}
