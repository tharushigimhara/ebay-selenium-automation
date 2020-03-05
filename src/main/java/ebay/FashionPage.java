package ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

public class FashionPage {

    @FindBy(linkText = "Shoes")
    private WebElement shoesElement;

    public ShoesPage clickshoes() {
        TestApp.getInstance().waitForElement(By.linkText("Shoes"), 20);
        shoesElement.click();
        return PageFactory.initElements(TestApp.getInstance().getDriver(), ShoesPage.class);
    }
}
