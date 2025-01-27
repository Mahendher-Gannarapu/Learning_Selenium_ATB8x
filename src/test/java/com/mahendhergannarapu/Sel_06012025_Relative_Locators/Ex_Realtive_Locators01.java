package com.mahendhergannarapu.Sel_06012025_Relative_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Ex_Realtive_Locators01 {

    @Test
    public void testMethod() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        List<WebElement> element_SearchBox = driver.findElements(By.xpath("//input[@type='search']"));
        element_SearchBox.get(1).sendKeys("India" + Keys.ENTER);

        //Print all locations
        List<WebElement> locations = driver.findElements(By.cssSelector("div.location-name>p"));
        for (WebElement e: locations) {
            System.out.println(e.getText());

            String s1 = driver.findElement(with(By.tagName("p")).toLeftOf(e)).getText();
            String s2 = driver.findElement(with(By.tagName("span")).toRightOf(e)).getText();
            String s3 = driver.findElement(with(By.tagName("p")).above(e)).getText();
            String s4 = driver.findElement(with(By.tagName("p")).below(e)).getText();
            System.out.println(s1);
            System.out.println(s2);

            System.out.println("|" + s1 + "|" + e.getText() + "|" + s2 + "|");


        }

        Thread.sleep(10000);
        driver.quit();
    }
}
