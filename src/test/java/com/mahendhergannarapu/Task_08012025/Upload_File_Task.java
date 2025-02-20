package com.mahendhergannarapu.Task_08012025;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Upload_File_Task {

    @Description("Verify the file upload")
    @Test
    public void test_Actions() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement uploadFileInput = driver.findElement(By.id("file-upload"));

        //Working Directory
        String working_dir = System.getProperty("user.dir");
        System.out.println(working_dir);
        uploadFileInput.sendKeys(working_dir+"/src/test/java/com/mahendhergannarapu/Task_08012025/Testdata1.txt");
        driver.findElement(By.id("file-submit")).click();

        //Thread.sleep(3000);
        driver.quit();

        
    }
}
