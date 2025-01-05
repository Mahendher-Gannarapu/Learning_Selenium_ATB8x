package com.mahendhergannarapu.ex05_03012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Verify_XPath_Axes {

    @Test
    public void test_method() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cdpn.io/abdullashSajjad/fullpage/LYGVRgK?anon=true&view=fullpage");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        Assert.assertEquals(driver.getTitle(),"JS Form Validation");
        Assert.assertEquals(driver.getCurrentUrl(),"https://cdpn.io/abdullashSajjad/fullpage/LYGVRgK?anon=true&view=fullpage");

        driver.switchTo().frame("result");

        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        button.click();

        //Once click on Submit button error message will dispaly
        String input_box_path = "//input[@id='username']";
        String small_path = input_box_path+"/following-sibling::small";
        String label_path = input_box_path+"/preceding-sibling::label";
        WebElement error_small_tag = driver.findElement(By.xpath(small_path));
        WebElement error_label_tag = driver.findElement(By.xpath(label_path));
        System.out.println(error_small_tag.getText());
        System.out.println(error_label_tag.getText());

        Assert.assertEquals(error_small_tag.getText(),"Username must be at least 3 characters");
        Assert.assertEquals(error_label_tag.getText(),"Username");

        Thread.sleep(3000);
        driver.quit();
    }
}
