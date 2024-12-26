package com.mahendhergannarapu.ex02_20122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class S13_FindHeader {
    @Test
    public void test_Method05() throws Exception
    {
        // Open the https://katalon-demo-cura.herokuapp.com/
        // Verify the title and search a string in pageSource
        // Add assertion that the "CURA Healthcare Service" is visible in the page source.

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // Alternate way to maximize ut use one above one or below one
        //driver.manage().window().maximize();

        //TestNG assertion
        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");

        //AssertJ Assertion
        assertThat(driver.getTitle()).isEqualTo("CURA Healthcare Service").isNotBlank().isNotEmpty();
        assertThat(driver.getCurrentUrl()).isEqualTo("https://katalon-demo-cura.herokuapp.com/");

        //Verify the "CURA Healthcare Service" on page source
        if(driver.getPageSource().contains("CURA Healthcare Service"))
        {
            Assert.assertTrue(true);
            System.out.println("Heading available");
        }
        else {
            throw new Exception("Heading is not found!!!");
        }

        driver.quit();

    }
}
