package com.mahendhergannarapu.ex01_18122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium02 {

    @Test
    public void test_Selenium()
    {
        //WebDriver Hierarchy
        WebDriver driver = new EdgeDriver(); //Father reference and child object -dynamic Dispatch
        //WebDriver driver1 = new ChromeDriver();
        //WebDriver driver2 = new FirefoxDriver();
        //WebDriver driver3 = new InternetExplorerDriver();
        //WebDriver driver4 = new SafariDriver();


//SearchContext(I) (2) -> WebDriver(I)( 10) -> RemoteWebDriver(C) (15) -> ChromiumDriver(C) 25 -> EdgeDriver(C) (45)

//SearchContext(I) -> WebDriver(I) -> RemoteWebDriver(C) -> ChromiumDriver(C) -> ChromeDriver(C)

// SearchContext - Interface - findElement, and findElements - GGF(Grand Grand Father)
// WebDriver - Interface - some incomplete functions - GF (Grand Father)
// RemoteWebDriver - Class- It also has some functions - F (Father)
// ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S


// SearchContext driver = new ChromeDriver();
// WebDriver driver = new ChromeDriver();
// RemoteWebDriver driver1 = new ChromeDriver();
//ChromeDriver  driver = new ChromeDriver();


// Scenarios
// 1. Do want to run on  Chrome or Edge?
// ChromeDriver driver = new ChromeDriver(); ~1%

// 2  Do you want to run on Chrome then change to Edge ?
//        WebDriver driver = new ChromeDriver();
//        driver = new EdgeDriver(); 97% -
//        driver = new Firefox(); 97% -


// 3. do you want to run on multiple browsers, aws machine, ? 2%
// RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)






    }

}
