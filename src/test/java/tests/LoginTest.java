package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{


    @Test
    public void loginTest (){
        loginPage.login(standardUser, passwordReal);
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"));
    }

}