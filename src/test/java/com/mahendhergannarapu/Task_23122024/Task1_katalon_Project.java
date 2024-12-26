package com.mahendhergannarapu.Task_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1_katalon_Project {

    @Test
    public void test_Method08() throws InterruptedException {
        // **EdgeOptions** -> It will help you set the browser
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        //Step 1: open the https://katalon-demo-cura.herokuapp.com/
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        //Verify the Title and url by using Assert
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");

        //Step 2: Click on the make appointment button
        // <a id="btn-make-appointment" href="./profile.php#login"
        // class="btn btn-dark btn-lg">
        // Make Appointment</a>
        // Link Text - Full Match
        WebElement make_appointment = driver.findElement(By.linkText("Make Appointment"));
        make_appointment.click();

        //Step 3: Find username,password - enter them  , John Doe, ThisIsNotAPassword
        //<input type="text"
        // class="form-control"
        // id="txt-username"
        // name="username"
        // placeholder="Username"
        // value=""
        // autocomplete="off">
        WebElement user_name = driver.findElement(By.id("txt-username"));
        user_name.sendKeys("John Doe");

        //<input type="password"
        // class="form-control"
        // id="txt-password"
        // name="password"
        // placeholder="Password"
        // value="" autocomplete="off">
        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        //Step 4: Click on the submit button
        // <button
        // id="btn-login"
        // type="submit"
        // class="btn btn-default">
        // Login
        // </button>
        WebElement button = driver.findElement(By.id("btn-login"));
        button.click();

        //Step 5: Verify the driver. currentUrl == https://katalon-demo-cura.herokuapp.com/#appointment
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        //Sleep mode
        Thread.sleep(3000);

        //Quit the WebDriver
        driver.quit();
    }
}
