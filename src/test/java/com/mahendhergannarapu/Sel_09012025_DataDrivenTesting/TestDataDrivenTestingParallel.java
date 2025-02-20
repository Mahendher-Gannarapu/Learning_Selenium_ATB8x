package com.mahendhergannarapu.Sel_09012025_DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataDrivenTestingParallel {

    @DataProvider(name ="LoginData", parallel =true)
    public Object[][] getData()
    {
        return new Object[][]{
                new Object[]{"admin@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass123"},
                new Object[]{"admin1234@gmail.com", "pass123"}
        };
    }

    @Test(dataProvider = "LoginData")
    public void loginTest(String email, String password)
    {
        System.out.println(email + "|" +password);
    }
}
