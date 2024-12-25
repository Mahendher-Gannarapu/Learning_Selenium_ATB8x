package com.mahendhergannarapu.ex01_18122024;

import org.openqa.selenium.edge.EdgeDriver;

public class Selenium06 {
    public static void main(String[] args) {

        //It will run on only on Edge
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://apps.vwo.com");
        driver.quit();
    }
}
