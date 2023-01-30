package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.InventoryPage;

public class InventoryTest extends BaseTest{

    private InventoryPage inventoryPage;

    @BeforeClass
    public void beforeClass(){
        super.beforeClass();
        inventoryPage = new InventoryPage(driver, driverWait);
    }
    @Test
    public void valueOfShoppingCart(){
        loginPage.login(standardUser, passwordReal);
        inventoryPage.addFirstItemToCart();
        Assert.assertTrue(inventoryPage.getCartNumberStatus());
    }


}