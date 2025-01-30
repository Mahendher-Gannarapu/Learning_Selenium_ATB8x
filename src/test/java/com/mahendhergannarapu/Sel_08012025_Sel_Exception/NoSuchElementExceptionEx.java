package com.mahendhergannarapu.Sel_08012025_Sel_Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NoSuchElementExceptionEx {

    @Test
    public void test_actions() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");

        try {
            driver.findElement(By.id("Mahendher"));
        } catch (NoSuchElementException e) {
            throw new RuntimeException(e);
        }
    }
}
