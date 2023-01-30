package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;


import java.time.Duration;

public abstract class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait driverWait;

    protected LoginPage loginPage;

    protected String passwordReal = "secret_sauce";
    protected String passwordFake = "Secret_Sauce";
    protected String standardUser = "standard_user";
    protected String lockedOutUser = "locked_out_user";

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver.", "C:\\chromedriver\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        loginPage = new LoginPage(driver, driverWait);

    }

    @BeforeMethod
    public void beforeMethod(){
        driver.get("https://www.saucedemo.com");
    }

    @AfterClass
    public void afterClass() throws InterruptedException {
        driver.quit();
    }
}