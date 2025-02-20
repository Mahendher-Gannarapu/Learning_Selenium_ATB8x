package com.mahendhergannarapu.Sel_08012025_ActionsAdvance;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Upload_File_Example {

    @Description("Verify the file upload")
    @Test
    public void test_Actions() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));

        //Working Directory
        String working_dir = System.getProperty("user.dir");
        System.out.println(working_dir);
        uploadFileInput.sendKeys(working_dir+"/src/test/java/com/mahendhergannarapu/Sel_08012025_ActionsAdvance/Testdata.txt");
        driver.findElement(By.name("submit")).click();

        //Thread.sleep(3000);
        driver.quit();

        
    }
}
