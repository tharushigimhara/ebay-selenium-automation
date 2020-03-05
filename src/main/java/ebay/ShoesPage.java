package ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

public class ShoesPage {

    @FindBy(linkText="Men\'s Shoes") private WebElement mensShoesElement;


    public MenShoesPage clickMensShoes(){

        TestApp.getInstance().waitForElement(By.linkText("Men\'s Shoes"), 20);
        mensShoesElement.click();
        return PageFactory.initElements(TestApp.getInstance().getDriver(),MenShoesPage.class);

    }
}
