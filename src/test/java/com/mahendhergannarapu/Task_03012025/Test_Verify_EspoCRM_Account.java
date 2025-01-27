package com.mahendhergannarapu.Task_03012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Test_Verify_EspoCRM_Account {

    @Test
    public void test_method() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.us.espocrm.com/#");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        Thread.sleep(10000);
        WebElement login_Button = driver.findElement(By.id("btn-login"));
        login_Button.click();

        //WebElement menu = driver.findElement(By.xpath("//a[@class='side-menu-button']"));
//        WebElement menu = driver.findElement(By.className("fas fa-bars"));
//        menu.click();

//        WebElement accountElement = driver.findElement(By.xpath("//span[text()='Accounts']"));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Accounts']")));
//
//        accountElement.click();
//
//        WebElement createAccountButton = driver.findElement(By.xpath("//span[normalize-space()='Create Account']"));
//        createAccountButton.click();

//      Assert.assertEquals(driver.getCurrentUrl(),"https://demo.us.espocrm.com/#Account");
//      Thread.sleep(10000);
//      WebElement button_Login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
//      button_Login.click();

        WebElement createAccountButton = driver.findElement(By.xpath("//span[normalize-space()='Create Account']"));
        createAccountButton.click();

        List<WebElement> inputElementOfForm = driver.findElements(By.xpath("//input[contains(@class, 'main-element')]"));
        inputElementOfForm.get(0).sendKeys("Mahi");

        inputElementOfForm.get(1).sendKeys("mahi.com");

        WebElement emailElement = driver.findElement(By.xpath("//input[contains(@class,'email-address')]"));
        emailElement.sendKeys("mahi123@gmail.com");


        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//div[text()='Office']"))).click().perform();
        action.moveToElement(driver.findElement(By.xpath("(//div[@class=\"option\"])[3]"))).click().perform();


        WebElement saveButton = driver.findElement(By.xpath("//button[text()='Save']"));
        saveButton.click();
        Thread.sleep(50000);
        driver.quit();
    }
}
