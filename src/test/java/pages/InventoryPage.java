package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage extends BasePage{

    @FindBy (css = "button.btn.btn_primary.btn_small.btn_inventory[data-test='add-to-cart-sauce-labs-backpack']")
    private WebElement firstAddButton;

    @FindBy (xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
    private WebElement cartContainerValue;

    public InventoryPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void addFirstItemToCart (){
        driverWait.until(ExpectedConditions.visibilityOf(firstAddButton));
        firstAddButton.click();
    }

    public boolean getCartNumberStatus() {
        cartContainerValue.getText();
        System.out.println(cartContainerValue.getText());
        if(cartContainerValue.getText() != ""){
            return true;
        }
        return false;

    }
}