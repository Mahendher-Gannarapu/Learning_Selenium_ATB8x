package com.mahendhergannarapu.Sel_09012025_DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataDrivenExcel {

    @Test(dataProvider = "getData", dataProviderClass = UtilExcel.class)
    public void test_VWOLogin(String email, String password)
    {
        System.out.println("Email -"+ email);
        System.out.println("Password -"+ password);
    }
}
