package ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.TestApp;

public class HomePage {

    @FindBy(id = "gh-shop-a")
    private WebElement shopByCategoryElement;
    @FindBy(linkText = "Fashion")
    private WebElement fashionElement;

    public HomePage clickshopbycategory() {
        TestApp.getInstance().waitForElement(By.id("gh-shop-a"), 20);
        shopByCategoryElement.click();
        return this;
    }

    public HomePage clickfashion() {


        TestApp.getInstance().waitForElement((By.linkText("Fashion")), 20);
        fashionElement.click();
        return this;
    }


}
