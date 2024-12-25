//Important Interview Question
package com.mahendhergannarapu.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium12 {

    @Test
    public void testMethod04() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();

        //*** Without https protocal the sites are not opened
        //driver.get("sdet.live");
        driver.get("https://sdet.live");
        //driver.get("http://sdet.live");
       //driver.get("www.google.com");

    }
}
