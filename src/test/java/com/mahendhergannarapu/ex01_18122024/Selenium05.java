package com.mahendhergannarapu.ex01_18122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium05 {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://apps.vwo.com");
    }
}
