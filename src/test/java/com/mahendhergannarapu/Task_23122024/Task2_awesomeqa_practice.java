package com.mahendhergannarapu.Task_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2_awesomeqa_practice {

    @Test
    public void test_Method09() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/practice.html");

        //Assert.assertEquals(driver.getTitle(),"awesomeqa.com/practice.html");
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/practice.html");

        //Step 1: Verify the First name field
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Mahendher");

        //Step 2: Verify the Last name field
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Gannarapu");

        //Step 3: Verify the Gender
        //<input id="sex-0"
        // name="sex"
        // style="font-size: 14px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding: 0px; vertical-align: baseline;"
        // type="radio"
        // value="Male">
        WebElement gender_Radio_Button = driver.findElement(By.id("sex-0"));
        gender_Radio_Button.click();

        //Step 4: Verify the Years of the Experience
        WebElement years_of_Experience_radio = driver.findElement(By.id("exp-5"));
        years_of_Experience_radio.click();

        //Step 5: Verify the Date
        WebElement date_Field = driver.findElement(By.id("datepicker"));
        date_Field.sendKeys("26-12-2024");

        //Step 6: Verify the Profession
        WebElement profession_CheckBox = driver.findElement(By.id("profession-0"));
        profession_CheckBox.click();

        //Step 7: Verify the AutomationTools
        WebElement automation_Tools_CheckBox = driver.findElement(By.id("tool-2"));
        automation_Tools_CheckBox.click();

        Thread.sleep(3000);
        driver.quit();
    }
}
