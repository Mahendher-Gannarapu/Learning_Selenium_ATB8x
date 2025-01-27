package com.mahendhergannarapu.Task_03012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Verify_EspoCRM {

    @Test
    public void test_method() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.us.espocrm.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

//          Assert.assertEquals(driver.getTitle(),"EspoCRM Demo");
          Assert.assertEquals(driver.getTitle(),"EspoCRM Demo");

          Assert.assertEquals(driver.getCurrentUrl(),"https://demo.us.espocrm.com/");
//          Assert.assertEquals(driver.getCurrentUrl(),"https://demo.us.espocrm.com/?l=en_US#Account");


        Thread.sleep(10000);
      WebElement button_Login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
      button_Login.click();
//      WebElement button_Login = driver.findElement(By.id("btn-login"));
//      button_Login.click();





        Thread.sleep(10000);
        driver.quit();
    }
}
