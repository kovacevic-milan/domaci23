package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
    @FindBy (id = "user-name")
    private WebElement userName;

    @FindBy (id = "password")
    private WebElement password;

    @FindBy (id = "login-button")
    private WebElement logingButton;


    public LoginPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void login (String userName, String password){
        this.userName.clear();
        this.password.clear();
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        logingButton.submit();

    }
}


