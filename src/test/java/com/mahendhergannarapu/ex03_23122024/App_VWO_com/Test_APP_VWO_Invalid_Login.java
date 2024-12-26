// Invalid login for the app.VWO.com and error message
package com.mahendhergannarapu.ex03_23122024.App_VWO_com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class Test_APP_VWO_Invalid_Login {

    @Test
    public void test() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        //Step 1: Find the email inputbox and enter the email
        //<input type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi">
        //By is a class which is basically having methods id, name, tagName, xpath etc
        // How you want find element with By methods
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");
        //sendKeys() is function which will basically enter charSequence

        //Step 2: Find the password inputbox and enter the password
        // <input type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe"
        // data-gtm-form-interact-field-id="2">

        // If the "Id" is not available use this pattern
        // unique ID -> name -> class Name -> TagName -> Link Text/ Partial  - CSS Selector -> XPath(95%).
        WebElement passwordInputBox = driver.findElement(By.id("login-password"));
        passwordInputBox.sendKeys("admin");

        //Step 3: Find the "Signin" button and enter button
        // <button type="submit"
        // id="js-login-btn"
        // class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)"
        // onclick="login.login(event)"
        // data-qa="sibequkica">

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        Thread.sleep(3000);

        //Step 4: Find Error message correct or not (Fetch error message)
        //<div class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi"> ->Custom Attribute- Not Id, Name, ClassName, TagName
        // Your email, password, IP address or location did not match</div>

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        //We can use assertJ also instead of Assert
        assertThat(error_message.getText()).isNotEmpty().isNotBlank().isEqualTo("Your email, password, IP address or location did not match");
        driver.quit();

    }

}
